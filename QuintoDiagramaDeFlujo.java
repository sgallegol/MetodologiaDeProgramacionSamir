package algoritmos.diagramas.flujo.programas.samir;

import java.util.Scanner;

public class QuintoDiagramaDeFlujo {
	
	//Construya un diagrama de flujo que dado como datos la base y la altura de un rectangulo,Calcule el perimetro y la superficie del mismo
	public static void main(String[] args) {
		
		int base,altura;
		int perimetro;
		int superficie;
		Scanner tc=new Scanner(System.in);
		System.out.println("Bienvenido al programa que calculara el perimetro y la superficie de tu rectangulo:\n");
		calculoPerimetroYSuperficieDeRectangulo(tc);
		
		
		
		
		
		
		
	}

	private static void calculoPerimetroYSuperficieDeRectangulo(Scanner tc) {
		int base;
		int altura;
		int perimetro;
		int superficie;
		System.out.println("Ingrese  la medida de la base de su rectangulo");
		base=tc.nextInt();
		System.out.println("Ingrese  la medida de la altura de su rectangulo");
		altura=tc.nextInt();
		superficie=(base*altura);
		perimetro=(base+altura)*2;
		System.out.println("el perimetro y la superfice del rectangulo es:\n" + "superficie:\n"+ superficie +"\n"+"perimetro\n"+ perimetro);
	}
	

}
