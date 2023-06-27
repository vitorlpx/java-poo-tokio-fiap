package aulasJavaPOO.exercicios.aulaCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Teste {

	public static void main(String[] args) {

		Usuario emerson = new Usuario(1, "Emerson", "abc");
		Usuario adriane = new Usuario(2, "Adriane", "abc");
		Usuario maria = new Usuario(3, "Maria", "abc");
		Usuario joao = new Usuario(4, "Joao", "abc");
		Usuario pedro = new Usuario(5, "Pedro", "abc");
		
		List<Usuario> listaUsuarios = new ArrayList<Usuario>();
		
		listaUsuarios.add(pedro);
		listaUsuarios.add(adriane);
		listaUsuarios.add(maria);
		listaUsuarios.add(joao);
		listaUsuarios.add(pedro);
		
		//Iterando a lista
		for (Usuario usuario: listaUsuarios) {
			System.out.println("ID: " + usuario.getIdUsuario() + " -- Nome: " +usuario.getNome());
		}
		
		//Ordenar a lista conforme regra defina no compareTO
		Collections.sort(listaUsuarios);
		
		//Iterando a lista ordenada.
		for (Usuario usuario: listaUsuarios) {
			System.out.println("ID: " + usuario.getIdUsuario() + " -- Nome: " +usuario.getNome());
		}
		
//		Map mapa = new HashMap();
//		mapa.put("Joao", joao);
		
		
	}

}
