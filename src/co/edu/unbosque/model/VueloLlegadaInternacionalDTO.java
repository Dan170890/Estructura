package co.edu.unbosque.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import co.edu.unbosque.util.structure.linkedlist.MyLinkedList;

public class VueloLlegadaInternacionalDTO implements Serializable {

	/**
	* 
	*/
	private static final long serialVersionUID = 4504191350922488866L;
	private String numVuelo;
	private String aerolinea;
	private LocalDateTime fechaHoraLlegada;
	private String origen;
	private String destino;
	private MyLinkedList<Viajero> listaViajeros;

	public VueloLlegadaInternacionalDTO() {
		// TODO Auto-generated constructor stub
	}

	public VueloLlegadaInternacionalDTO(String numVuelo, String aerolinea, LocalDateTime fechaHoraLlegada, String origen,
			String destino, MyLinkedList<Viajero> listaViajeros) {
		super();
		this.numVuelo = numVuelo;
		this.aerolinea = aerolinea;
		this.fechaHoraLlegada = fechaHoraLlegada;
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

	public LocalDateTime getFechaHoraLlegada() {
		return fechaHoraLlegada;
	}

	public void setFechaHoraLlegada(LocalDateTime fechaHoraLlegada) {
		this.fechaHoraLlegada = fechaHoraLlegada;
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

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "VueloLlegada [numVuelo=" + numVuelo + ", aerolinea=" + aerolinea + ", fechaHoraLlegada="
				+ fechaHoraLlegada + ", origen=" + origen + ", destino=" + destino + ", listaViajeros=" + listaViajeros
				+ "]";
	}

}
