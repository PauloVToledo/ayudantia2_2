package org.example.gestionEmpleados;


public class EmpleadoPorHora extends Empleado {
	private int horasTrabadas;
	private double salarioPorHora;

	public EmpleadoPorHora(String nombre, double salarioPorHora, int horasTrabajadas) {
		super(nombre, salarioPorHora);
		this.horasTrabadas=horasTrabajadas;
		this.salarioPorHora=salarioPorHora;

	}

	public boolean calcularSalario() {
		if (horasTrabadas >= 0 && salarioPorHora >= 0) {
			double salario = salarioPorHora * horasTrabadas;
			return true;
		} else {
			return false;
		}
	}

	public String getTipo() {
		return "Empleado por Hora";
	}

	public int getHorasTrabadas() {
		return this.horasTrabadas;
	}

	public void setHorasTrabadas(int horasTrabadas) {
		this.horasTrabadas = horasTrabadas;
	}

	public double getSalarioPorHora() {
		return this.salarioPorHora;
	}

	public void setSalarioPorHora(double salarioPorHora) {
		this.salarioPorHora = salarioPorHora;
	}

	public String toString() {
		return "Nombre: " + nombre +", Salario Base: " + salarioBase;
	}
}