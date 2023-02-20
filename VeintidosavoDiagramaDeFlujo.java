package algoritmos.diagramas.flujo.programas.samir;

import java.util.Scanner;

public class VeintidosavoDiagramaDeFlujo {

	// En un hospital se ha hecho un estudio sobre los pacientes registrados durante
	// los ultimos 10 años
	// con el objeto de hacer una aproximación de los costos de internación por
	// pacientes
	// se obtuvo un costo promedio diario según el tipo de enfermeda que aqueja al
	// paciente
	// además se pudo detrminar que en promedio todos los pacientes con edad entre
	// 14 y 22 años implican un costo adicional
	// del 10%.la siguiente tabla expresa los costos diarios, segun tipo de
	// enfermedad
	// tipo de enfermedad costo/paciente/dia
	// 1 25
	// 2 16
	// 3 20
	// 4 32
	// construya un diagrama de flujo que calcule e imprima el costo total que
	// representa un paciente
	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		System.out.println("Bienvenido a la aplicación de calculo de costos de pacientes");
		double edadPaciente;
		double cantidadDiasHospital;
		int tipoEnfermedad;
		double costoPaciente;
		System.out
				.println("tipo enfermedad 1\n" + "tipo enfermedad 2\n" + "tipo enfermedad 3\n" + "tipo enfermedad 4\n");
		System.out.println("Seleccione la opcion dependiendo de la enfermedad del paciente:\n");
		tipoEnfermedad = tc.nextInt();
		System.out.println("Ingrese la edad del paciente");

		edadPaciente = tc.nextInt();
		System.out.println("Ingrese cuantos dias a estado hospitalizado el paciente");
		cantidadDiasHospital = tc.nextInt();
		switch (tipoEnfermedad) {
		case 1:
			tipoEnfermedad = 1;
			if (edadPaciente >= 14 && edadPaciente <= 22) {
				double subtotal = 25 * cantidadDiasHospital;
				costoPaciente = (subtotal + subtotal * 0.1);
				System.out.println("El costo a pagar con sobrecargo en edad es:\n" + costoPaciente);
			} else {
				costoPaciente = (25 * cantidadDiasHospital);
				System.out.println("El costo a pagar es:\n" + costoPaciente);
			}
			break;
		case 2:
			tipoEnfermedad = 2;
			if (edadPaciente >= 14 && edadPaciente <= 22) {
				double subtotal = 16 * cantidadDiasHospital;
				costoPaciente = (subtotal + subtotal * 0.1);
				System.out.println("El costo a pagar con sobrecargo en edad es:\n" + costoPaciente);
			} else {
				costoPaciente = (16 * cantidadDiasHospital);
				System.out.println("El costo a pagar es:\n" + costoPaciente);
			}
			break;
		case 3:
			tipoEnfermedad = 3;
			if (edadPaciente >= 14 && edadPaciente <= 22) {
				double subtotal = 20 * cantidadDiasHospital;
				costoPaciente = (subtotal + subtotal * 0.1);
				System.out.println("El costo a pagar con sobrecargo en edad es:\n" + costoPaciente);
			} else {
				costoPaciente = (20 * cantidadDiasHospital);
				System.out.println("El costo a pagar es:\n" + costoPaciente);
			}
			break;
		case 4:
			tipoEnfermedad = 4;
			if (edadPaciente >= 14 && edadPaciente <= 22) {
				double subtotal = 32 * cantidadDiasHospital;
				costoPaciente = (subtotal + subtotal * 0.1);
				System.out.println("El costo a pagar con sobrecargo en edad es:\n" + costoPaciente);
			} else {
				costoPaciente = (32 * cantidadDiasHospital);
				System.out.println("El costo a pagar es:\n" + costoPaciente);
			}
			break;

		default:
			System.out.println("Tipo de enfermedad ingresada no valida");

		}
		tc.close();

	}

}
