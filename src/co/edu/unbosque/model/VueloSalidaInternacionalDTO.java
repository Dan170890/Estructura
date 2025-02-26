package co.edu.unbosque.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import co.edu.unbosque.util.structure.linkedlist.MyLinkedList;

public class VueloSalidaInternacionalDTO implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6839240293531895503L;
	private String numVuelo;
	private String aerolinea;
	private LocalDateTime fechaHoraSalida;
	private String origen;
	private String destino;
	private MyLinkedList<Viajero> listaViajeros;

	public VueloSalidaInternacionalDTO() {
		// TODO Auto-generated constructor stub
	}

	public VueloSalidaInternacionalDTO(String numVuelo, String aerolinea, LocalDateTime fechaHoraSalida, String origen, String destino,
			MyLinkedList<Viajero> listaViajeros) {
		this.numVuelo = numVuelo;
		this.aerolinea = aerolinea;
		this.fechaHoraSalida = fechaHoraSalida;
		this.origen = origen;
		this.destino = destino;
		this.listaViajeros = listaViajeros;
	}

	public String getNumVuelo() {
		return numVuelo;
	}

	public void setNumVuelo(String numVuelo) {
		this.numVuelo = numVuelo;
	}

	public String getAerolinea() {
		return aerolinea;
	}

	public void setAerolinea(String aerolinea) {
		this.aerolinea = aerolinea;
	}

	public LocalDateTime getFechaHoraSalida() {
		return fechaHoraSalida;
	}

	public void setFechaHoraSalida(LocalDateTime fechaHoraSalida) {
		this.fechaHoraSalida = fechaHoraSalida;
	}

	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public MyLinkedList<Viajero> getListaViajeros() {
		return listaViajeros;
	}

	public void setListaViajeros(MyLinkedList<Viajero> listaViajeros) {
		this.listaViajeros = listaViajeros;
	}

	@Override
	public String toString() {
		return "Vuelo [numVuelo=" + numVuelo + ", aerolinea=" + aerolinea + ", fechaHoraSalida=" + fechaHoraSalida
				+ ", origen=" + origen + ", destino=" + destino + ", listaViajeros=" + listaViajeros + "]";
	}


}
