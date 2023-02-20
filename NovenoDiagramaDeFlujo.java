package algoritmos.diagramas.flujo.programas.samir;

import java.util.Scanner;

public class NovenoDiagramaDeFlujo {

	// Construya un diagrama de flujo tal que dado como dato la calificación de un
	// alumno
	// en un examen;escriba "aprobado" si su calificación es mayor o igual que 8 y
	// "reprobado"
	// en caso contrario

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.println("Bienvenido a la aplicacion");
		verificarCalificacion(tc);

	}

	private static void verificarCalificacion(Scanner tc) {
		double calif;
		System.out.println("Ingrese la califcación del alumno");
		calif = tc.nextDouble();
		if (calif >= 8.0) {
			System.out.println("aprobado");
		} else {
			System.out.println("reprobado");
		}
	}

}
