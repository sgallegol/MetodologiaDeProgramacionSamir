package algoritmos.diagramas.flujo.programas.samir;

import java.util.Scanner;

public class VeintiunavoDiagramaDeFlujo {

	// Escriba un diagrama de flujo que permita calcular lo que hay que pagarle a un
	// trabajador
	// teniendo en cuenta su sueldo y las horas extras trabajadas.
	// Para el pago de las horas extras se toma en cuenta la categoria del
	// trabajador
	// categoria precioHE
	// 1 $30
	// 2 $38
	// 3 $50
	// 4 $70
	// Cada trabajador puede tener como maximo 30 horas extras,si tiene más sólo se
	// les pagara 30
	// A los trabajadores con categoría mayor a 4 no debemos pagarle horas extras
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.println(
				"Bienvenido a la aplicacion,escoga por favor la categoria y que desea o de ser necesario  colocoque alguna otra: ");
		double sueldo;
		int cantHE;
		int categoria;
		System.out.println("Categoria 1\n" + "Categoria 2\n" + "Categoria 3\n" + "Categoria 4\n");
		categoria = tc.nextInt();
		System.out.println("Ingrese el sueldo del trabajador");
		sueldo = tc.nextDouble();
		System.out.println("Ingrese la cantidad de horas extras");
		cantHE = tc.nextInt();

		if (categoria >= 1 && categoria <= 4) {

			switch (categoria) {
			case 1:
				categoria = 1;
				if (cantHE <= 30) {

					sueldo = (sueldo + cantHE * 30);
					System.out.println(sueldo);
				} else {
					sueldo = (sueldo + 30 * 30);
				}
				break;
			case 2:
				categoria = 2;
				if (cantHE <= 30) {

					sueldo = (sueldo + cantHE * 38);
					System.out.println(sueldo);
				} else {
					sueldo = (sueldo + 30 * 38);
					System.out.println(sueldo);
				}
				break;
			case 3:
				categoria = 3;
				if (cantHE <= 30) {

					sueldo = (sueldo + cantHE * 50);
					System.out.println(sueldo);
				} else {
					sueldo = (sueldo + 30 * 50);
					System.out.println(sueldo);
				}
				break;
			case 4:
				categoria = 4;
				if (cantHE <= 30) {
					sueldo = (sueldo + cantHE * 70);

					System.out.println(sueldo);

				} else {
					sueldo = (sueldo + 30 * 70);
					System.out.println(sueldo);
				}

				break;

			default:

				System.out.println("Categoria ingresada no es validad");

			}
		} else if (categoria > 4 && categoria <= 10) {
			sueldo = sueldo;
			System.out
					.println("Debido a su categoria el sueldo se conserva y las hortas extras no se tienen en cuenta:\n"
							+ sueldo);
		}
		tc.close();
	}
}
