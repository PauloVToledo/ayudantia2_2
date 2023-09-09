package org.example.gestionEmpleados;

public abstract class Empleado {
	protected String nombre;
	protected String salarioBase;

	public Empleado(String nombre, double salarioPorHora) {
	}

	public String getNombre() {
		return this.nombre;
	}

	public String getSalarioBase() {
		return this.salarioBase;
	}

	public Empleado(String nombre, String salarioBase) {
		this.nombre=nombre;
		this.salarioBase=salarioBase;
	}

	public abstract String getTipo();

	public abstract boolean calcularSalario();

	public String getSalario() {
		return salarioBase;
	}
}