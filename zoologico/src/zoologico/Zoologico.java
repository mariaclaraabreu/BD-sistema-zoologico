package zoologico;

import java.util.Scanner;

import model.dao.AlimentacaoDAO;
import model.dao.AnimalDAO;
import model.dao.AreaZooDAO;
import model.dao.ConsultaDAO;
import model.dao.EquipamentoDAO;
import model.dao.EspecieDAO;
import model.dao.FornecedorDAO;
import model.dao.FuncionarioComumDAO;
import model.dao.SubAreaZooDAO;
import model.dao.VeterinarioDAO;
import viewEquip.ExibirEquip;
import model.bean.Alimentacao;
import model.bean.Animal;
import model.bean.Equipamento;

//#trigger 
//#visão


public class Zoologico {
	public static void main (String [] args) {
		System.out.println("BEM VINDO AO ZOOLOGICO DA MARIA");
		Conexao con = new Conexao();
		//Equipamento eq = new Equipamento();
		EquipamentoDAO eqd = new EquipamentoDAO();
		VeterinarioDAO vet = new VeterinarioDAO();
		FornecedorDAO forn = new FornecedorDAO();
		AnimalDAO an = new AnimalDAO();
		FuncionarioComumDAO fc = new FuncionarioComumDAO();
		ConsultaDAO cons = new ConsultaDAO();
		AlimentacaoDAO al = new AlimentacaoDAO();
		AreaZooDAO az = new AreaZooDAO();
		EspecieDAO es = new EspecieDAO();
		SubAreaZooDAO sb = new SubAreaZooDAO();
		
		//Equipamento eqb = new Equipamento(7);
		
		
		
		con.getConnection();
		
		//con.getConnection();
		
		//con.conectar();
		//if (con.estaConectado()) {
			
			//System.out.println("ENTROU NO BANCO");
			//eqd.excluir(eqb);
		
		//eqd.buscarTodos();
		Alimentacao all = new Alimentacao ("Plantada", 1, "10 hrs e 15 hrs", 3.90);
		Animal ann = new Animal();
		
		//ExibirEquip ex = new ExibirEquip(ListarEqui);
		
		
		
		//al.inserir(all);
		//an.buscarTodos();
			
			//eq.inserirEquipamento("Pegar");
			//eq.listarEquipamentos();
		
			
		//}else {
		//	System.out.println("Não foi possivel conectar ao banco de dados!");
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
