package model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.bean.Alimentacao;
import model.bean.Animal;
import model.bean.Equipamento;
import zoologico.Conexao;

public class AnimalDAO {
private Connection con = Conexao.getConnection();
	
	public void inserir(Animal al) {
		String sql = "insert into Animal(nome, sexo, doadoOuComprado, lugarOrigem, dataChegada, horariosBanho, alimentacao, veterinario, equipamentoNecessario) values(?,?,?,?,?,?,?,?,?)";
		try(PreparedStatement preparestatement = con.prepareStatement(sql)) {
		
			
			preparestatement.setString(1, al.getNome()); 
			preparestatement.setString(2, al.getSexo());  
			preparestatement.setString(3, al.getDoadoOuComprado());
			preparestatement.setString(4, al.getLugarOrigem()); 
			preparestatement.setString(5, al.getDataChegada());
			preparestatement.setString(6, al.getHorariosBanho());
			preparestatement.setInt(7, al.getAlimentacao());
			preparestatement.setInt(8, al.getVeterinario()); 
			preparestatement.setInt(9, al.getEquipamentoNecessario()); 
	
			preparestatement.execute();
			preparestatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void alterar(Animal al) {
		String sql = "update Animal set nome = ?, sexo = ?, doadoOuComprado = ?, lugarOrigem = ?, dataChegada = ?, horariosBanho = ?, alimentacao = ?, veterinario = ?, equipamentoNecessario = ? where id_animal = ?";
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
			
			preparedStatement.setString(1, al.getNome()); 
			preparedStatement.setString(2, al.getSexo());  
			preparedStatement.setString(3, al.getDoadoOuComprado());
			preparedStatement.setString(4, al.getLugarOrigem()); 
			preparedStatement.setString(5, al.getDataChegada());
			preparedStatement.setString(6, al.getHorariosBanho());
			preparedStatement.setInt(7, al.getAlimentacao());
			preparedStatement.setInt(8, al.getVeterinario()); 
			preparedStatement.setInt(9, al.getEquipamentoNecessario()); 
			
			preparedStatement.setInt(10, al.getId());
			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	public void excluir(Animal al) {
		String sql = "delete from Animal where id_animal = ?";
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)){
			preparedStatement.setInt(1, Animal.getId());
			preparedStatement.execute();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
	
	
	public ArrayList <Animal> buscarTodos(){
		ArrayList<Animal> listarEqui = new ArrayList<>();
		
		String sql = "Select * from Alimentacao";
		Equipamento eq = null ;
		
		try(PreparedStatement preparedStatement = con.prepareStatement(sql)) {
			
			ResultSet result = preparedStatement.executeQuery();
			
			
			System.out.println("          ANIMAIS         ");
	
			while(result.next()){
				Alimentacao al = new Alimentacao();
				
				System.out.println(result.getInt("id_animal") + "   " +  result.getString("nome") + "   " +  result.getInt("sexo") + " " + result.getString("doadoOuComprado") + " " + result.getDouble("lugarOrigem")  + " " + result.getInt("dataChegada") + " " + result.getInt("horariosBanho") + "  "+ result.getInt("alimentacao") + "  " +  result.getInt("veterinario") + "  " + result.getInt("equipamentoNecessario"));
				//al.setId(result.getInt("id_equipamento"));
				//al.setFinalidade(result.getString("finalidade"));
				
		
				//listarEqui.add(eq);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listarEqui;
	}
}
