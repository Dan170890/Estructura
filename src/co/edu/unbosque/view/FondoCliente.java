package co.edu.unbosque.view;

import javax.swing.JFrame;

public class FondoCliente extends JFrame{
	
	private VentanaCliente vc;

	public FondoCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		VentanaCliente vc = new VentanaCliente();
		setVc(vc);
		setContentPane(vc);
		setSize(800, 600);
		setUndecorated(false);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(false);
	}

	public VentanaCliente getVc() {
		return vc;
	}

	public void setVc(VentanaCliente vc) {
		this.vc = vc;
	}
	

}
