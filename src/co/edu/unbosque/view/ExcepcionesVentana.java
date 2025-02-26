package co.edu.unbosque.view;

import javax.swing.JOptionPane;

public class ExcepcionesVentana {

	public static void vacia() {
		JOptionPane.showMessageDialog(null, "No ingreso un valor. Inténtalo de nuevo.", "Espacio vacio",
				JOptionPane.ERROR_MESSAGE);
	}

	public static void frase() {
		JOptionPane.showMessageDialog(null, "Ha ingresado digito invalido. Inténtalo de nuevo.", "Error en una Frase",
				JOptionPane.ERROR_MESSAGE);
	}

	public static void decimales() {
		JOptionPane.showMessageDialog(null, "Ha ingresado digito invalido. Inténtalo de nuevo.", "Error en decimales",
				JOptionPane.ERROR_MESSAGE);
	}

	public static void palabra() {
		JOptionPane.showMessageDialog(null, "Ha ingresado digito invalido. Inténtalo de nuevo.", "Error en una palabra",
				JOptionPane.ERROR_MESSAGE);
	}

	public static void numeros() {
		JOptionPane.showMessageDialog(null, "Ha ingresado digito invalido. Inténtalo de nuevo.", "Error en enteros",
				JOptionPane.ERROR_MESSAGE);
	}

	public static void numerosYLetras() {
		JOptionPane.showMessageDialog(null, "Ha ingresado digito invalido. Inténtalo de nuevo.",
				"Error en numeros y letras", JOptionPane.ERROR_MESSAGE);
	}

	public static void creadoExitosamente(String x) {
		JOptionPane.showMessageDialog(null, "Se ha creado exitosamente " + x, "Creado",
				JOptionPane.INFORMATION_MESSAGE);

	}

	public static void eliminadoExitosamente(String x) {
		JOptionPane.showMessageDialog(null, "Se ha eliminado exitosamente "+x, "Eliminar",
				JOptionPane.INFORMATION_MESSAGE);

	}

	public static void actualizadoExitosamente(String x) {
		JOptionPane.showMessageDialog(null, "Se ha actualizado exitosamente "+x, "Actualizar",
				JOptionPane.INFORMATION_MESSAGE);

	}

	public static void mensaje(String x) {
		JOptionPane.showMessageDialog(null, x, "Entrada", JOptionPane.QUESTION_MESSAGE);
	}
}
