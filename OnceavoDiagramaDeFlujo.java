package algoritmos.diagramas.flujo.programas.samir;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

public class OnceavoDiagramaDeFlujo {

	// Construya un diagrama de flujo tal que dado como datos dos variables de tipo
	// entero
	// obtenga el resulatdo de la siguiente funcion
	// VAL= 100*V SI NUM=1
	// VAL= 100**V SI NUM=2
	// VAL= 100/V SI NUM=1
	// 0 PARA CUALQUIER OTRO NUMERO
	public static void main(String[] args) {

		double num;
		int opcion;
		double val;
		Scanner tc = new Scanner(System.in);
		System.out.println("Bienvenido a la aplicacion ingrese la opcion que desea operar: ");

		System.out.println("opcion 1\n" + "opcion 2\n" + "opcion 3\n" + "opcion 4\n");

		opcion = tc.nextInt();
		System.out.println("Ingrese el numero con el que va a operar");
		num = tc.nextDouble();
		switch (opcion) {
		case 1:
			opcion=1;
			val = (100 * num);
			System.out.println(val);
			break;
		case 2:
			opcion = 2;
			val=Math.pow(100, num);
			System.out.println(val);
			break;
		case 3:
			opcion = 3;
			val = (100 / num);
			System.out.println(val);
			break;
		default:
			System.out.println("Numero ingresado no valido");
		}

	}
}
