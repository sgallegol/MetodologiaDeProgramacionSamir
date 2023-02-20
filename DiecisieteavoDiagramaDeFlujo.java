package algoritmos.diagramas.flujo.programas.samir;

import java.util.Scanner;

public class DiecisieteavoDiagramaDeFlujo {
	// Construya un diagrama de flujo tal que dado datos de entrada tres números
	// enteros
	// determine si los mismos están en orden creciente

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.println("Bienvenido a la aplicaciíon");
		System.out.println("Ingrese tres numeros\n" + "Ingrese primer numero");
		int numero1 = tc.nextInt();
		System.out.println("Ingrese el segundo número");
		int numero2 = tc.nextInt();
		System.out.println("Ingrese el tercer número");
		int numero3 = tc.nextInt();
		if(numero1<numero2) {
			if(numero2<numero3) {
				System.out.println("Los números en orden creciente son:\n"+ numero1+"\n"+numero2+"\n"+numero3);
				
			}else {
				System.out.println("Los numeros no estan en orden creciente");
			}
		}else {
			System.out.println("Los numeros no estan en orden creciente");
		}
		tc.close();

	}

}
