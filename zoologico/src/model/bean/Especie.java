package model.bean;

public class Especie {
	private static int id;
	private static String nome;
	private static int animal;
	
	
	
	
	public Especie() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Especie(int id, String nome, int animal) {
		this.id=id;
		this.nome=nome;
		this.animal=animal;
	}
	
	public Especie(String nome, int animal) {
		this.id=id;
		this.nome=nome;
		this.animal=animal;
	}
	
	
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Especie.id = id;
	}
	public static String getNome() {
		return nome;
	}
	public static void setNome(String nome) {
		Especie.nome = nome;
	}
	public static int getAnimal() {
		return animal;
	}
	public static void setAnimal(int animal) {
		Especie.animal = animal;
	}
	
	
	
	
}
