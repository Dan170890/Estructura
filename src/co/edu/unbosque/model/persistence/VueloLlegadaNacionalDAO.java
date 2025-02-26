package co.edu.unbosque.model.persistence;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import co.edu.unbosque.model.Viajero;
import co.edu.unbosque.model.VueloLlegadaNacional;
import co.edu.unbosque.model.VueloLlegadaNacionalDTO;
import co.edu.unbosque.util.structure.linkedlist.MyLinkedList;

public class VueloLlegadaNacionalDAO implements CRUDOperation<VueloLlegadaNacionalDTO, VueloLlegadaNacional> {

	private MyLinkedList<VueloLlegadaNacional> listaVueloLlegadaNacio;
	private final String FILE_NAME = "vueloLlegadaNacional.csv";
	private final String SERIAL_NAME = "vueloLlegadaNacional.dat";

	public VueloLlegadaNacionalDAO() {
		FileHandler.checkFolder();
		readSerialized();
		readFile();
	}

	@Override
	public String showAll() {
		StringBuilder rta = new StringBuilder();
		if (listaVueloLlegadaNacio.isEmpty()) {
			return "No hay vuelos nacionales en la lista\n";
		} else {
			for (VueloLlegadaNacional vueloNacional : listaVueloLlegadaNacio) {
				rta.append(vueloNacional.toString()).append("\n");
			}
			return rta.toString();
		}
	}

	@Override
	public MyLinkedList<VueloLlegadaNacionalDTO> getAll() {
		return DataMapper.listaVueloLlegadaNacionalToListaVueloLlegadaNacionalDTO(listaVueloLlegadaNacio);
	}

	@Override
	public boolean add(VueloLlegadaNacionalDTO newData) {
		if (find(DataMapper.vueloLlegadaNacionalDTOToVueloLlegadaNacional(newData)) == null) {
			listaVueloLlegadaNacio.add(DataMapper.vueloLlegadaNacionalDTOToVueloLlegadaNacional(newData));
			writeFile();
			writeSerialized();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean delete(VueloLlegadaNacionalDTO toDelete) {
		VueloLlegadaNacional found = find(
				DataMapper.vueloLlegadaNacionalDTOToVueloLlegadaNacional(toDelete));
		if (found != null) {
			listaVueloLlegadaNacio.remove(found);
			writeFile();
			writeSerialized();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public VueloLlegadaNacional find(VueloLlegadaNacional toFind) {
		if (!listaVueloLlegadaNacio.isEmpty()) {
			for (VueloLlegadaNacional inter : listaVueloLlegadaNacio) {
				if ((inter.getNumVuelo().equals(toFind.getNumVuelo()))) {
					return inter;
				}
			}
		}
		return null;
	}

	public boolean update(VueloLlegadaNacionalDTO previous, VueloLlegadaNacionalDTO newData) {
		VueloLlegadaNacional found = find(
				DataMapper.vueloLlegadaNacionalDTOToVueloLlegadaNacional(previous));
		if (found != null) {
			listaVueloLlegadaNacio.remove(found);
			listaVueloLlegadaNacio.add(DataMapper.vueloLlegadaNacionalDTOToVueloLlegadaNacional(newData));
			writeFile();
			writeSerialized();
			return true;
		} else {
			return false;
		}
	}

	public void writeFile() {
		StringBuilder content = new StringBuilder();
		for (VueloLlegadaNacional v : listaVueloLlegadaNacio) {
			content.append(v.getNumVuelo()).append(";").append(v.getAerolinea()).append(";")
					.append(v.getFechaHoraLlegada()).append(";").append(v.getOrigen()).append(";")
					.append(v.getDestino()).append(";").append(v.getListaViajeros()).append("\n");
		}
		FileHandler.writeFile(FILE_NAME, content.toString());
	}

	public void readFile() {
		String content = FileHandler.readFile(FILE_NAME);
		if (content == null || content.isEmpty()) {
			listaVueloLlegadaNacio = new MyLinkedList<>();
		} else {
			listaVueloLlegadaNacio = new MyLinkedList<>();
			String[] rows = content.split("\n");
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
			for (String row : rows) {
				String[] cols = row.split(";");
				VueloLlegadaNacional temporal = new VueloLlegadaNacional();
				temporal.setNumVuelo(cols[0]);
				temporal.setAerolinea(cols[1]);
				try {
					LocalDateTime fechaHora = LocalDateTime.parse(cols[2], formatter);
					temporal.setFechaHoraLlegada(fechaHora);
				} catch (DateTimeParseException e) {
					System.err.println("Error al convertir fecha y hora: " + cols[2]);
					temporal.setFechaHoraLlegada(null);
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

				listaVueloLlegadaNacio.add(temporal);
			}
		}
	}

	public void writeSerialized() {
		FileHandler.writeSerialized(SERIAL_NAME, listaVueloLlegadaNacio);
	}

	public void readSerialized() {
		Object content = FileHandler.readSerialized(SERIAL_NAME);
		if (content == null) {
			listaVueloLlegadaNacio = new MyLinkedList<>();
		} else {
			listaVueloLlegadaNacio = (MyLinkedList<VueloLlegadaNacional>) content;
		}
	}
}
