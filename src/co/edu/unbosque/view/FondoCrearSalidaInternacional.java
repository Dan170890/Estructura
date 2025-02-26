package co.edu.unbosque.view;

import javax.swing.JFrame;

public class FondoCrearSalidaInternacional extends JFrame {

	private VentanaCrearSalidaInternacional vcrsintn;

	public FondoCrearSalidaInternacional() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		VentanaCrearSalidaInternacional vcrsintn = new VentanaCrearSalidaInternacional();
		setVcrsintn(vcrsintn);
		setContentPane(vcrsintn);
		setSize(800, 600);
		setUndecorated(false);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(false);
	}

	public VentanaCrearSalidaInternacional getVcrsintn() {
		return vcrsintn;
	}

	public void setVcrsintn(VentanaCrearSalidaInternacional vcrsintn) {
		this.vcrsintn = vcrsintn;
	}

	
	
	

}
