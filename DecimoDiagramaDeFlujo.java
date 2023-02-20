package algoritmos.diagramas.flujo.programas.samir;

import java.util.Scanner;

public class DecimoDiagramaDeFlujo {
	
	//Construya un diagrama de flujo tal que dado como dato el sueldo de un trabajador, le aplique
	//un aumento del 15% si su sueldo es inferior a  $1000 y 12%  en caso contrario.Imprima el nuevo suledo del trabajador
	public static void main(String[] args) {
		
		double sueldo;
		double nuevoSueldo;
		Scanner tc = new Scanner(System.in);
		System.out.println("Bienvenido a la aplicación");
		nuevoSueldo = calculoNuevoSueldo(tc);
		System.out.println(nuevoSueldo);
		
		
	}

	private static double calculoNuevoSueldo(Scanner tc) {
		double sueldo;
		double nuevoSueldo;
		System.out.println("Ingrese el sueldo");
		sueldo=tc.nextDouble();
		if(sueldo<1000.0) {
			nuevoSueldo=sueldo+ sueldo*0.15;
		}else {
			nuevoSueldo=sueldo+sueldo*0.12;
		}
		return nuevoSueldo;
	}
	 
	 
	
	
	

}
