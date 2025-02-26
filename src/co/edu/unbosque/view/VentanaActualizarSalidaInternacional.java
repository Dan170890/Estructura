package co.edu.unbosque.view;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaActualizarSalidaInternacional extends JPanel {

	JButton btnActualizar, btnVolverActInt;
	private JTextField txtIdSearch, txtOrigen, txtFechaHoraLlegada;
	private JTextArea txtArea;
	private JScrollPane scpScroll;

	public VentanaActualizarSalidaInternacional() {
		setLayout(null);

		txtIdSearch = new JTextField("");
		txtIdSearch.setVisible(true);
		txtIdSearch.setBounds(60, 150, 220, 50);
		add(txtIdSearch);

		btnActualizar = new JButton("Actualizar");
		btnActualizar.setBounds(105, 410, 130, 50);
		add(btnActualizar);

		btnVolverActInt = new JButton("Volver");
		btnVolverActInt.setBounds(660, 490, 90, 50);
		add(btnVolverActInt);

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

	public JButton getBtnActualizar() {
		return btnActualizar;
	}

	public void setBtnActualizar(JButton btnActualizar) {
		this.btnActualizar = btnActualizar;
	}

	public JButton getBtnVolverActInt() {
		return btnVolverActInt;
	}

	public void setBtnVolverActInt(JButton btnVolverActInt) {
		this.btnVolverActInt = btnVolverActInt;
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
