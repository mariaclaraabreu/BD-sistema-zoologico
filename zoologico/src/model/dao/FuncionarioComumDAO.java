package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.Alimentacao;
import model.bean.Equipamento;
import model.bean.FuncionarioComum;
import zoologico.Conexao;

public class FuncionarioComumDAO {
	private Connection con = Conexao.getConnection();
	
	public void inserir(FuncionarioComum al) {
		String sql = "insert into FuncionarioComum(nome,tipo, especieResponsavel, telefone)values(?,?,?,?)";
		try(PreparedStatement preparestatement = con.prepareStatement(sql)) {
		
			
			preparestatement.setString(1, al.getNome()); 
			preparestatement.setString(2, al.getTipo());  
			preparestatement.setInt(3, al.getEspecieResponsavel());
			preparestatement.setString(4, al.getTelefone()); 
	
			preparestatement.execute();
			preparestatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void alterar(FuncionarioComum al) {
		String sql = "update FuncionarioComum set nome = ?, tipo = ?, especieResponsavel = ?, telefone = ? where id_funcionario = ?";
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
			preparedStatement.setString(1, al.getNome());
			preparedStatement.setString(2, al.getTipo());
			preparedStatement.setInt(3, al.getEspecieResponsavel());
			preparedStatement.setString(4, al.getTelefone());
			preparedStatement.setInt(5, al.getId());
			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	public void excluir(FuncionarioComum al) {
		String sql = "delete from FuncionarioComum where id_funcionario = ?";
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
			preparedStatement.setInt(1, al.getId());
			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	public ArrayList <FuncionarioComum> buscarTodos(){
		ArrayList<FuncionarioComum> listarEqui = new ArrayList<>();
		
		String sql = "Select * from FuncionarioComum";
		Equipamento eq = null ;
		
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)) {
			
			ResultSet result = preparedStatement.executeQuery();
			
			
			System.out.println("          FUNCIONARIOS         ");
	
			while(result.next()){
				Alimentacao al = new Alimentacao();
				
				System.out.println(result.getInt("id_funcionario") + "   " +  result.getString("nome") + "   " +  result.getInt("tipo") + " " + result.getString("especieResponsavel") + " " + result.getDouble("telefone")  );
				//al.setId(result.getInt("      id_equipamento"));
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
