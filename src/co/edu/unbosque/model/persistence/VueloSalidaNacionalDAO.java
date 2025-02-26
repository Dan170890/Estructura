package co.edu.unbosque.model.persistence;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import co.edu.unbosque.model.Viajero;
import co.edu.unbosque.model.VueloSalidaNacional;
import co.edu.unbosque.model.VueloSalidaNacionalDTO;
import co.edu.unbosque.util.structure.linkedlist.MyLinkedList;

public class VueloSalidaNacionalDAO implements CRUDOperation<VueloSalidaNacionalDTO, VueloSalidaNacional> {

	private MyLinkedList<VueloSalidaNacional> listaVueloSalidaNa;
	private final String FILE_NAME = "VueloSalidaNacional.csv";
	private final String SERIAL_NAME = "VueloSalidaNacional.dat";

	public VueloSalidaNacionalDAO() {
		FileHandler.checkFolder();
		readSerialized();
		readFile();
	}

	@Override
	public String showAll() {
		StringBuilder rta = new StringBuilder();
		if (listaVueloSalidaNa.isEmpty()) {
			return "No hay vuelos nacionales en la lista\n";
		} else {
			for (VueloSalidaNacional vueloNacional : listaVueloSalidaNa) {
				rta.append(vueloNacional.toString()).append("\n");
			}
			return rta.toString();
		}
	}

	@Override
	public MyLinkedList<VueloSalidaNacionalDTO> getAll() {
		return DataMapper.listaVueloSalidaNacionalToListaVueloSalidaNacionalDTO(listaVueloSalidaNa);
	}

	@Override
	public boolean add(VueloSalidaNacionalDTO newData) {
		if (find(DataMapper.vueloSalidaNacionalDTOToVueloSalidaNacional(newData)) == null) {
			listaVueloSalidaNa.add(DataMapper.vueloSalidaNacionalDTOToVueloSalidaNacional(newData));
			writeFile();
			writeSerialized();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean delete(VueloSalidaNacionalDTO toDelete) {
		VueloSalidaNacional found = find(
				DataMapper.vueloSalidaNacionalDTOToVueloSalidaNacional(toDelete));
		if (found != null) {
			listaVueloSalidaNa.remove(found);
			writeFile();
			writeSerialized();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public VueloSalidaNacional find(VueloSalidaNacional toFind) {
		if (!listaVueloSalidaNa.isEmpty()) {
			for (VueloSalidaNacional inter : listaVueloSalidaNa) {
				if ((inter.getNumVuelo().equals(toFind.getNumVuelo()))) {
					return inter;
				}
			}
		}
		return null;
	}

	public boolean update(VueloSalidaNacionalDTO previous, VueloSalidaNacionalDTO newData) {
		VueloSalidaNacional found = find(
				DataMapper.vueloSalidaNacionalDTOToVueloSalidaNacional(previous));
		if (found != null) {
			listaVueloSalidaNa.remove(found);
			listaVueloSalidaNa.add(DataMapper.vueloSalidaNacionalDTOToVueloSalidaNacional(newData));
			writeFile();
			writeSerialized();
			return true;
		} else {
			return false;
		}
	}

	public void writeFile() {
		StringBuilder content = new StringBuilder();
		for (VueloSalidaNacional v : listaVueloSalidaNa) {
			content.append(v.getNumVuelo()).append(";").append(v.getAerolinea()).append(";")
					.append(v.getFechaHoraSalida()).append(";").append(v.getOrigen()).append(";")
					.append(v.getDestino()).append(";").append(v.getListaViajeros()).append("\n");
		}
		FileHandler.writeFile(FILE_NAME, content.toString());
	}

	public void readFile() {
		String content = FileHandler.readFile(FILE_NAME);
		if (content == null || content.isEmpty()) {
			listaVueloSalidaNa = new MyLinkedList<>();
		} else {
			listaVueloSalidaNa = new MyLinkedList<>();
			String[] rows = content.split("\n");
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
			for (String row : rows) {
				String[] cols = row.split(";");
				VueloSalidaNacional temporal = new VueloSalidaNacional();
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

				listaVueloSalidaNa.add(temporal);
			}
		}
	}

	public void writeSerialized() {
		FileHandler.writeSerialized(SERIAL_NAME, listaVueloSalidaNa);
	}

	public void readSerialized() {
		Object content = FileHandler.readSerialized(SERIAL_NAME);
		if (content == null) {
			listaVueloSalidaNa = new MyLinkedList<>();
		} else {
			listaVueloSalidaNa = (MyLinkedList<VueloSalidaNacional>) content;
		}
	}
}
