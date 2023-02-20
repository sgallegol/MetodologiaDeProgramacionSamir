package algoritmos.diagramas.flujo.programas.samir;

import java.util.Scanner;

public class DiecisieteavoDiagaramDeFlujo {
	
	//En un tienda efectúan un descuento a los clientes dependiendo
	//del monto de la compra.El descuento se efectúa con base en el siguiente criterio
	//si el monto es menor que $500---no hay descuernto
	//si el monto está comprendido entre $500 y $1000 inclusive--->5% de descuento
	//si el monto está comprendido entre $1000 y $7000 inclusive---	>11% de descuento
	//si el monto está  comprendido entre $7000 y $15000 inclusive---> 18% de descuento
	//si el monto es mayor  a $15000 --->$25% de  descuento
	//construya un diagrama de flujo talq ue dado el monto de la compra de un cliente,determine loq ue el  mismo debe pagar
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.println("Bienvenido  a la aplicación de calculo de descuento");
		System.out.println("Ingrese el monto de la compra");
		double montoCompra=tc.nextDouble();
		if(montoCompra<500.0) {
			System.out.println("No hay descuento para tu compra");
		}else if(montoCompra>=500 && montoCompra<=1000 ) {
			double descuento1=(montoCompra - montoCompra*0.05);
			System.out.println(descuento1);
		}else if(montoCompra>=1000 && montoCompra<=7000 ) {
			double descuento2=(montoCompra - montoCompra*0.11);
			System.out.println(descuento2);
		}else if(montoCompra>=700 && montoCompra<=15000) {
			double descuento3=(montoCompra - montoCompra*0.18);
			System.out.println(descuento3);
		}else if(montoCompra>=15000) {
			double descuento4=(montoCompra - montoCompra*0.25);
			System.out.println(descuento4);
		}
		tc.close();
		
		
		
		
	}
	
	
	
	
	

}
