package model.bean;

public class FuncionarioComum {
	private static int id;
	private static String nome;
	private static String tipo;
	private static int especieResponsavel;
	private static String telefone;
	
	public FuncionarioComum(int id, String tipo, int especieResponsavel, String telefone) {
		this.id=id;
		this.tipo=tipo;
		this.especieResponsavel=especieResponsavel;
		
	}
	
	public FuncionarioComum(String tipo, int especieResponsavel, String telefone) {
		this.id=id;
		this.tipo=tipo;
		this.especieResponsavel=especieResponsavel;
		
	}
	
	
	public FuncionarioComum() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static String getNome() {
		return nome;
	}
	public static void setNome(String nome) {
		FuncionarioComum.nome = nome;
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		FuncionarioComum.id = id;
	}
	public static String getTipo() {
		return tipo;
	}
	public static void setTipo(String tipo) {
		FuncionarioComum.tipo = tipo;
	}
	public static int getEspecieResponsavel() {
		return especieResponsavel;
	}
	public static void setEspecieResponsavel(int especieResponsavel) {
		FuncionarioComum.especieResponsavel = especieResponsavel;
	}
	public static String getTelefone() {
		return telefone;
	}
	public static void setTelefone(String telefone) {
		FuncionarioComum.telefone = telefone;
	}
	
	
	
	
}
