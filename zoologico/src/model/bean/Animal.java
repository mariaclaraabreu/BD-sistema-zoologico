package model.bean;

import java.sql.Date;

public class Animal {
	private static int id;
	private static String nome;
	private static String sexo;
	private static String doadoOuComprado;
	private static String lugarOrigem;
	private static String dataChegada;
	private static String horariosBanho;
	
	private static int alimentacao;
	private static int veterinario;
	private static int equipamentoNecessario;
	
	
	
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Animal(int id, String nome, String sexo, String douadoOuComprado, String lugarOrigem, String dataChegada, String horariosBanho, int alimentacao, int veterinario, int equipamentoNecessario) {
		this.id=id;
		this.nome=nome;
		this.sexo=sexo;
		this.doadoOuComprado=doadoOuComprado;
		this.lugarOrigem=lugarOrigem;
		this.dataChegada=dataChegada;
		this.horariosBanho=horariosBanho;
		this.alimentacao=alimentacao;
		this.veterinario=veterinario;
		this.equipamentoNecessario = equipamentoNecessario;
	}
	
	
	public Animal(String nome, String sexo, String douadoOuComprado, String lugarOrigem, String dataChegada, String horariosBanho, int alimentacao, int veterinario, int equipamentoNecessario) {
		this.nome=nome;
		this.sexo=sexo;
		this.doadoOuComprado=doadoOuComprado;
		this.lugarOrigem=lugarOrigem;
		this.dataChegada=dataChegada;
		this.horariosBanho=horariosBanho;
		this.alimentacao=alimentacao;
		this.veterinario=veterinario;
		this.equipamentoNecessario = equipamentoNecessario;
	}
	
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Animal.id = id;
	}
	public static String getNome() {
		return nome;
	}
	public static void setNome(String nome) {
		Animal.nome = nome;
	}
	public static String getSexo() {
		return sexo;
	}
	public static void setSexo(String sexo) {
		Animal.sexo = sexo;
	}
	public static String getDoadoOuComprado() {
		return doadoOuComprado;
	}
	public static void setDoadoOuComprado(String doadoOuComprado) {
		Animal.doadoOuComprado = doadoOuComprado;
	}
	public static String getLugarOrigem() {
		return lugarOrigem;
	}
	public static void setLugarOrigem(String lugarOrigem) {
		Animal.lugarOrigem = lugarOrigem;
	}
	public static String getDataChegada() {
		return dataChegada;
	}
	public static void setDataChegada(String dataChegada) {
		Animal.dataChegada = dataChegada;
	}
	public static String getHorariosBanho() {
		return horariosBanho;
	}
	public static void setHorariosBanho(String horariosBanho) {
		Animal.horariosBanho = horariosBanho;
	}
	public static int getAlimentacao() {
		return alimentacao;
	}
	public static void setAlimentacao(int alimentacao) {
		Animal.alimentacao = alimentacao;
	}
	public static int getVeterinario() {
		return veterinario;
	}
	public static void setVeterinario(int veterinario) {
		Animal.veterinario = veterinario;
	}
	public static int getEquipamentoNecessario() {
		return equipamentoNecessario;
	}
	public static void setEquipamentoNecessario(int equipamentoNecessario) {
		Animal.equipamentoNecessario = equipamentoNecessario;
	}
	
	
	
}
