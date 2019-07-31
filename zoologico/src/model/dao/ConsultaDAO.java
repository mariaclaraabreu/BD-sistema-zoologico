package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.Alimentacao;
import model.bean.Consulta;
import model.bean.Equipamento;
import zoologico.Conexao;

public class ConsultaDAO {
	private Connection con = Conexao.getConnection();
	
	
	public void inserir(Consulta al) {
		String sql = "insert into Consulta(tipoProcedimento, dataProcedimento, especie, veterinario)values(?,?,?,?)";
		try(PreparedStatement preparestatement = con.prepareStatement(sql)) {
		
			
			preparestatement.setString(1, al.getTipoProcedimento()); 
			preparestatement.setString(2, al.getDataProcedimento());  
			preparestatement.setInt(3, al.getEspecie());
			preparestatement.setDouble(4, al.getVeterinario()); 
	
			preparestatement.execute();
			preparestatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void alterar(Consulta al) {
		String sql = "update Consulta set tipoProcedimento = ?, dataProcedimento = ?, especie = ?, veterinario = ? where id_consulta = ?";
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
			preparedStatement.setString(1, al.getTipoProcedimento());
			preparedStatement.setString(2, al.getDataProcedimento());
			preparedStatement.setInt(3, al.getEspecie());
			preparedStatement.setDouble(4, al.getVeterinario());
			preparedStatement.setInt(5, al.getId());
			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	public void excluir(Consulta al) {
		String sql = "delete from Consulta where id_consulta = ?";
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
			preparedStatement.setInt(1, al.getId());
			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	public ArrayList <Consulta> buscarTodos(){
		ArrayList<Consulta> listarEqui = new ArrayList<>();
		
		String sql = "Select * from Consulta";
		Equipamento eq = null ;
		
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)) {
			
			ResultSet result = preparedStatement.executeQuery();
			
			
			System.out.println("         CONSULTAS          ");
	
			while(result.next()){
				Alimentacao al = new Alimentacao();
				
				System.out.println(result.getInt("id_consulta") + "   " +  result.getString("tipoProcedimento") + "   " +  result.getInt("dataProcedimento") + " " + result.getString("especie") + " " + result.getDouble("veterinario")  );
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
