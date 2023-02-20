package algoritmos.diagramas.flujo.programas.samir;

import java.util.Scanner;

public class SextotoDiagramaDeFlujo {

	// Escriba un diagrama de flijo tal que dado como datos el radio y la altura de
	// un cilindro,
	// calcule e imprima el área y su volumen

	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);
		System.out.println("ingres elos datos del cilindro al cual se le calculara el area y su volumen");
		calculoVolumenYAreaCilindro(tc);
		tc.close();
	}

	private static void calculoVolumenYAreaCilindro(Scanner tc) {
		double radio;
		double altura;
		double volumen;
		double area;
		System.out.println("Ingrese el radio del cilindro");
		radio = tc.nextFloat();
		System.out.println("Ingrese la altura del cilindro ");
		altura = tc.nextFloat();
		volumen = (Math.PI * radio * radio * altura);
		area = (Math.PI * radio * altura * 2);
		System.out.println("El resultado del volumen y al area del cilindro es:\n " + "Volumen\n" + volumen + "\n"
				+ "Area\n" + area);
	}

}
