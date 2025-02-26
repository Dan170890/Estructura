package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.Graphics;


import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class VentanaCliente extends JPanel {

	private JButton btnCrear, btnMostrar, btnVolver;

	public VentanaCliente() {
		setLayout(null);

		btnCrear = new JButton("");
		btnCrear.setBounds(115, 264, 188, 188);
		btnCrear.setBorderPainted(false);
		btnCrear.setContentAreaFilled(false);
		add(btnCrear);

		btnMostrar = new JButton("");
		btnMostrar.setBounds(418, 264, 188, 188);
		btnMostrar.setBorderPainted(false);
		btnMostrar.setContentAreaFilled(false);
		add(btnMostrar);
		
		btnVolver = new JButton("");
		btnVolver.setBounds(600, 72, 80, 80);
		btnVolver.setBorderPainted(false);
		btnVolver.setContentAreaFilled(false);
		add(btnVolver);
		
		setVisible(true);
	}

	@Override
	public void paintComponent(Graphics g) {
		Dimension tamano = getSize();
		ImageIcon imagenFondo = new ImageIcon(getClass().getResource("User.jpg"));
		g.drawImage(imagenFondo.getImage(), 0, 0, tamano.width, tamano.height, null);
		setOpaque(false);
		super.paintComponent(g);
	}

	public JButton getBtnCrear() {
		return btnCrear;
	}

	public void setBtnCrear(JButton btnCrear) {
		this.btnCrear = btnCrear;
	}

	public JButton getBtnMostrar() {
		return btnMostrar;
	}

	public void setBtnMostrar(JButton btnMostrar) {
		this.btnMostrar = btnMostrar;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}


}