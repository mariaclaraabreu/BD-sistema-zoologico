package model.bean;

public class Equipamento {
	private static String finalidade;
	private static int id;
	

	public static int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static String getFinalidade() {
		return finalidade;
	}

	public void setFinalidade(String finalidade) {
		this.finalidade = finalidade;
	}
	
	
	public Equipamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Equipamento(int id,String finalidade) {
		super();
		this.finalidade = finalidade;
		this.id = id;
	}
	
	public Equipamento(int id) {
		super();
		this.id = id;
	}

	public Equipamento(String finalidade) {
		super();
		this.finalidade = finalidade;
	}
	
	
	
	
	
}
