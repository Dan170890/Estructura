package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VentanaCrearLlegadaInternacional extends JPanel{
	
	JButton btnVolver, btnGuardar;
	private JTextField txtOrigen, txtLlegada;
	private JComboBox<String> jcbAreolinea;
	
	public VentanaCrearLlegadaInternacional() {
		setLayout(null);

		btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(176, 400, 416, 73);
		btnGuardar.setBorderPainted(true);
		btnGuardar.setContentAreaFilled(true);
		add(btnGuardar);

		btnVolver = new JButton("volver");
		btnVolver.setBounds(650, 22, 135, 75);
		btnVolver.setBorderPainted(true);
		btnVolver.setContentAreaFilled(true);
		add(btnVolver);
		
		txtLlegada = new JTextField("");
		txtLlegada.setVisible(true);
		txtLlegada.setBounds(505, 325, 105, 50);
		add(txtLlegada);
		
		txtOrigen = new JTextField("");
		txtOrigen.setVisible(true);
		txtOrigen.setBounds(150, 325, 105, 50);
		add(txtOrigen);
	
		String[] aerolineas = { "Avianca", "Wingo", "LATAM", "Emirates", "Qatar" };
		DefaultComboBoxModel<String> modelo = new DefaultComboBoxModel<>(aerolineas);
		jcbAreolinea = new JComboBox<>(modelo);
		jcbAreolinea.setBounds(296, 100, 170, 65);
		add(jcbAreolinea);
		
		setVisible(true);
	}
	//descomentar cuando haya imagen
	@Override
	public void paintComponent(Graphics g) {
		Dimension tamano = getSize();
		//ImageIcon imagenFondo = new ImageIcon(getClass().getResource("VentanaCliente.png"));
	//	g.drawImage(imagenFondo.getImage(), 0, 0, tamano.width, tamano.height, null);
	//	setOpaque(false);
		//super.paintComponent(g);
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}

	public JButton getBtnGuardar() {
		return btnGuardar;
	}

	public void setBtnGuardar(JButton btnGuardar) {
		this.btnGuardar = btnGuardar;
	}

	public JTextField getTxtOrigen() {
		return txtOrigen;
	}

	public void setTxtOrigen(JTextField txtOrigen) {
		this.txtOrigen = txtOrigen;
	}

	public JComboBox<String> getJcbAreolinea() {
		return jcbAreolinea;
	}

	public void setJcbAreolinea(JComboBox<String> jcbAreolinea) {
		this.jcbAreolinea = jcbAreolinea;
	}

	public JTextField getTxtLlegada() {
		return txtLlegada;
	}

	public void setTxtLlegada(JTextField txtLlegada) {
		this.txtLlegada = txtLlegada;
	}
	

}
