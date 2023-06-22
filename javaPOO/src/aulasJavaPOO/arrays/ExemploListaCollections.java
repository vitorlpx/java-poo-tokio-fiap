package aulasJavaPOO.arrays;

import java.util.ArrayList;
import java.util.List;

public class ExemploListaCollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> lista = new ArrayList<String>();
		lista.add("Pedro");
		lista.add("Camota");
		lista.add("Dandara");
		lista.add(null);
		lista.add("Dandara");
		
		for (String list: lista) {
			System.out.println("Nome dos usuários: " + list);
		}
	
	}

}
