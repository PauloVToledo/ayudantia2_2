package org.example;

import java.util.ArrayList;

public class Main {
	private ArrayList<Empleado> empleados = new ArrayList<>();

	public ArrayList<Empleado> listaEmpleados() {
		return empleados;
	}

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

	public void operation() {
		agregarEmpleadoAsalariado("Papelucho", 2000);
		agregarEmpleadoPorHora("Josefinita", 15, 40);
		mostrarEmpleados();
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.operation();
	}
}
