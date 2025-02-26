package co.edu.unbosque.view;

import javax.swing.JFrame;

public class FondoAdministradorInternacional extends JFrame {

	private VentanaAdministradorInternacional vai;

	public FondoAdministradorInternacional() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		VentanaAdministradorInternacional vai = new VentanaAdministradorInternacional();
		setVai(vai);
		setContentPane(vai);
		setSize(800, 600);
		setUndecorated(false);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(false);
	}

	public VentanaAdministradorInternacional getVai() {
		return vai;
	}

	public void setVai(VentanaAdministradorInternacional vai) {
		this.vai = vai;
	}

	

}
