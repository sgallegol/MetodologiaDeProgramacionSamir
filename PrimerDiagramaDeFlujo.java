package algoritmos.diagramas.flujo.programas.samir;

import java.util.Scanner;

public class PrimerDiagramaDeFlujo {
	
	
//	Construya un diagrama de  flujo tal que dado los datos ABCD  que  representan numeros enteros,
//	escriba los mismo en orden inverso
	
	public static void main(String[] args) {
		
		int A,B,C,D;
		Scanner tc=new Scanner(System.in);
		System.out.println("ingrese los datos a mostrar en orden inverso");
		System.out.println("ingrese A");
		A=tc.nextInt();
		System.out.println("ingrese B");
		B=tc.nextInt();
		System.out.println("ingrese C");
		C=tc.nextInt();
		System.out.println("ingrese D");
		D=tc.nextInt();
		
		
		
		
		System.out.printf("Los numeros en orden inverso serian: "+ D +" " +C + " "+ B +" " +A);
		
		
		
		
		
		
	}
	

}
