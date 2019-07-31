package model.dao;

import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.Equipamento;
import zoologico.Conexao;

public class EquipamentoDAO {
	private Connection con = Conexao.getConnection();
	ArrayList<Equipamento> listarEqui = new ArrayList<>();
	
	
	public void inserir(Equipamento eq) {
		String sql = "insert into Equipamento(finalidade)values(?)";
		try(PreparedStatement preparestatement = con.prepareStatement(sql)) {
			
			preparestatement.setString(1, eq.getFinalidade()); //substitui o ? pelo dado do usuario
			//preparestatement.setString(2, usuario.getLogin());
			//preparestatement.setString(3, usuario.getSenha());
			
			//executando comando sql
			preparestatement.execute();
			preparestatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void alterar(Equipamento eq) {
		String sql = "update Equipamento set finalidade = ? where id_equipamento = ?";
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
			preparedStatement.setString(1, Equipamento.getFinalidade());
			preparedStatement.setInt(2, Equipamento.getId());
			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	public void excluir(Equipamento eq) {
		String sql = "delete from Equipamento where id_equipamento = ?";
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
			preparedStatement.setInt(1, Equipamento.getId());
			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	public ArrayList <Equipamento> buscarTodos(){
		
		
		String sql = "Select * from Equipamento";
		Equipamento eq = null ;
		
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)) {
			
			ResultSet result = preparedStatement.executeQuery();
			
			/*
			 * Dentro do while estou verificando se tem registro no banco de dados, enquanto tiver registro vai 
			 * adcionando um a um na lista e no final fora do while retorna todos os registro encontrados. 
			 */
			System.out.println("          EQUIPAMENTOS          ");
			System.out.println("ID  FINALIDADE");
			while(result.next()){
				eq = new Equipamento();
				
				System.out.println(result.getInt("id_equipamento") + "   " +  result.getString("finalidade"));
				
				eq.setId(result.getInt("id_equipamento"));
				eq.setFinalidade(result.getString("finalidade"));
				
				// Adcionando cada registro encontro, na lista .
				listarEqui.add(eq);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listarEqui;
	}
	

	
	
	
	
}
