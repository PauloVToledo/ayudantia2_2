package org.example.gestionEmpleados;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private ArrayList<Empleado> empleados = new ArrayList<>();
	private Scanner scanner = new Scanner(System.in);



	public void agregarEmpleadoAsalariado(String nombre, double salarioBase) {
		Empleado empleado = new EmpleadoAsalariado(nombre, salarioBase);
		empleados.add(empleado);
	}

	public void agregarEmpleadoPorHora(String nombre, double salarioPorHora, int horasTrabajadas) {
		Empleado empleado = new EmpleadoPorHora(nombre, salarioPorHora, horasTrabajadas);
		empleados.add(empleado);
	}

	public void mostrarEmpleados() {
		for (Empleado empleado : empleados) {
			System.out.println("Nombre: " + empleado.getNombre());
			System.out.println("Tipo: " + empleado.getTipo());
			System.out.println("Salario: " + empleado.getSalario());
			System.out.println();
		}
	}

	public void agregarEmpleadoDesdeTeclado() {
		System.out.println("Ingrese el nombre del empleado:");
		String nombre = scanner.nextLine();

		System.out.println("Ingrese el tipo de empleado (A para Asalariado, H para Por Hora):");
		String tipo = scanner.nextLine();

		if (tipo.equalsIgnoreCase("A")) {
			System.out.println("Ingrese el salario base:");
			double salarioBase = scanner.nextDouble();
			agregarEmpleadoAsalariado(nombre, salarioBase);
		} else if (tipo.equalsIgnoreCase("H")) {
			System.out.println("Ingrese el salario por hora:");
			double salarioPorHora = scanner.nextDouble();

			System.out.println("Ingrese las horas trabajadas:");
			int horasTrabajadas = scanner.nextInt();
			agregarEmpleadoPorHora(nombre, salarioPorHora, horasTrabajadas);
		} else {
			System.out.println("Tipo de empleado no válido.");
		}
	}

	public void operation() {
		agregarEmpleadoAsalariado("Papelucho", 2000);
		agregarEmpleadoPorHora("Josefinita", 15, 40);

		// Agregar empleados desde el teclado
		agregarEmpleadoDesdeTeclado();

		mostrarEmpleados();
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.operation();
	}
}
