package co.edu.unbosque.view;

import javax.swing.JFrame;

public class FondoCrearLlegadaInternacional extends JFrame {

	private VentanaCrearLlegadaInternacional vcrlintn;

	public FondoCrearLlegadaInternacional() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		VentanaCrearLlegadaInternacional vcrlintn = new VentanaCrearLlegadaInternacional();
		setVcrlintn(vcrlintn);
		setContentPane(vcrlintn);
		setSize(800, 600);
		setUndecorated(false);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(false);
	}

	public VentanaCrearLlegadaInternacional getVcrlintn() {
		return vcrlintn;
	}

	public void setVcrlintn(VentanaCrearLlegadaInternacional vcrlintn) {
		this.vcrlintn = vcrlintn;
	}

	
	
	

}
