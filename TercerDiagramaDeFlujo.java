package algoritmos.diagramas.flujo.programas.samir;

import java.util.Scanner;

public class TercerDiagramaDeFlujo {

	// Dada la matricula y 5 calificaciones del alumno obtenidas a lo largo de un
	// semestre..
	// construya un diagrama de flujo que imprima la matricula del alumno y el
	// promedio de sus calificaciones

	public static void main(String[] args) {

		//Float calif1, calif2, calif3, calif4, calif5;
		final float matricula = 1212233;
		System.out.println("ingrese las calificaciones del alumno");
		Scanner tc=new Scanner(System.in);
		Float promedio = calificacionPromedio(tc);
	System.out.println("la calificacion promedio del alumno es: " +  promedio + "y la matricula del alumno es: " + matricula);
	
		
	}

	private static Float calificacionPromedio(Scanner tc) {
		
		Float calif1;
		Float calif2;
		Float calif3;
		Float calif4;
		Float calif5;
		Float promedio;
		System.out.println("la calificacion 1 del alumno es:\n");
		calif1=tc.nextFloat();
		System.out.println("la calificacion 2 del alumno es:\n");
		calif2=tc.nextFloat();
		System.out.println("la calificacion 3 del alumno es:\n");
		calif3=tc.nextFloat();
		System.out.println("la calificacion 4 del alumno es:\n");
		calif4=tc.nextFloat();
		System.out.println("la calificacion 5 del alumno es:\n");
		calif5=tc.nextFloat();

	return promedio=(calif1+calif2+calif3+calif4+calif5)/5;
		
	}

}
