package co.edu.unbosque.view;

public class ViewFacade {

	private FondoInicio fi;
	private FondoEscogerNOI fenoi;
	private FondoAdministradorNacional fan;
	private FondoAdministradorInternacional fai;
	private FondoCliente fc;
	private FondoCrearLlegadaNacional fcln;
	private FondoCrearLlegadaInternacional fclintn;
	private FondoCrearSalidaInternacional fcsintn;
	private FondoCrearSalidaNacional fcsn;
	private FondoActualizarLlegadaInternacional factlint;
	private FondoActualizarSalidaInternacional factsint;
	private FondoActualizarLlegadaNacional factlln;

	public ViewFacade() {
		fi = new FondoInicio();
		fenoi = new FondoEscogerNOI();
		fan = new FondoAdministradorNacional();
		fai = new FondoAdministradorInternacional();
		fc = new FondoCliente();
		fcln = new FondoCrearLlegadaNacional();
		fclintn = new FondoCrearLlegadaInternacional();
		fcsintn = new FondoCrearSalidaInternacional();
		fcsn = new FondoCrearSalidaNacional();
		factlint = new FondoActualizarLlegadaInternacional();
		factsint = new FondoActualizarSalidaInternacional();
		factlln = new FondoActualizarLlegadaNacional();
	}

	
	
	public FondoActualizarLlegadaNacional getFactlln() {
		return factlln;
	}



	public void setFactlln(FondoActualizarLlegadaNacional factlln) {
		this.factlln = factlln;
	}



	public FondoActualizarSalidaInternacional getFactsint() {
		return factsint;
	}



	public void setFactsint(FondoActualizarSalidaInternacional factsint) {
		this.factsint = factsint;
	}



	public FondoActualizarLlegadaInternacional getFactlint() {
		return factlint;
	}



	public void setFactlint(FondoActualizarLlegadaInternacional factlint) {
		this.factlint = factlint;
	}



	public FondoCrearSalidaNacional getFcsn() {
		return fcsn;
	}


	public void setFcsn(FondoCrearSalidaNacional fcsn) {
		this.fcsn = fcsn;
	}


	public FondoCrearSalidaInternacional getFcsintn() {
		return fcsintn;
	}

	public void setFcsintn(FondoCrearSalidaInternacional fcsintn) {
		this.fcsintn = fcsintn;
	}

	public FondoCrearLlegadaInternacional getFclintn() {
		return fclintn;
	}

	public void setFclintn(FondoCrearLlegadaInternacional fclintn) {
		this.fclintn = fclintn;
	}

	public FondoInicio getFi() {
		return fi;
	}

	public void setFi(FondoInicio fi) {
		this.fi = fi;
	}

	public FondoEscogerNOI getFenoi() {
		return fenoi;
	}

	public void setFenoi(FondoEscogerNOI fenoi) {
		this.fenoi = fenoi;
	}

	public FondoAdministradorNacional getFan() {
		return fan;
	}

	public void setFan(FondoAdministradorNacional fan) {
		this.fan = fan;
	}

	public FondoCliente getFc() {
		return fc;
	}

	public void setFc(FondoCliente fc) {
		this.fc = fc;
	}

	public FondoCrearLlegadaNacional getFcln() {
		return fcln;
	}

	public void setFcln(FondoCrearLlegadaNacional fcln) {
		this.fcln = fcln;
	}

	public FondoAdministradorInternacional getFai() {
		return fai;
	}

	public void setFai(FondoAdministradorInternacional fai) {
		this.fai = fai;
	}

}
