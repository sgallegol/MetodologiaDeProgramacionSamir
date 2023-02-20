package algoritmos.diagramas.flujo.programas.samir;

import java.util.Scanner;

public class DoceavoDiagramaDeFlujo {

	// Construya un diagrama de flujo tal que dado datod como la categoria y el
	// sueldo de un trabajador
	// calcule el aumento correspondiente teniendo en cuenta lo siguiente
	// categiria
	// 1 15%
	// 2 10%
	// 3 8%
	// 4 7%
	public static void main(String[] args) {

		double sueldo;
		int categoria;
		double sueldoAumento;
		Scanner tc = new Scanner(System.in);
		System.out.println("Bienvenido a la aplicacion ingrese la categoria que desea operar: ");
		System.out.println("opcion 1" + "opcion 2" + "opcion 3" + "opcion 4");
		categoria = tc.nextInt();
		System.out.println("Ingrese el sueldo a operar");
		sueldo = tc.nextDouble();
		switch (categoria) {
		case 1:
			categoria = 1;
			sueldoAumento = (sueldo + sueldo * 0.15);
			System.out.println(sueldoAumento);
			break;
		case 2:
			categoria = 2;
			sueldoAumento = (sueldo + sueldo * 0.10);
			System.out.println(sueldoAumento);
			break;
		case 3:
			categoria = 3;
			sueldoAumento = (sueldo + sueldo * 0.08);
			System.out.println(sueldoAumento);
			break;
		case 4:
			categoria = 4;
			sueldoAumento = (sueldo + sueldo * 0.07);
			System.out.println(sueldoAumento);
			break;
		}

	}

}
