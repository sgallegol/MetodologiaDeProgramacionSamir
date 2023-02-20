package algoritmos.diagramas.flujo.programas.samir;

import java.util.Scanner;

public class TreceAvoDiagramaDeFlujo {

	// A continaución se presentara un problema donde el lector puede aplicar los
	// conceptos estudiados
	// en estructuras selectivas en cascada
	// problema
	// Dados los datos A,B Y C que representan números enteros diferente,construya
	// un diagrama de flujo para escribir
	// estos numeros en forma descendiente
	public static void main(String[] args) {

		Scanner tc = new Scanner(System.in);
		System.out.println("Bienvenido a la aplicación que reubica tus numeros y recuerda ingresar numeros distintos");
		double a, b, c;
		System.out.println("Ingresa el numero A");
		a = tc.nextDouble();
		System.out.println("Ingresa el numero B");
		b = tc.nextDouble();
		System.out.println("Ingresa el numero C");
		c = tc.nextDouble();
		if (a > b) {
			if (a > c) {
				if (b > c) {
					System.out.printf("Los numeros  ordenados son:\n" + a + "\n" + b +"\n"  + c);
				} else {
					System.out.println("Los  numeros ordenados son;\n" + a +"\n" + c+"\n" + b);
				}
			} else {
				System.out.println("Los numeros ordenados son:\n" + c +"\n" + a+"\n" + b);
			}
		}else {
			if (b > c) {

				if (a > c) {
					System.out.println("Los numeros ordenados son:\n" + b + "\n"+ a+"\n" + c);
				} else {
					System.out.println("Los numeros ordenados son:\n" + b +"\n" + c+"\n" + a);
				}

			} else {
				System.out.println("Los numeros ordenados son:\n" + c +  "\n" + b+"\n" + a);

			}
		}
		tc.close();

	}

}
