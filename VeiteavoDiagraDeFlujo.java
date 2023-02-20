package algoritmos.diagramas.flujo.programas.samir;

import java.util.Scanner;

public class VeiteavoDiagraDeFlujo {

	// El costo de las llamadas telefónicas internacionales depende de la zona
	// geográfica
	// en la que se encuentre el país destino y del número de minutos hablados
	// en la siguiente tabla se presenta el costo del minuto por zona.A cada zona se
	// le ha asociado una clave
	// clave zona precio
	// 12 américa del norte 2
	// 15 America Central 2.2
	// 18 América del sur 4.5
	// 19 Europa 3.5
	// 23 Asia 6
	// 25 África 6
	// 29 Oceania 5
	// Construya un diagrama de flujo que le permita calcular e imprimir el costo
	// total de una llamada
	public static void main(String[] args) {
		int clave;
		double duracionllamada;
		Scanner tc = new Scanner(System.in);
		System.out.println("Bienvenido a la aplicación calculo de costo de llamada\n");
		System.out.println("Ingrese la clave con la que desea operar dependiedo del pais\n");
		System.out.println("clave 12\n" + "clave 15\n" + "opcion 18\n" + "opcion 19\n" + "clave 23\n" + "clave  25\n"
				+ "clave 29\n");

		clave = tc.nextInt();
		System.out.println("Ingrese la duracción de la llamada");
		duracionllamada = tc.nextDouble();
		switch (clave) {
		case 1:
			clave = 12;
			double total1 = duracionllamada * 2;
			System.out.println(total1);
			break;
		case 2:
			clave = 15;
			double total2 = (duracionllamada * 2.2);

			break;
		case 3:
			clave = 18;
			double total3 = (duracionllamada * 4.5);

			break;
		case 4:
			clave = 19;
			double total4 = (duracionllamada * 3.5);
			break;
		case 5:
			clave = 23;
			double total5 = (duracionllamada * 6);
			break;
		case 6:
			clave = 25;
			double total6 = (duracionllamada * 6);
			break;
		case 7:
			clave = 29;
			double total7 = (duracionllamada * 5);
			break;
		default:
			System.out.println("Numero de clave ingresado no valido");

		}
		tc.close();

	}

}
