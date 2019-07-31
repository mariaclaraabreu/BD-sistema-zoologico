package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.AreaZoo;
import model.bean.Especie;
import zoologico.Conexao;

public class EspecieDAO {
	
private Connection con = Conexao.getConnection();
	
	
	public void inserir(Especie al) {
		String sql = "insert into Especie(nome, animal)values(?,?)";
		try(PreparedStatement preparestatement = con.prepareStatement(sql)) {
		
			
			preparestatement.setString(1, al.getNome()); 
			preparestatement.setInt(2, al.getAnimal());  
	
	
			preparestatement.execute();
			preparestatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void alterar(Especie al) {
		String sql = "update Especie set nome = ?, animal = ? where id_especie = ?";
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
			preparedStatement.setString(1, al.getNome());
			preparedStatement.setInt(2, al.getAnimal());
			
			preparedStatement.setInt(3, al.getId());
			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	public void excluir(Especie al) {
		String sql = "delete from Especie where id_especie = ?";
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
			preparedStatement.setInt(1, al.getId());
			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	public ArrayList <Especie> buscarTodos(){
		ArrayList<Especie> listarEqui = new ArrayList<>();
		
		String sql = "Select * from AreaZoo";
		//Equipamento eq = null ;
		
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)) {
			
			ResultSet result = preparedStatement.executeQuery();
			
			
			System.out.println("          ESPECIES         ");
	
			while(result.next()){
				AreaZoo al = new AreaZoo();
				
				System.out.println(result.getInt("id_especie") + "   " +  result.getString("nome") + "   " +  result.getInt("animal") );
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
