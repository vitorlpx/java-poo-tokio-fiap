package aulasJavaPOO.arrays;

public class Arrays {

	public static void main(String[] args) {
		
		int[] x = new int[10];
		lerVetor(x);
		imprimirVetor(x);
		
	}
	
	//Método para atribuição de valores no vetor.
	public static void lerVetor(int[] x) {
		//x.length é o tamanho do vetor.
		for (int i = 0; i < x.length; i++) {
			//multiplica pela posição.
			x[i] = 2 * i;
		}
	}
	
	//Método para imprimir o vetor.
	public static void imprimirVetor(int[] x ) {
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i] + "\t");
		}
	}

}
