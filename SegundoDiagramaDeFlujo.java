package algoritmos.diagramas.flujo.programas.samir;

import java.util.Scanner;

public class SegundoDiagramaDeFlujo {

	// Construya un diagrama de flujo tal que dado los datos enteros A y B, escriba
	// el resultado de la siguiente expresion
	// (A+B)*2/3

	// datos de entrada
	public static void main(String[] args) {

		Float A, B;
		//Float resul;
		Scanner tc = new Scanner(System.in);
		System.out.println("ingrese los datos A y B");
		System.out.println("Ingrese A");
		Proceso(tc);

	}

	private static void Proceso(Scanner tc) {
		Float A;
		Float B;
		Float resul;
		A = tc.nextFloat();
		System.out.println("Ingrese B");
		B = tc.nextFloat();

		 resul = ((A + B) * (A + B))/ 3;
		 System.out.println("el resultado del proceso es:" + resul);
		 
		
	}

}
