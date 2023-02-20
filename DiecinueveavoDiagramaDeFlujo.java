package algoritmos.diagramas.flujo.programas.samir;

import java.util.Scanner;

public class DiecinueveavoDiagramaDeFlujo {

	// Dado como datos tres números reales,identifique cuál es el mayor.
	// considere que los numeros pueden ser iguales.Desarrolle el diagrama de flujo
	// correspondiente
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.println("Binvenido a la aplicación  de verificacin");
		System.out.println("Ingrese el  primer número");
		int num1=tc.nextInt();
		System.out.println("Ingrese el  segundo número");
		int num2=tc.nextInt();
		System.out.println("Ingrese el  tercer número");
		int num3=tc.nextInt();
		if(num1>num2 && num1>num3) {
			
			System.out.println("El numero mayor es:\n" +num1);
		}else if(num2>num1 && num2>num3) {
			System.out.println("El numero mayor es:\n" +num2);
		}else if(num3>num2 && num3>num1) {
			System.out.println("El numero mayor es:\n"+num3);
		}else if(num1==num2 && num3>num2) {
			System.out.println("El numero mayor es:\n"+num3);
		}else if(num2==num3 && num1>num3) {
			System.out.println("El numero mayor es:\n"+ num1);
		}else if(num3==num1 && num2>num3) {
			System.out.println("El numero mayor es:\n" + num2);
		}else if(num1==num2 && num2==num3) {
			System.out.println("Todos los numeros son iguales"+"\n"+ num1+"\n"+ num2 +"\n"+ num3);
		}else if(num2==num3 && num1<num3) {
			System.out.println("Los numeros mayores son el:\n" +"segundo numero:\n" +num2+ "\n"+"y el tercer numero\n"+ num3 );
		}else if(num1==num2 && num3<num2) {
			System.out.println("Los numeros mayores son el:\n"+ "primer numero:\n"+ num1+ "\n" +"y el segundo numero:\n" + num2 );
		}else if(num1==num3 && num2<num1) {
			System.out.println("Los numeros mayores son el:\n"+ "primer numero:\n"+ num1+ "\n" +"y el tercer numero:\n" + num3 );
		}
		tc.close();
	}

}

