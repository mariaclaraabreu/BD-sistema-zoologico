package model.bean;

public class SubAreaZoo {
	private static int numero;
	private static int animal;
	
	public SubAreaZoo(int numero, int animal) {
		this.numero=numero;
		this.animal=animal;
	}
	
	public SubAreaZoo(int animal) {
		this.animal=animal;
	}
	
	
	public SubAreaZoo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public static int getNumero() {
		return numero;
	}
	public static void setNumero(int numero) {
		SubAreaZoo.numero = numero;
	}
	public static int getAnimal() {
		return animal;
	}
	public static void setAnimal(int animal) {
		SubAreaZoo.animal = animal;
	}
	
	
}
