package co.edu.unbosque.view;

import javax.swing.JFrame;

public class FondoAdministradorNacional extends JFrame {
	
	private VentanaAdministradorNacional van;

	public FondoAdministradorNacional() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		VentanaAdministradorNacional van = new VentanaAdministradorNacional();
		setVan(van);
		setContentPane(van);
		setSize(800, 600);
		setUndecorated(false);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(false);
	}

	public VentanaAdministradorNacional getVan() {
		return van;
	}

	public void setVan(VentanaAdministradorNacional van) {
		this.van = van;
	}

	

	
}
