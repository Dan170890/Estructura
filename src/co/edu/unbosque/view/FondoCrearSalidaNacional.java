package co.edu.unbosque.view;

import javax.swing.JFrame;

public class FondoCrearSalidaNacional extends JFrame {

	private VentanaCrearSalidaNacional vcrsn;

	public FondoCrearSalidaNacional() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		VentanaCrearSalidaNacional vcrsn = new VentanaCrearSalidaNacional();
		setVcrsn(vcrsn);
		setContentPane(vcrsn);
		setSize(800, 600);
		setUndecorated(false);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(false);
	}

	public VentanaCrearSalidaNacional getVcrsn() {
		return vcrsn;
	}

	public void setVcrsn(VentanaCrearSalidaNacional vcrsn) {
		this.vcrsn = vcrsn;
	}

	
	
	

}
