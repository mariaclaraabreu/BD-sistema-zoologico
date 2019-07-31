package model.bean;

public class AreaZoo {
	private static int id;
	private static String tipoArea;
	private static int subArea;
	public static int getId() {
		return id;
	}
	public static void setId(int id) {
		AreaZoo.id = id;
	}
	public static String getTipoArea() {
		return tipoArea;
	}
	public static void setTipoArea(String tipoArea) {
		AreaZoo.tipoArea = tipoArea;
	}
	public static int getSubArea() {
		return subArea;
	}
	public static void setSubArea(int subArea) {
		AreaZoo.subArea = subArea;
	}
	public AreaZoo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public AreaZoo(int id, String tipoArea, int subArea) {
		this.id=id;
		this.tipoArea=tipoArea;
		this.subArea=subArea;
	}
	
	public AreaZoo(String tipoArea, int subArea) {
		this.id=id;
		this.tipoArea=tipoArea;
		this.subArea=subArea;
	}
	
	
	
}
