package co.edu.unbosque.model;

import co.edu.unbosque.model.persistence.ViajeroDAO;
import co.edu.unbosque.model.persistence.VueloLlegadaInternacionalDAO;
import co.edu.unbosque.model.persistence.VueloLlegadaNacionalDAO;
import co.edu.unbosque.model.persistence.VueloSalidaInternacionalDAO;
import co.edu.unbosque.model.persistence.VueloSalidaNacionalDAO;

public class ModelFacade {

	private ViajeroDAO via;
	private VueloSalidaNacionalDAO vsn;
	private VueloLlegadaNacionalDAO vln;
	private VueloSalidaInternacionalDAO vsi;
	private VueloLlegadaInternacionalDAO vli;
	
	public ModelFacade() {
		via = new ViajeroDAO();
		vsn = new VueloSalidaNacionalDAO();
		vln = new VueloLlegadaNacionalDAO();
		vsi = new VueloSalidaInternacionalDAO();
		vli = new VueloLlegadaInternacionalDAO();
	}

	public ViajeroDAO getVia() {
		return via;
	}

	public void setVia(ViajeroDAO via) {
		this.via = via;
	}

	public VueloSalidaNacionalDAO getVsn() {
		return vsn;
	}

	public void setVsn(VueloSalidaNacionalDAO vsn) {
		this.vsn = vsn;
	}

	public VueloLlegadaNacionalDAO getVln() {
		return vln;
	}

	public void setVln(VueloLlegadaNacionalDAO vln) {
		this.vln = vln;
	}

	public VueloSalidaInternacionalDAO getVsi() {
		return vsi;
	}

	public void setVsi(VueloSalidaInternacionalDAO vsi) {
		this.vsi = vsi;
	}

	public VueloLlegadaInternacionalDAO getVli() {
		return vli;
	}

	public void setVli(VueloLlegadaInternacionalDAO vli) {
		this.vli = vli;
	}
	
	

	
}
