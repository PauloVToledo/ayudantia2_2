package org.example;

public class EmpleadoAsalariado extends Empleado {

	public EmpleadoAsalariado(String nombre, double salarioBase) {
		super(nombre, String.valueOf(salarioBase));
	}

	// Completa este método para calcular el salario del empleado asalariado
	public boolean calcularSalario() {

		return false;
	}

	public String getTipo() {
		return "Asalariado";
	}
}
