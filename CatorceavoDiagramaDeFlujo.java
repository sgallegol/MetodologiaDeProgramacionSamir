package algoritmos.diagramas.flujo.programas.samir;

import java.util.Scanner;

public class CatorceavoDiagramaDeFlujo {

	// El njumero de sonidos emitidos por un grillo en un minuto, es una función de
	// la temperatura
	// Como resultado de esto, es posible determinar el nivel de ña temperatura
	// haciendo uso de un grillo como termiometro
	// la formula para la función es:
	// T=m/4 + 40, donde m es el numero de sonidos emitidos por segundo

	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);
		System.out.println("Bienvenido a la aplicación de calculo de la temperatura");
		double numPitidos;
		double temperatura;
		System.out.println("A  continuación ingrese el número de pitidos del grillo");
		numPitidos=tc.nextDouble();
		if(numPitidos>0) {
			temperatura=(numPitidos/4 +40);
			System.out.println("La temperatura es:\n" + temperatura);
		}else {
			System.out.println("termino el programa");
		}
		tc.close();
		
		
	}

}
