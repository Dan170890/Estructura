package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

public class VentanaAdministradorNacional extends JPanel{

	private JButton btnActualizarSalida, btnMostrarSalida, btnEliminarSalida, btnCrearSalida, btnVolver,
	btnActualizarLlegada, btnMostrarLlegada, btnEliminarLlegada, btnCrearLlegada;
	
	public VentanaAdministradorNacional() {
		setLayout(null);

		btnVolver = new JButton("");
		btnVolver.setBounds(600, 72, 80, 80);
		btnVolver.setBorderPainted(false);
		btnVolver.setContentAreaFilled(false);
		add(btnVolver);

		btnActualizarSalida = new JButton("");
		btnActualizarSalida.setBounds(412, 365, 140, 165);
		btnActualizarSalida.setBorderPainted(false);
		btnActualizarSalida.setContentAreaFilled(false);
		add(btnActualizarSalida);
		
		btnMostrarSalida = new JButton("");
		btnMostrarSalida.setBounds(605, 365,140, 165);
		btnMostrarSalida.setBorderPainted(false);
		btnMostrarSalida.setContentAreaFilled(false);
		add(btnMostrarSalida);

		btnEliminarSalida = new JButton("");
		btnEliminarSalida.setBounds(225, 365,140, 165);
		btnEliminarSalida.setBorderPainted(false);
		btnEliminarSalida.setContentAreaFilled(false);
		add(btnEliminarSalida);

		btnCrearSalida = new JButton(" ");
		btnCrearSalida.setBounds(52,365, 140, 165);
		btnCrearSalida.setBorderPainted(false);
		btnCrearSalida.setContentAreaFilled(false);
		add(btnCrearSalida);
		
		btnActualizarLlegada = new JButton("");
		btnActualizarLlegada.setBounds(412, 170, 140, 165);
		btnActualizarLlegada.setBorderPainted(false);
		btnActualizarLlegada.setContentAreaFilled(false);
		add(btnActualizarLlegada);

		btnMostrarLlegada = new JButton("");
		btnMostrarLlegada.setBounds(605, 170, 140, 165);
		btnMostrarLlegada.setBorderPainted(false);
		btnMostrarLlegada.setContentAreaFilled(false);
		add(btnMostrarLlegada);
		
		btnEliminarLlegada = new JButton("");
		btnEliminarLlegada.setBounds(227, 173, 140, 165);
		btnEliminarLlegada.setBorderPainted(false);
		btnEliminarLlegada.setContentAreaFilled(false);
		add(btnEliminarLlegada);
		
		btnCrearLlegada = new JButton("");
		btnCrearLlegada.setBounds(52, 170, 140, 165);
		btnCrearLlegada.setBorderPainted(false);
		btnCrearLlegada.setContentAreaFilled(false);
		add(btnCrearLlegada);
		
		setVisible(true);
	}
	@Override
	public void paintComponent(Graphics g) {
		Dimension tamano = getSize();
		ImageIcon imagenFondo = new ImageIcon(getClass().getResource("MenuNacionales.png"));
		g.drawImage(imagenFondo.getImage(), 0, 0, tamano.width, tamano.height, null);
		setOpaque(false);
		super.paintComponent(g);
	}
	public JButton getBtnActualizarSalida() {
		return btnActualizarSalida;
	}
	public void setBtnActualizarSalida(JButton btnActualizarSalida) {
		this.btnActualizarSalida = btnActualizarSalida;
	}
	public JButton getBtnMostrarSalida() {
		return btnMostrarSalida;
	}
	public void setBtnMostrarSalida(JButton btnMostrarSalida) {
		this.btnMostrarSalida = btnMostrarSalida;
	}
	public JButton getBtnEliminarSalida() {
		return btnEliminarSalida;
	}
	public void setBtnEliminarSalida(JButton btnEliminarSalida) {
		this.btnEliminarSalida = btnEliminarSalida;
	}
	public JButton getBtnCrearSalida() {
		return btnCrearSalida;
	}
	public void setBtnCrearSalida(JButton btnCrearSalida) {
		this.btnCrearSalida = btnCrearSalida;
	}
	public JButton getBtnVolver() {
		return btnVolver;
	}
	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}
	public JButton getBtnActualizarLlegada() {
		return btnActualizarLlegada;
	}
	public void setBtnActualizarLlegada(JButton btnActualizarLlegada) {
		this.btnActualizarLlegada = btnActualizarLlegada;
	}
	public JButton getBtnMostrarLlegada() {
		return btnMostrarLlegada;
	}
	public void setBtnMostrarLlegada(JButton btnMostrarLlegada) {
		this.btnMostrarLlegada = btnMostrarLlegada;
	}
	public JButton getBtnEliminarLlegada() {
		return btnEliminarLlegada;
	}
	public void setBtnEliminarLlegada(JButton btnEliminarLlegada) {
		this.btnEliminarLlegada = btnEliminarLlegada;
	}
	public JButton getBtnCrearLlegada() {
		return btnCrearLlegada;
	}
	public void setBtnCrearLlegada(JButton btnCrearLlegada) {
		this.btnCrearLlegada = btnCrearLlegada;
	}



}