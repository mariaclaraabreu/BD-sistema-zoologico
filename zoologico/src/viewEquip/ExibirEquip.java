package viewEquip;

import java.util.ArrayList;

import javax.swing.JFrame;

public class ExibirEquip extends JFrame{
	
	public ExibirEquip(ArrayList Listar) {
	for (int i=0; i<Listar.size();i++) {
		System.out.println(Listar.get(i));
	}
	}
	
	
	public static void main (String [] args) {
		
		//ExibirEquip ex  = new ExibirEquip()
	}
}

