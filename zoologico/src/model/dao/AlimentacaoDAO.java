package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.Alimentacao;
import model.bean.Equipamento;
import model.bean.Fornecedor;
import zoologico.Conexao;

public class AlimentacaoDAO {
	private Connection con = Conexao.getConnection();
	
	
	public void inserir(Alimentacao al) {
		String sql = "insert into Alimentacao(tipo, fornecedor, horarios, peso)values(?,?,?,?)";
		try(PreparedStatement preparestatement = con.prepareStatement(sql)) {
		
			
			preparestatement.setString(1, al.getTipo()); 
			preparestatement.setInt(2, al.getFornecedor());  
			preparestatement.setString(3, al.getHorarios());
			preparestatement.setDouble(4, al.getPeso()); 
	
			preparestatement.execute();
			preparestatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void alterar(Alimentacao al) {
		String sql = "update Alimentacao set tipo = ?, fornecedor = ?, horarios = ?, peso = ? where id_alimentacao = ?";
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
			preparedStatement.setString(1, Alimentacao.getTipo());
			preparedStatement.setInt(2, Alimentacao.getFornecedor());
			preparedStatement.setString(3, Alimentacao.getHorarios());
			preparedStatement.setDouble(4, Alimentacao.getPeso());
			preparedStatement.setInt(5, Alimentacao.getId());
			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	public void excluir(Alimentacao al) {
		String sql = "delete from where id_alimentacao = ?";
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
			preparedStatement.setInt(1, Alimentacao.getId());
			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		
		}
	}

	
	
	
	public ArrayList <Alimentacao> buscarTodos(){
		ArrayList<Alimentacao> listarEqui = new ArrayList<>();
		
		String sql = "Select * from Alimentacao";
		
		Equipamento eq = null ;
		
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)) {
			
			ResultSet result = preparedStatement.executeQuery();
			
			
			System.out.println("          ALIMENTAÇÃO          ");
	
			while(result.next()){
				Alimentacao al = new Alimentacao();
				
				System.out.println(result.getInt("id_alimentacao") + "   " +  result.getString("tipo") + "   " +  result.getInt("fornecedor") + " " + result.getString("horarios") + " " + result.getDouble("peso")  );
				//al.setId(result.getInt("id_equipamento"));
				//al.setFinalidade(result.getString("finalidade"));
				
				// Adcionando cada registro encontro, na lista .
				//listarEqui.add(eq);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listarEqui;
	}
	
}
