package algoritmos.diagramas.flujo.programas.samir;

import java.util.Scanner;

public class DieciseisavoDiagramaDeFlujo {

	// Dado un número entero A,haga un diagrama de flujo para determinar si el mismo
	// es
	// par,impar o nulo
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.println("Bienvendio a la aplicación");
		System.out.println("Ingrese un numero para iniciar varificación:\n");
		int num=tc.nextInt();
		if(num>=0) {
			if(num==0) {
				System.out.println("nullo");
			}
			
		
		if(num%2==0) {
			System.out.println("El numero es par:\n" + num);
		}else if (num%2!=0){
			System.out.println("El nuemro es impar:\n" + num);
		}
		}else {
			System.out.println("El numero ingresado debe  ser mayor o igul que cero");
		}
		
		
		
		
		
		
	}

}
