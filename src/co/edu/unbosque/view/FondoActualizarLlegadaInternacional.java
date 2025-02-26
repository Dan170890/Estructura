package co.edu.unbosque.view;

import javax.swing.JFrame;

public class FondoActualizarLlegadaInternacional extends JFrame {

	private VentanaActualizarLlegadaInternacional vactlint;

	public FondoActualizarLlegadaInternacional() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		VentanaActualizarLlegadaInternacional vactlint = new VentanaActualizarLlegadaInternacional();
		setVactlint(vactlint);
		setContentPane(vactlint);
		setSize(800, 600);
		setUndecorated(false);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(false);
	}

	public VentanaActualizarLlegadaInternacional getVactlint() {
		return vactlint;
	}

	public void setVactlint(VentanaActualizarLlegadaInternacional vactlint) {
		this.vactlint = vactlint;
	}



	

	
	
	

}
