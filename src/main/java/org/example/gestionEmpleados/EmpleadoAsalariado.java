package org.example.gestionEmpleados;

public class EmpleadoAsalariado extends Empleado {

	public EmpleadoAsalariado(String nombre, double salarioBase) {
		super(nombre, String.valueOf(salarioBase));
	}


	public boolean calcularSalario() {
			return false;
	}


	public String getTipo() {
		return "Asalariado";
	}

	public String toString() {
		return "Nombre: " + nombre +", Salario Base: " + salarioBase;
	}
}
