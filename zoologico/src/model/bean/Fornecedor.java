package model.bean;

public class Fornecedor {
	private static int id;
	private static String nome;
	private static String telefone;
	private static String tipoProduto;
	
	
	public Fornecedor(int id, String nome, String telefone, String tipoProduto) {
		this.id=id;
		this.nome=nome;
		this.telefone=telefone;
		this.tipoProduto=tipoProduto;
	}
	
	public Fornecedor(String nome, String telefone, String tipoProduto) {
		this.nome=nome;
		this.telefone=telefone;
		this.tipoProduto=tipoProduto;
	}
	
	
	public Fornecedor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Fornecedor.id = id;
	}
	public static String getNome() {
		return nome;
	}
	public static void setNome(String nome) {
		Fornecedor.nome = nome;
	}
	public static String getTelefone() {
		return telefone;
	}
	public static void setTelefone(String telefone) {
		Fornecedor.telefone = telefone;
	}
	public static String getTipoProduto() {
		return tipoProduto;
	}
	public static void setTipoProduto(String tipoProduto) {
		Fornecedor.tipoProduto = tipoProduto;
	}

	public Object getFornecedor() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
