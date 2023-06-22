package aulasJavaPOO.arrays;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainUsuario {


	public static void main(String[] args) {
		
		//Criando vetor para guardar objetos do tipo Usuario.
		ClasseUsuario usuarios[] = new ClasseUsuario[2];
		
		//Criando os objetos e guardando nas posições dentro do array.
		usuarios[0] = new ClasseUsuario("Camota", "root");
		
		usuarios[1] = new ClasseUsuario("Vitor", "root");
		
		for (ClasseUsuario usuario : usuarios) {
			System.out.println("Nome: " + usuario.getNome() + "\t");
			System.out.println("Data de cadastro: " + usuario.getDataCadastro() + "\t");	
			System.out.println("------------------");
		}
	
	}
	
}
