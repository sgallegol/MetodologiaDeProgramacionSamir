package algoritmos.diagramas.flujo.programas.samir;

import java.util.Scanner;

public class CuartoDiagramaDeFlujo {

	// Escriba un diagrama de flujo que permita calcular e imprimir el cuadrado
	// y el cubo de un numero entero positivo

	public static void main(String[] args) {
		int num;
		
		System.out.println("¡Bienvenido al programa que  le genera el cuadrado y el cubo del numero que ingrese!");
		Scanner tc=new Scanner(System.in);
         cuadrado(tc);
	
		
		//cubo_num=(num)*(num)*(num);
		

	}
	
	private static  void cuadrado(Scanner tc) {
		int num;
		int cuadrado_num;
		int cubo_num;
		
		System.out.println("Ingrese un numero entero:\n");
		num=tc.nextInt();
	  cuadrado_num=(num)*(num);
	 cubo_num=(num)*(num)*(num);
	  System.out.println("A continuación encontrara el cuadrado y el cubo del numero que ingreso:\n" +"cuadrado\n"+ cuadrado_num+ "\n"+"cubo:\n"+cubo_num);
		
	}

}
