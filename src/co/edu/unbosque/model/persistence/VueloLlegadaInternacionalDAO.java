package co.edu.unbosque.model.persistence;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import co.edu.unbosque.model.Viajero;
import co.edu.unbosque.model.VueloLlegadaInternacional;
import co.edu.unbosque.model.VueloLlegadaInternacionalDTO;
import co.edu.unbosque.util.structure.linkedlist.MyLinkedList;

public class VueloLlegadaInternacionalDAO
		implements CRUDOperation<VueloLlegadaInternacionalDTO, VueloLlegadaInternacional> {

	private MyLinkedList<VueloLlegadaInternacional> listaVueloLlegadaInter;
	private final String FILE_NAME = "vueloLlegadaInternacional.csv";
	private final String SERIAL_NAME = "vueloLlegadaInternacional.dat";

	public VueloLlegadaInternacionalDAO() {
		FileHandler.checkFolder();
		readSerialized();
		readFile();
	}

	@Override
	public String showAll() {
		StringBuilder rta = new StringBuilder();
		if (listaVueloLlegadaInter.isEmpty()) {
			return "No hay vuelos nacionales en la lista\n";
		} else {
			for (VueloLlegadaInternacional vueloNacional : listaVueloLlegadaInter) {
				rta.append(vueloNacional.toString()).append("\n");
			}
			return rta.toString();
		}
	}

	@Override
	public MyLinkedList<VueloLlegadaInternacionalDTO> getAll() {
		return DataMapper.listaVueloLlegadaInternacionalToListaVueloLlegadaInternacionalDTO(listaVueloLlegadaInter);
	}

	@Override
	public boolean add(VueloLlegadaInternacionalDTO newData) {
		if (find(DataMapper.vueloLlegadaInternacionalDTOToVueloLlegadaInternacional(newData)) == null) {
			listaVueloLlegadaInter.add(DataMapper.vueloLlegadaInternacionalDTOToVueloLlegadaInternacional(newData));
			writeFile();
			writeSerialized();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean delete(VueloLlegadaInternacionalDTO toDelete) {
		VueloLlegadaInternacional found = find(
				DataMapper.vueloLlegadaInternacionalDTOToVueloLlegadaInternacional(toDelete));
		if (found != null) {
			listaVueloLlegadaInter.remove(found);
			writeFile();
			writeSerialized();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public VueloLlegadaInternacional find(VueloLlegadaInternacional toFind) {
		if (!listaVueloLlegadaInter.isEmpty()) {
			for (VueloLlegadaInternacional inter : listaVueloLlegadaInter) {
				if ((inter.getNumVuelo().equals(toFind.getNumVuelo()))) {
					return inter;
				}
			}
		}
		return null;
	}

	public boolean update(VueloLlegadaInternacionalDTO previous, VueloLlegadaInternacionalDTO newData) {
		VueloLlegadaInternacional found = find(
				DataMapper.vueloLlegadaInternacionalDTOToVueloLlegadaInternacional(previous));
		if (found != null) {
			listaVueloLlegadaInter.remove(found);
			listaVueloLlegadaInter.add(DataMapper.vueloLlegadaInternacionalDTOToVueloLlegadaInternacional(newData));
			writeFile();
			writeSerialized();
			return true;
		} else {
			return false;
		}
	}

	public void writeFile() {
		StringBuilder content = new StringBuilder();
		for (VueloLlegadaInternacional v : listaVueloLlegadaInter) {
			content.append(v.getNumVuelo()).append(";").append(v.getAerolinea()).append(";")
					.append(v.getFechaHoraLlegada()).append(";").append(v.getOrigen()).append(";")
					.append(v.getDestino()).append(";").append(v.getListaViajeros()).append("\n");
		}
		FileHandler.writeFile(FILE_NAME, content.toString());
	}

	public void readFile() {
		String content = FileHandler.readFile(FILE_NAME);
		if (content == null || content.isEmpty()) {
			listaVueloLlegadaInter = new MyLinkedList<>();
		} else {
			listaVueloLlegadaInter = new MyLinkedList<>();
			String[] rows = content.split("\n");
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
			for (String row : rows) {
				String[] cols = row.split(";");
				VueloLlegadaInternacional temporal = new VueloLlegadaInternacional();
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

				listaVueloLlegadaInter.add(temporal);
			}
		}
	}

	public void writeSerialized() {
		FileHandler.writeSerialized(SERIAL_NAME, listaVueloLlegadaInter);
	}

	public void readSerialized() {
		Object content = FileHandler.readSerialized(SERIAL_NAME);
		if (content == null) {
			listaVueloLlegadaInter = new MyLinkedList<>();
		} else {
			listaVueloLlegadaInter = (MyLinkedList<VueloLlegadaInternacional>) content;
		}
	}
}
