package algoritmos.diagramas.flujo.programas.samir;

import java.util.Scanner;

public class DieciochoavoDiagramaDeFlujo {

	public static void main(String[] args) {

		// En cierto país el impuesto que se debe pagar por los articulos se calculan
		// mediante la siguinete regla
		// los primeros $20 no causan impuesto,los siguientes $20 tienen el 30% de
		// impuesto y el resto el 40% de impuesto
		// pero si el costo del producto es mayor a $500,entonces en lugar del 40% se
		// conbra el 50%
		// diseñe un diagrama de flujo que calcule el precio total de un
		// articulo=precioArticulo+impuesto

		Scanner tc = new Scanner(System.in);
		System.out.println("Bienvenido a  la aplicación");
		System.out.println("Ingrese el precio de la compra");
		double precioCompra = tc.nextDouble();
		if (precioCompra <= 20) {
			precioCompra = (precioCompra);
			System.out.println("El precio de la compra en este caso se conserva:\n" + precioCompra);
		} else if (precioCompra > 20 && precioCompra <= 40) {
			double precioFinal1 = (precioCompra+(precioCompra-20)* 0.3);
			System.out.println("El precio de la compra para este caso es de:\n" + precioFinal1);
		} else if (precioCompra > 40 && precioCompra <= 500) {
			double precioFinal2 = (precioCompra + (precioCompra-40) * 0.4 + 20*0.30);
			System.out.println("El precio de la compra es de:\n" + precioFinal2);
		} else if (precioCompra > 500) {
			double precioFinal3 = (precioCompra + (precioCompra -40)* 0.5+ 20*0.30);
			System.out.println("El precio de la compra en este caso se conserva:\n" + precioFinal3);
		}
		tc.close();

	}

}
