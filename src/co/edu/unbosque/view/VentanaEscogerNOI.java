package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class VentanaEscogerNOI extends JPanel {

	private JButton btnInternacional, btnNacional, btnVolver;

	public VentanaEscogerNOI() {
		setLayout(null);
		
		btnVolver = new JButton("");
		btnVolver.setBounds(600, 72, 80, 80);
		btnVolver.setBorderPainted(false);
		btnVolver.setContentAreaFilled(false);
		add(btnVolver);

		
		btnNacional = new JButton("");
		btnNacional.setBounds(310,350, 170, 170);
		btnNacional.setBorderPainted(false);
		btnNacional.setContentAreaFilled(false);
		add(btnNacional);

		btnInternacional = new JButton("");
		btnInternacional.setBounds(310, 161, 170, 170);
		btnInternacional.setBorderPainted(false);
		btnInternacional.setContentAreaFilled(false);
		add(btnInternacional);

		setVisible(true);
	}

	@Override
	public void paintComponent(Graphics g) {
		Dimension tamano = getSize();
		ImageIcon imagenFondo = new ImageIcon(getClass().getResource("EscogerNOI.jpg"));
		g.drawImage(imagenFondo.getImage(), 0, 0, tamano.width, tamano.height, null);
		setOpaque(false);
		super.paintComponent(g);
	}

	public JButton getBtnInternacional() {
		return btnInternacional;
	}

	public void setBtnInternacional(JButton btnInternacional) {
		this.btnInternacional = btnInternacional;
	}

	public JButton getBtnNacional() {
		return btnNacional;
	}

	public void setBtnNacional(JButton btnNacional) {
		this.btnNacional = btnNacional;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}

	
	

}