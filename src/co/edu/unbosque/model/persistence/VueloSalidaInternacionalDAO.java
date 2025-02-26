package co.edu.unbosque.model.persistence;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import co.edu.unbosque.model.Viajero;
import co.edu.unbosque.model.VueloSalidaInternacional;
import co.edu.unbosque.model.VueloSalidaInternacionalDTO;
import co.edu.unbosque.util.structure.linkedlist.MyLinkedList;

public class VueloSalidaInternacionalDAO implements CRUDOperation<VueloSalidaInternacionalDTO, VueloSalidaInternacional> {

	private MyLinkedList<VueloSalidaInternacional> listaVueloSalidaIn;
	private final String FILE_NAME = "VueloSalidaInternacional.csv";
	private final String SERIAL_NAME = "VueloSalidaInternacional.dat";

	public VueloSalidaInternacionalDAO() {
		FileHandler.checkFolder();
		readSerialized();
		readFile();
	}

	@Override
	public String showAll() {
		StringBuilder rta = new StringBuilder();
		if (listaVueloSalidaIn.isEmpty()) {
			return "No hay vuelos nacionales en la lista\n";
		} else {
			for (VueloSalidaInternacional vueloNacional : listaVueloSalidaIn) {
				rta.append(vueloNacional.toString()).append("\n");
			}
			return rta.toString();
		}
	}

	@Override
	public MyLinkedList<VueloSalidaInternacionalDTO> getAll() {
		return DataMapper.listaVueloSalidaInternacionalToListaVueloSalidaInternacionalDTO(listaVueloSalidaIn);
	}

	@Override
	public boolean add(VueloSalidaInternacionalDTO newData) {
		if (find(DataMapper.vueloSalidaInternacionalDTOToVueloSalidaInternacional(newData)) == null) {
			listaVueloSalidaIn.add(DataMapper.vueloSalidaInternacionalDTOToVueloSalidaInternacional(newData));
			writeFile();
			writeSerialized();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean delete(VueloSalidaInternacionalDTO toDelete) {
		VueloSalidaInternacional found = find(
				DataMapper.vueloSalidaInternacionalDTOToVueloSalidaInternacional(toDelete));
		if (found != null) {
			listaVueloSalidaIn.remove(found);
			writeFile();
			writeSerialized();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public VueloSalidaInternacional find(VueloSalidaInternacional toFind) {
		if (!listaVueloSalidaIn.isEmpty()) {
			for (VueloSalidaInternacional inter : listaVueloSalidaIn) {
				if ((inter.getNumVuelo().equals(toFind.getNumVuelo()))) {
					return inter;
				}
			}
		}
		return null;
	}

	public boolean update(VueloSalidaInternacionalDTO previous, VueloSalidaInternacionalDTO newData) {
		VueloSalidaInternacional found = find(
				DataMapper.vueloSalidaInternacionalDTOToVueloSalidaInternacional(previous));
		if (found != null) {
			listaVueloSalidaIn.remove(found);
			listaVueloSalidaIn.add(DataMapper.vueloSalidaInternacionalDTOToVueloSalidaInternacional(newData));
			writeFile();
			writeSerialized();
			return true;
		} else {
			return false;
		}
	}

	public void writeFile() {
		StringBuilder content = new StringBuilder();
		for (VueloSalidaInternacional v : listaVueloSalidaIn) {
			content.append(v.getNumVuelo()).append(";").append(v.getAerolinea()).append(";")
					.append(v.getFechaHoraSalida()).append(";").append(v.getOrigen()).append(";")
					.append(v.getDestino()).append(";").append(v.getListaViajeros()).append("\n");
		}
		FileHandler.writeFile(FILE_NAME, content.toString());
	}

	public void readFile() {
		String content = FileHandler.readFile(FILE_NAME);
		if (content == null || content.isEmpty()) {
			listaVueloSalidaIn = new MyLinkedList<>();
		} else {
			listaVueloSalidaIn = new MyLinkedList<>();
			String[] rows = content.split("\n");
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
			for (String row : rows) {
				String[] cols = row.split(";");
				VueloSalidaInternacional temporal = new VueloSalidaInternacional();
				temporal.setNumVuelo(cols[0]);
				temporal.setAerolinea(cols[1]);
				try {
					LocalDateTime fechaHora = LocalDateTime.parse(cols[2], formatter);
					temporal.setFechaHoraSalida(fechaHora);
				} catch (DateTimeParseException e) {
					System.err.println("Error al convertir fecha y hora: " + cols[2]);
					temporal.setFechaHoraSalida(null);
				}
				temporal.setOrigen(cols[3]);
				temporal.setDestino(cols[4]);
				MyLinkedList<Viajero> listaViajeros = new MyLinkedList<>();
				if (!cols[5].isEmpty()) {
					String[] viajerosData = cols[5].split(",");
					for (String viajeroStr : viajerosData) {
						Viajero viajero = new Viajero();
						viajero.setNombre(viajeroStr.trim());
						listaViajeros.add(viajero);
					}
				}
				temporal.setListaViajeros(listaViajeros);

				listaVueloSalidaIn.add(temporal);
			}
		}
	}

	public void writeSerialized() {
		FileHandler.writeSerialized(SERIAL_NAME, listaVueloSalidaIn);
	}

	public void readSerialized() {
		Object content = FileHandler.readSerialized(SERIAL_NAME);
		if (content == null) {
			listaVueloSalidaIn = new MyLinkedList<>();
		} else {
			listaVueloSalidaIn = (MyLinkedList<VueloSalidaInternacional>) content;
		}
	}
}
