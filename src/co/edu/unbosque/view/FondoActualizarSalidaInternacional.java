package co.edu.unbosque.view;

import javax.swing.JFrame;

public class FondoActualizarSalidaInternacional extends JFrame {

	private VentanaActualizarSalidaInternacional vactlsint;

	public FondoActualizarSalidaInternacional() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		VentanaActualizarSalidaInternacional vactlsint = new VentanaActualizarSalidaInternacional();
		setVactlsint(vactlsint);
		setContentPane(vactlsint);
		setSize(800, 600);
		setUndecorated(false);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(false);
	}

	public VentanaActualizarSalidaInternacional getVactlsint() {
		return vactlsint;
	}

	public void setVactlsint(VentanaActualizarSalidaInternacional vactlsint) {
		this.vactlsint = vactlsint;
	}


}
