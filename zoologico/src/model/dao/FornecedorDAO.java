package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.AreaZoo;
import model.bean.Especie;
import model.bean.Fornecedor;
import zoologico.Conexao;

public class FornecedorDAO {
	
private Connection con = Conexao.getConnection();
	
	
	public void inserir(Fornecedor al) {
		String sql = "insert into Fornecedor(nome, telefone, tipoProduto)values(?,?,?)";
		try(PreparedStatement preparestatement = con.prepareStatement(sql)) {
		
			preparestatement.setString(1, al.getNome()); 
			preparestatement.setString(2, al.getTelefone());  
			preparestatement.setString(3, al.getTipoProduto()); 
	

			preparestatement.execute();
			preparestatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void alterar(Fornecedor al) {
		String sql = "update Fornecedor set nome = ?, telefone = ?, tipoProduto = ? where id_fornecedor = ?";
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
			preparedStatement.setString(1, al.getNome());
			preparedStatement.setString(2, al.getTelefone());
			preparedStatement.setString(3, al.getTipoProduto());
			preparedStatement.setInt(4, al.getId());
			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	public void excluir(Fornecedor al) {
		String sql = "delete from Fornecedor where id_fornecedor = ?";
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
			preparedStatement.setInt(1, al.getId());
			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	public ArrayList <Fornecedor> buscarTodos(){
		ArrayList<Fornecedor> listarEqui = new ArrayList<>();
		
		String sql = "Select * from AreaZoo";
		//Equipamento eq = null ;
		
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)) {
			
			ResultSet result = preparedStatement.executeQuery();
			
			
			System.out.println("          FORNECEDORES          ");
	
			while(result.next()){
				AreaZoo al = new AreaZoo();
				
				System.out.println(result.getInt("id_fornecedor") + "   " +  result.getString("nome") + "   " +  result.getInt("telefone") + " " + result.getInt("tipoProduto") );
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
