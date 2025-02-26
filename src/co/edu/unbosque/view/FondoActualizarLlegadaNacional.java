package co.edu.unbosque.view;

import javax.swing.JFrame;

public class FondoActualizarLlegadaNacional extends JFrame {

	private VentanaActualizarLlegadaNacional vactlln;

	public FondoActualizarLlegadaNacional() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		VentanaActualizarLlegadaNacional vactlln = new VentanaActualizarLlegadaNacional();
		setVactlln(vactlln);
		setContentPane(vactlln);
		setSize(800, 600);
		setUndecorated(false);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(false);
	}

	public VentanaActualizarLlegadaNacional getVactlln() {
		return vactlln;
	}

	public void setVactlln(VentanaActualizarLlegadaNacional vactln) {
		this.vactlln = vactln;
	}

	



	

	
	
	

}
