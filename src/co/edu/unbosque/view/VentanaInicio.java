package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class VentanaInicio extends JPanel {

	private JButton btnAdministrador, btnCliente;

	public VentanaInicio() {
		setLayout(null);
		
		btnCliente = new JButton("");
		btnCliente.setBounds(161, 302, 172, 164);
		btnCliente.setBorderPainted(false);
		btnCliente.setContentAreaFilled(false);
		add(btnCliente);

		btnAdministrador = new JButton("");
		btnAdministrador.setBounds(476, 302, 172, 164);
		btnAdministrador.setBorderPainted(false);
		btnAdministrador.setContentAreaFilled(false);
		add(btnAdministrador);

		setVisible(true);
	}

	@Override
	public void paintComponent(Graphics g) {
		Dimension tamano = getSize();
		ImageIcon imagenFondo = new ImageIcon(getClass().getResource("Bienvenidos.jpg"));
		g.drawImage(imagenFondo.getImage(), 0, 0, tamano.width, tamano.height, null);
		setOpaque(false);
		super.paintComponent(g);
	}

	public JButton getBtnAdministrador() {
		return btnAdministrador;
	}

	public void setBtnAdministrador(JButton btnAdministrador) {
		this.btnAdministrador = btnAdministrador;
	}

	public JButton getBtnCliente() {
		return btnCliente;
	}

	public void setBtnCliente(JButton btnCliente) {
		this.btnCliente = btnCliente;
	}

}