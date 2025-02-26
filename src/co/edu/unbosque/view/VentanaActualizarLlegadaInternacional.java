package co.edu.unbosque.view;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaActualizarLlegadaInternacional extends JPanel{

	JButton btnActualizar, btnVolverAct;
	private JTextField txtIdSearch, txtOrigen, txtFechaHoraLlegada;
	private JTextArea txtArea;
	private JScrollPane scpScroll;
	
	public VentanaActualizarLlegadaInternacional() {
		setLayout(null);
		
		txtIdSearch = new JTextField("");
		txtIdSearch.setVisible(true);
		txtIdSearch.setBounds(60, 150, 220, 50);
		add(txtIdSearch);
		
		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(105, 410, 130, 50);
		add(btnActualizar);
		
		btnVolverAct = new JButton("Volver");
		btnVolverAct.setBounds(660, 490, 90, 50);
		add(btnVolverAct);
		
		txtFechaHoraLlegada = new JTextField("");
		txtFechaHoraLlegada.setVisible(true);
		txtFechaHoraLlegada.setBounds(60, 237, 220, 50);
		add(txtFechaHoraLlegada);
		
		txtOrigen = new JTextField("");
		txtOrigen.setVisible(true);
		txtOrigen.setBounds(60, 330, 220, 50);
		add(txtOrigen);
		
		scpScroll = new JScrollPane(txtArea);
		scpScroll.setBounds(450, 20, 300, 450);
		scpScroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

		add(scpScroll);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		Dimension tamano = getSize();
		ImageIcon imagenFondo = new ImageIcon(getClass().getResource("ActualizarInternacional.png"));
		g.drawImage(imagenFondo.getImage(), 0, 0, tamano.width, tamano.height, null);
		setOpaque(false);
		super.paintComponent(g);
	}

	
	
	public JButton getBtnActualizar() {
		return btnActualizar;
	}



	public void setBtnActualizar(JButton btnActualizar) {
		this.btnActualizar = btnActualizar;
	}



	public JButton getBtnVolverAct() {
		return btnVolverAct;
	}



	public void setBtnVolverAct(JButton btnVolverAct) {
		this.btnVolverAct = btnVolverAct;
	}



	public JTextField getTxtIdSearch() {
		return txtIdSearch;
	}



	public void setTxtIdSearch(JTextField txtIdSearch) {
		this.txtIdSearch = txtIdSearch;
	}



	public JTextArea getTxtArea() {
		return txtArea;
	}



	public void setTxtArea(JTextArea txtArea) {
		this.txtArea = txtArea;
	}



	public JScrollPane getScpScroll() {
		return scpScroll;
	}



	public void setScpScroll(JScrollPane scpScroll) {
		this.scpScroll = scpScroll;
	}



	public JTextField getTxtOrigen() {
		return txtOrigen;
	}

	public void setTxtOrigen(JTextField txtOrigen) {
		this.txtOrigen = txtOrigen;
	}

	public JTextField getTxtFechaHoraLlegada() {
		return txtFechaHoraLlegada;
	}

	public void setTxtFechaHoraLlegada(JTextField txtFechaHoraLlegada) {
		this.txtFechaHoraLlegada = txtFechaHoraLlegada;
	}
	
}
