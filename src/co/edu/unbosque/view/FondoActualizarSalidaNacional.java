package co.edu.unbosque.view;

import javax.swing.JFrame;

public class FondoActualizarSalidaNacional extends JFrame {

	private VentanaActualizarSalidaNacional vactlsn;

	public FondoActualizarSalidaNacional() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		VentanaActualizarSalidaNacional vactlsn = new VentanaActualizarSalidaNacional();
		setVactlsn(vactlsn);
		setContentPane(vactlsn);
		setSize(800, 600);
		setUndecorated(false);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(false);
	}

	public VentanaActualizarSalidaNacional getVactlsn() {
		return vactlsn;
	}

	public void setVactlsn(VentanaActualizarSalidaNacional vactlsn) {
		this.vactlsn = vactlsn;
	}


}
