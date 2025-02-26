package co.edu.unbosque.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import co.edu.unbosque.model.ModelFacade;
import co.edu.unbosque.model.Viajero;
import co.edu.unbosque.model.VueloLlegadaNacionalDTO;
import co.edu.unbosque.util.exception.ExceptionChecker;
import co.edu.unbosque.util.exception.VerificateNullException;
import co.edu.unbosque.util.exception.VerificateNumberNotValidException;
import co.edu.unbosque.util.exception.VerificateNumbersLettersNotValidException;
import co.edu.unbosque.util.structure.linkedlist.MyLinkedList;
import co.edu.unbosque.view.ExcepcionesVentana;
import co.edu.unbosque.view.ViewFacade;

public class Controller implements ActionListener {

	private ModelFacade mf;
	private ViewFacade vf;

	public Controller() {
		mf = new ModelFacade();
		vf = new ViewFacade();
		asignarOyentes();
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		if (vf.getFi().getVi().getBtnCliente() == e.getSource()) {
			btnCliente();
		}
		if (vf.getFi().getVi().getBtnAdministrador() == e.getSource()) {
			btnEscogerNOI();
		}
		if (vf.getFenoi().getVenoi().getBtnNacional() == e.getSource()) {
			btnAdministradorNacional();
		}
		if (vf.getFenoi().getVenoi().getBtnInternacional() == e.getSource()) {
			btnAdministradorInternacional();
		}
		if (vf.getFenoi().getVenoi().getBtnVolver() == e.getSource()) {
			btnVolverInicio();
		}
		if (vf.getFai().getVai().getBtnCrearLlegada() == e.getSource()) {
			btnCrearLlegadaInternacional();
		}
		if (vf.getFclintn().getVcrlintn().getBtnVolver() == e.getSource()) {
			btnVolverLlegadasInt();
		}
		if (vf.getFai().getVai().getBtnCrearSalida() == e.getSource()) {
			btnCrearSalidaInternacional();
		}
		if (vf.getFcsintn().getVcrsintn().getBtnVolver() == e.getSource()) {
			btnVolverSalidaInt();
		}
		if (vf.getFai().getVai().getBtnVolver() == e.getSource()) {
			btnVolverAMenuDesdeInt();
		}
		if (vf.getFan().getVan().getBtnCrearLlegada() == e.getSource()) {
			btnCrearLlegadaNacional();
		}

		if (vf.getFan().getVan().getBtnVolver() == e.getSource()) {
			btnVolverDesdeMenuNac();
		}

		if (vf.getFcln().getVcrln().getBtnVolver() == e.getSource()) {
			btnVolverLlegadaNacional();
		}
		if (vf.getFan().getVan().getBtnCrearSalida() == e.getSource()) {
			btnCrearSalidaNacional();
		}
		if (vf.getFcsn().getVcrsn().getBtnVolver() == e.getSource()) {
			btnVolverSalidaNacional();
		}
		if (vf.getFai().getVai().getBtnActualizarLlegada() == e.getSource()) {
			btnActualizarLlegadaInternacional();
		}

		if (vf.getFactlint().getVactlint().getBtnVolverAct() == e.getSource()) {
			btnVolverVntActLlegadaInternacional();
		}
		
	//	if(vf.getFactsint().getVactlsint().getBtnVolverAct() == e.getSource()) {
	//		btnVolverVntActSalidaInternacional();
	//	}
		
		if (vf.getFai().getVai().getBtnActualizarSalida() == e.getSource()) {
			btnVentanaActSalidaInternacional();
		}
		
		if (vf.getFan().getVan().getBtnActualizarLlegada() == e.getSource()) {
			btnVentanaActLlegadaNacional();
		}
		
		if (vf.getFactlln().getVactlln().getBtnVolverAct() == e.getSource()) {
			btnVolverVntActLlegadaNacional();
		}

	}

	public void asignarOyentes() {

		vf.getFi().getVi().getBtnAdministrador().addActionListener(this);
		vf.getFi().getVi().getBtnCliente().addActionListener(this);

		vf.getFenoi().getVenoi().getBtnInternacional().addActionListener(this);
		vf.getFenoi().getVenoi().getBtnNacional().addActionListener(this);
		vf.getFenoi().getVenoi().getBtnVolver().addActionListener(this);

		vf.getFc().getVc().getBtnCrear().addActionListener(this);
		vf.getFc().getVc().getBtnMostrar().addActionListener(this);
		vf.getFc().getVc().getBtnVolver().addActionListener(this);

		vf.getFan().getVan().getBtnCrearLlegada().addActionListener(this);
		vf.getFan().getVan().getBtnActualizarLlegada().addActionListener(this);
		vf.getFan().getVan().getBtnEliminarLlegada().addActionListener(this);
		vf.getFan().getVan().getBtnMostrarLlegada().addActionListener(this);
		vf.getFan().getVan().getBtnCrearSalida().addActionListener(this);
		vf.getFan().getVan().getBtnActualizarSalida().addActionListener(this);
		vf.getFan().getVan().getBtnEliminarSalida().addActionListener(this);
		vf.getFan().getVan().getBtnMostrarSalida().addActionListener(this);
		vf.getFan().getVan().getBtnVolver().addActionListener(this);

		// LlegadasNacionales
		vf.getFan().getVan().getBtnCrearLlegada().addActionListener(this);
		vf.getFan().getVan().getBtnActualizarLlegada().addActionListener(this);
		vf.getFactlln().getVactlln().getBtnVolverAct().addActionListener(this);
		vf.getFcln().getVcrln().getBtnGuardar().addActionListener(this);
		vf.getFcln().getVcrln().getJcbAreolinea().addActionListener(this);
		vf.getFcln().getVcrln().getBtnVolver().addActionListener(this);

		// SalidasNacionales
		vf.getFcsn().getVcrsn().getBtnVolver().addActionListener(this);

		// LlegadasInternacionalesLlegada
		vf.getFai().getVai().getBtnCrearLlegada().addActionListener(this);
		vf.getFclintn().getVcrlintn().getBtnVolver().addActionListener(this);
		// LlegadasInternacionalesSalida
		vf.getFai().getVai().getBtnCrearSalida().addActionListener(this);
		vf.getFcsintn().getVcrsintn().getBtnVolver().addActionListener(this);
		// Actualizar Llegadas y salidas internacionales
		vf.getFai().getVai().getBtnActualizarLlegada().addActionListener(this);
		vf.getFactlint().getVactlint().getBtnVolverAct().addActionListener(this);
		// SalidasInternac
		vf.getFai().getVai().getBtnActualizarSalida().addActionListener(this);
		vf.getFactsint().getVactlsint().getBtnVolverActInt().addActionListener(this);
		// Boton volver de fondoAdministradorInternacional
		vf.getFai().getVai().getBtnVolver().addActionListener(this);
	}

	public void btnVolverVntActLlegadaNacional() {
		vf.getFactlln().setVisible(false);
		vf.getFan().setVisible(true);
	}
	
	public void btnVentanaActLlegadaNacional() {
		vf.getFan().setVisible(false);
		vf.getFactlln().setVisible(true);
	}
	
	public void btnVentanaActSalidaInternacional() {
		vf.getFai().setVisible(false);
		vf.getFactsint().setVisible(true);
	}
	
	public void btnVolverVntActSalidaInternacional() {
		vf.getFactsint().setVisible(false);
		vf.getFai().setVisible(true);
	}
	
	public void btnVolverVntActLlegadaInternacional() {
		vf.getFactlint().setVisible(false);
		vf.getFai().setVisible(true);
	}
	
	public void btnActualizarLlegadaInternacional() {
		vf.getFai().setVisible(false);
		vf.getFactlint().setVisible(true);
	}

	public void btnCliente() {
		vf.getFi().setVisible(false);
		vf.getFc().setVisible(true);
	}

	public void btnVolverAMenuDesdeInt() {
		vf.getFai().setVisible(false);
		vf.getFenoi().setVisible(true);
	}

	public void btnCrearLlegadaNacional() {
		vf.getFan().setVisible(false);
		vf.getFcln().setVisible(true);
	}

	public void btnCrearSalidaNacional() {
		vf.getFan().setVisible(false);
		vf.getFcsn().setVisible(true);
	}

	public void btnVolverDesdeMenuNac() {
		vf.getFan().setVisible(false);
		vf.getFenoi().setVisible(true);
	}

	public void btnVolverLlegadaNacional() {
		vf.getFcln().setVisible(false);
		vf.getFan().setVisible(true);
	}

	public void btnVolverSalidaNacional() {
		vf.getFcsn().setVisible(false);
		vf.getFan().setVisible(true);
	}

	// Crear Llegadas internacionales
	public void btnCrearLlegadaInternacional() {
		vf.getFai().setVisible(false);
		vf.getFclintn().setVisible(true);
	}

	public void btnVolverLlegadasInt() {
		vf.getFclintn().setVisible(false);
		vf.getFai().setVisible(true);
	}

	// Crear Salidas Internacionales
	public void btnCrearSalidaInternacional() {
		vf.getFai().setVisible(false);
		vf.getFcsintn().setVisible(true);
	}

	public void btnVolverSalidaInt() {
		vf.getFcsintn().setVisible(false);
		vf.getFai().setVisible(true);
	}

	public void btnEscogerNOI() {
		vf.getFi().setVisible(false);
		vf.getFenoi().setVisible(true);

	}

	public void btnVolverInicio() {
		vf.getFenoi().setVisible(false);
		vf.getFi().setVisible(true);
	}

	private void btnAdministradorNacional() {
		vf.getFenoi().setVisible(false);
		vf.getFan().setVisible(true);
	}

	private void btnAdministradorInternacional() {
		vf.getFenoi().setVisible(false);
		vf.getFai().setVisible(true);
	}

	public void CrearLlegada() {
		mainloop: while (true) {
			VueloLlegadaNacionalDTO vueloLlegada;

			String aerolinea = (String) vf.getFcl().getVcrl().getJcbAreolinea().getSelectedItem();

			if (aerolinea == null || aerolinea.equals("")) {
				ExcepcionesVentana.mensaje("No ha seleccionado ninguna aerolinea");
				break mainloop;
			}

			String opc = vf.getFcl().getVcrl().getTxtLlegada().getText();
			LocalDateTime llegada = null;

			try {

				ExceptionChecker.verificarVacio(opc);

				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"); // Formato esperado
				llegada = LocalDateTime.parse(opc, formatter);
			} catch (VerificateNullException e1) {
				ExcepcionesVentana.vacia();
				vf.getFcl().getVcrl().getTxtLlegada().setText("");
				break mainloop;
			} catch (DateTimeParseException e1) {
				ExcepcionesVentana.mensaje("El formato de la fecha y hora de llegada no es válido.");
				vf.getFcl().getVcrl().getTxtLlegada().setText("");
				break mainloop;
			}

			if (llegada == null) {
				ExcepcionesVentana.mensaje("La fecha y hora de llegada no son válidas.");
				break mainloop;
			}

			String origen = vf.getFcl().getVcrl().getTxtOrigen().getText();

			if (origen == null || origen.equals("")) {
				ExcepcionesVentana.mensaje("El campo de origen no puede estar vacío");
				break mainloop;
			}

			String destino = "Aeropuerto El Dorado";

			MyLinkedList<Viajero> listaViajeros = obtenerListaViajeros();

			// Generar el ID del vuelo
			String numVuelo = generarIdVuelo(aerolinea);

			// Crear el vuelo de llegada
			vueloLlegada = new VueloLlegadaNacionalDTO(numVuelo, aerolinea, llegada, origen, destino, listaViajeros);

			if (mf.getVl().add(vueloLlegada)) {
				ExcepcionesVentana.creadoExitosamente(
						"El vuelo de llegada con los siguientes datos:\n" + vueloLlegada.toString());
				vf.getFcl().getVcrl().getTxtLlegada().setText("");
				vf.getFcl().getVcrl().getTxtOrigen().setText("");
				break mainloop;
			} else {
				ExcepcionesVentana.mensaje("Error al crear el vuelo de llegada. Intenta de nuevo.");
				break mainloop;
			}
		}
	}

	private MyLinkedList<Viajero> obtenerListaViajeros() {
		MyLinkedList<Viajero> lista = new MyLinkedList<>();
		// Aquí puedes agregar lógica para llenar la lista de viajeros
		// Ejemplo: Lista de viajeros seleccionados por el usuario o cargados desde
		// alguna fuente.
		return lista;
	}

	private String generarIdVuelo(String aerolinea) {
		String prefijo = "";
		switch (aerolinea) {
		case "Avianca":
			prefijo = "AV";
			break;
		case "Wingo":
			prefijo = "WG";
			break;
		case "LATAM":
			prefijo = "LA";
			break;
		case "Emirates":
			prefijo = "EK";
			break;
		case "Qatar":
			prefijo = "QR";
			break;
		default:
			prefijo = "XX";
			break;
		}
		int numero = (int) (Math.random() * 900) + 100;
		return prefijo + numero;
	}

}
