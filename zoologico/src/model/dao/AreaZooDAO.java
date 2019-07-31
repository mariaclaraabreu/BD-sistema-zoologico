package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.Alimentacao;
import model.bean.AreaZoo;
import model.bean.Equipamento;
import zoologico.Conexao;

public class AreaZooDAO {
	
private Connection con = Conexao.getConnection();
	
	
	public void inserir(AreaZoo al) {
		String sql = "insert into AreaZoo(tipoArea, subArea)values(?,?)";
		try(PreparedStatement preparestatement = con.prepareStatement(sql)) {
		
			
			preparestatement.setString(1, al.getTipoArea()); 
			preparestatement.setInt(2, al.getSubArea());  
	
	
			preparestatement.execute();
			preparestatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void alterar(AreaZoo al) {
		String sql = "update AreaZoo set tipoArea = ?, subArea = ? where id_area = ?";
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
			preparedStatement.setString(1, al.getTipoArea());
			preparedStatement.setInt(2, al.getSubArea());
			
			preparedStatement.setInt(3, al.getId());
			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	public void excluir(AreaZoo al) {
		String sql = "delete from AreaZoo where id_area = ?";
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
			preparedStatement.setInt(1, al.getId());
			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	public ArrayList <AreaZoo> buscarTodos(){
		ArrayList<AreaZoo> listarEqui = new ArrayList<>();
		
		String sql = "Select * from AreaZoo";
		//Equipamento eq = null ;
		
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)) {
			
			ResultSet result = preparedStatement.executeQuery();
			
			
			System.out.println("          AREAS          ");
	
			while(result.next()){
				AreaZoo al = new AreaZoo();
				
				System.out.println(result.getInt("id_area") + "   " +  result.getString("tipoArea") + "   " +  result.getInt("subArea") );
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
