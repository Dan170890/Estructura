package co.edu.unbosque.view;

import javax.swing.JFrame;

public class FondoEscogerNOI extends JFrame {
	
	private VentanaEscogerNOI venoi;

	public FondoEscogerNOI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		VentanaEscogerNOI venoi = new VentanaEscogerNOI();
		setVenoi(venoi);
		setContentPane(venoi);
		setSize(800, 600);
		setUndecorated(false);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(false);
	}

	public VentanaEscogerNOI getVenoi() {
		return venoi;
	}

	public void setVenoi(VentanaEscogerNOI venoi) {
		this.venoi = venoi;
	}

	

	
}
