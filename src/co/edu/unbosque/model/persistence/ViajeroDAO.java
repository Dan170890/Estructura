package co.edu.unbosque.model.persistence;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import co.edu.unbosque.model.Viajero;
import co.edu.unbosque.model.ViajeroDTO;
import co.edu.unbosque.util.structure.linkedlist.MyLinkedList;

public class ViajeroDAO implements CRUDOperation<ViajeroDTO, Viajero> {

	private MyLinkedList<Viajero> listaViajero;
	private final String FILE_NAME = "viajero.csv";
	private final String SERIAL_NAME = "viajero.dat";

	public ViajeroDAO() {
		FileHandler.checkFolder();
		readSerialized();
		readFile();
	}

	@Override
	public String showAll() {
		StringBuilder rta = new StringBuilder();
		if (listaViajero.isEmpty()) {
			return "No hay vuelos nacionales en la lista\n";
		} else {
			for (Viajero vueloNacional : listaViajero) {
				rta.append(vueloNacional.toString()).append("\n");
			}
			return rta.toString();
		}
	}

	@Override
	public MyLinkedList<ViajeroDTO> getAll() {
		return DataMapper.listaViajeroToListaViajeroDTO(listaViajero);
	}

	@Override
	public boolean add(ViajeroDTO newData) {
		if (find(DataMapper.ViajeroDTOToViajero(newData)) == null) {
			listaViajero.add(DataMapper.ViajeroDTOToViajero(newData));
			writeFile();
			writeSerialized();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean delete(ViajeroDTO toDelete) {
		Viajero found = find(DataMapper.ViajeroDTOToViajero(toDelete));
		if (found != null) {
			listaViajero.remove(found);
			writeFile();
			writeSerialized();
			return true;
		} else {
			return false;
		}
	}

	@Override
	public Viajero find(Viajero toFind) {
		if (!listaViajero.isEmpty()) {
			for (Viajero inter : listaViajero) {
				if ((inter.getNombre().equals(toFind.getNombre())
						&& (inter.getNacionalidad().equals(toFind.getNacionalidad())))) {
					return inter;
				}
			}
		}
		return null;
	}

	public boolean update(ViajeroDTO previous, ViajeroDTO newData) {
		Viajero found = find(DataMapper.ViajeroDTOToViajero(previous));
		if (found != null) {
			listaViajero.remove(found);
			listaViajero.add(DataMapper.ViajeroDTOToViajero(newData));
			writeFile();
			writeSerialized();
			return true;
		} else {
			return false;
		}
	}

	public void writeFile() {
		StringBuilder content = new StringBuilder();
		for (Viajero v : listaViajero) {
			content.append(v.getNombre()).append(";").append(v.getNacionalidad()).append(";")
					.append(v.getFechaNacimiento()).append("\n");
		}
		FileHandler.writeFile(FILE_NAME, content.toString());
	}

	public void readFile() {
		String content = FileHandler.readFile(FILE_NAME);
		if (content == null || content.isEmpty()) {
			listaViajero = new MyLinkedList<>();
		} else {
			listaViajero = new MyLinkedList<>();
			String[] rows = content.split("\n");
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

			for (String row : rows) {
				String[] cols = row.split(";");
				Viajero temporal = new Viajero();
				temporal.setNombre(cols[0]);
				temporal.setNacionalidad(cols[1]);

				try {
					LocalDate fecha = LocalDate.parse(cols[2], formatter);
					temporal.setFechaNacimiento(fecha);
				} catch (DateTimeParseException e) {
					System.err.println("Error al convertir la fecha: " + cols[2]);
					temporal.setFechaNacimiento(null); 
				}

				listaViajero.add(temporal);
			}
		}
	}

	public void writeSerialized() {
		FileHandler.writeSerialized(SERIAL_NAME, listaViajero);
	}

	public void readSerialized() {
		Object content = FileHandler.readSerialized(SERIAL_NAME);
		if (content == null) {
			listaViajero = new MyLinkedList<>();
		} else {
			listaViajero = (MyLinkedList<Viajero>) content;
		}
	}
}
