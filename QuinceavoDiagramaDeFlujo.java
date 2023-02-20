package algoritmos.diagramas.flujo.programas.samir;

import java.util.Scanner;

public class QuinceavoDiagramaDeFlujo {
	
	//Construya un diagrama de flujo talq ue dado como datos los  valorfes enteros P Y Q
	//determine si los mismos satisfacen la siguiente expresión
	//P**3 + Q**4-2*P**2<680
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.println("Bienvenido a la aplicacion de validacioin de función");
		int p,q;
		System.out.println("Ingrese el valor de Q");
		q=tc.nextInt();
		System.out.println("Ingrese el valor de P");
		p=tc.nextInt();
		double variableAux=(p*p*p + q*q*q*q -(2*p*p));
		if((variableAux)<680) {
			System.out.println("Los valores de P y  Q son:\n" + p+"\n" + q+"\n"+"Y la variable auxiliar es:" + variableAux);
		}else {
			System.out.println("No se satisface la condicion");
		}
		tc.close();
		
		
		
	}
	
	
	

}
