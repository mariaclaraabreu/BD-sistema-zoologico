package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.AreaZoo;
import model.bean.SubAreaZoo;
import zoologico.Conexao;

public class SubAreaZooDAO {
	
private Connection con = Conexao.getConnection();
	
	
	public void inserir(SubAreaZoo al) {
		String sql = "insert into SubAreaZoo(animal)values(?)";
		try(PreparedStatement preparestatement = con.prepareStatement(sql)) {
		
			
			preparestatement.setInt(1, al.getAnimal()); 
		  
	
	
			preparestatement.execute();
			preparestatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void alterar(SubAreaZoo al) {
		String sql = "update SubAreaZoo set Animal = ? where numero = ?";
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
			preparedStatement.setInt(1, al.getAnimal());
			preparedStatement.setInt(3, al.getNumero());
			
			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	public void excluir(SubAreaZoo al) {
		String sql = "delete from SubAreaZoo where numero = ?";
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
			preparedStatement.setInt(1, al.getNumero());
			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	public ArrayList <SubAreaZoo> buscarTodos(){
		ArrayList<SubAreaZoo> listarEqui = new ArrayList<>();
		
		String sql = "Select * from AreaZoo";
		//Equipamento eq = null ;
		
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)) {
			
			ResultSet result = preparedStatement.executeQuery();
			
			
			System.out.println("          AREAS          ");
	
			while(result.next()){
				AreaZoo al = new AreaZoo();
				
				System.out.println(result.getInt("numero") + "   " +  result.getString("animal")  );
				//al.setId(result.getInt("id_equipamento"))
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
