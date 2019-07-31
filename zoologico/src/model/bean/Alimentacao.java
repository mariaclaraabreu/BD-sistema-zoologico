package model.bean;

public class Alimentacao {
	private static int id;
	private static String tipo;
	private static int fornecedor;
	private static String horarios;
	private static double peso;
	
	
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Alimentacao.id = id;
	}
	public static String getTipo() {
		return tipo;
	}
	public static void setTipo(String tipo) {
		Alimentacao.tipo = tipo;
	}
	public static int getFornecedor() {
		return fornecedor;
	}
	public static void setFornecedor(int fornecedor) {
		Alimentacao.fornecedor = fornecedor;
	}
	public static String getHorarios() {
		return horarios;
	}
	public static void setHorarios(String horarios) {
		Alimentacao.horarios = horarios;
	}
	public static double getPeso() {
		return peso;
	}
	public static void setPeso(double peso) {
		Alimentacao.peso = peso;
	}
	public Alimentacao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Alimentacao(int id, String tipo, int fornecedor, String horarios, double peso) {
		this.id= id;
		this.tipo=tipo;
		this.fornecedor = fornecedor;
		this.horarios=horarios;
		this.peso=peso;
	}
	
	public Alimentacao(String tipo, int fornecedor, String horarios, double peso) {
		this.id= id;
		this.tipo=tipo;
		this.fornecedor = fornecedor;
		this.horarios=horarios;
		this.peso=peso;
	}
	
	
	
	
	
	
	
	
}
