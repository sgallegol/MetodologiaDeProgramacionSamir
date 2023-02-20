package algoritmos.diagramas.flujo.programas.samir;

import java.util.Scanner;

public class OctavoDiagramaDeFlujo {
	//Dado como dato el sueldo de un trabajador,aplíque un aumento del 15%
	//si su sueldo es inferior a 1000.Imprima en este caso el nuevo sueldo del trabajador

	public static void main(String[] args) {
		
		double sueldo;
		Scanner tc=new Scanner(System.in);
		System.out.println("Ingrese el sueldo del trabajador para verificar si tiene o no aumento");
		sueldo=tc.nextDouble();
		if(sueldo<1000.0) {
			sueldo=sueldo+sueldo*0.15;
			System.out.println("su sueldo con aumento es: " + sueldo);
		}else {
			System.out.println("Su sueldo no se puede aumentar:");
		}
		tc.close();
		
		
		
		
		
	}

}
