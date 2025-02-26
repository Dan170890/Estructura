package co.edu.unbosque.view;

import javax.swing.JFrame;

public class FondoCrearLlegadaNacional extends JFrame {

	private VentanaCrearLlegadaNacional vcrln;

	public FondoCrearLlegadaNacional() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		VentanaCrearLlegadaNacional vcrn = new VentanaCrearLlegadaNacional();
		setVcrln(vcrn);
		setContentPane(vcrn);
		setSize(800, 600);
		setUndecorated(false);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(false);
	}

	public VentanaCrearLlegadaNacional getVcrln() {
		return vcrln;
	}

	public void setVcrln(VentanaCrearLlegadaNacional vcrln) {
		this.vcrln = vcrln;
	}
	
	

}
