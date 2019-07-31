package model.bean;

public class Veterinario {
	private static String nome;
	private static int id;
	
	public Veterinario(String nome, int id) {
		this.nome=nome;
		this.id=id;
		
	}
	
	public Veterinario(String nome) {
		this.nome=nome;
		
	}
		
	public Veterinario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public static String getNome() {
		return nome;
	}

	public static void setNome(String nome) {
		Veterinario.nome = nome;
	}

	public static int getId() {
		return id;
	}

	public static void setId(int id) {
		Veterinario.id = id;
	}
	
	
}
