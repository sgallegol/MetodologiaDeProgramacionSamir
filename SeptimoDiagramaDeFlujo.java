package algoritmos.diagramas.flujo.programas.samir;

import java.util.Scanner;

public class SeptimoDiagramaDeFlujo {
	//Si dada la calificación d eun alumno escriba aprobado en caso de que esa calificación sea mayor que 8
	
	public static void main(String[] args) {
		double calif;
		Scanner tc=new Scanner(System.in);
		System.out.println("Ingrese la clificacion del estudiante:\n");
		calif=tc.nextDouble();
		if(calif>8) {
			System.out.println("El estudiante aprobo con una calificacion de:\n"+ calif);
		}else {
		System.out.println("El estudiante no pudo aprobar");
		}
		tc.close();
		
		
	}
	
	
	

}
