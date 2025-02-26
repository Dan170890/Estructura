package co.edu.unbosque.model;

import java.io.Serializable;
import java.time.LocalDate;

public class Viajero implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3024093317095234647L;
	private String nombre;
	private String nacionalidad;
	private LocalDate fechaNacimiento;

	public Viajero() {
		// TODO Auto-generated constructor stub
	}

	public Viajero(String nombre, String nacionalidad, LocalDate fechaNacimiento) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int calcularEdadRecursiva(LocalDate fechaNacimiento, LocalDate fechaActual) {

		if (fechaNacimiento.isAfter(fechaActual)) {
			return 0;
		}
		if (fechaNacimiento.plusYears(1).isAfter(fechaActual)) {
			return 0;
		}
		return 1 + calcularEdadRecursiva(fechaNacimiento.plusYears(1), fechaActual);
	}

	public boolean verificarMenor() {
		if (calcularEdadRecursiva(fechaNacimiento, LocalDate.now()) < 18) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return " \n ->Viajero: \n nombre:" + nombre + " \n nacionalidad=" + nacionalidad + " \n fechaNacimiento="
				+ fechaNacimiento + "";
	}

}
