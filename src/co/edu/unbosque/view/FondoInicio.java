package co.edu.unbosque.view;

import javax.swing.JFrame;

public class FondoInicio extends JFrame {

	private VentanaInicio vi;

	public FondoInicio() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		VentanaInicio vi = new VentanaInicio();
		setVi(vi);
		setContentPane(vi);
		setSize(800, 600);
		setUndecorated(false);
		setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}

	public VentanaInicio getVi() {
		return vi;
	}

	public void setVi(VentanaInicio vi) {
		this.vi = vi;
	}

}