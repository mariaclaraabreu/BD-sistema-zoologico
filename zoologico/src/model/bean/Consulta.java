package model.bean;

import java.sql.Date;

public class Consulta {
	private static int id;
	private static String tipoProcedimento;
	private static String dataProcedimento;
	private static int especie;
	private static int veterinario;
	
	
	
	public Consulta() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Consulta(int id, String tipoProcedimento, String dataProcedimento, int especie, int veterinario) {
		this.id=id;
		this.tipoProcedimento=tipoProcedimento;
		this.dataProcedimento=dataProcedimento;
		this.especie=especie;
		this.veterinario=veterinario;
	}
	
	public Consulta(String tipoProcedimento, String dataProcedimento, int especie, int veterinario) {
		this.tipoProcedimento=tipoProcedimento;
		this.dataProcedimento=dataProcedimento;
		this.especie=especie;
		this.veterinario=veterinario;
	}
	
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		Consulta.id = id;
	}
	public static String getTipoProcedimento() {
		return tipoProcedimento;
	}
	public static void setTipoProcedimento(String tipoProcedimento) {
		Consulta.tipoProcedimento = tipoProcedimento;
	}
	public static String getDataProcedimento() {
		return dataProcedimento;
	}
	public static void setDataProcedimento(String dataProcedimento) {
		Consulta.dataProcedimento = dataProcedimento;
	}
	public static int getEspecie() {
		return especie;
	}
	public static void setEspecie(int especie) {
		Consulta.especie = especie;
	}
	public static int getVeterinario() {
		return veterinario;
	}
	public static void setVeterinario(int veterinario) {
		Consulta.veterinario = veterinario;
	}
	
	
	
	
}
