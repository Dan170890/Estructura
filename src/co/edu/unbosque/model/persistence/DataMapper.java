package co.edu.unbosque.model.persistence;

import co.edu.unbosque.model.Viajero;
import co.edu.unbosque.model.ViajeroDTO;
import co.edu.unbosque.model.VueloLlegadaInternacional;
import co.edu.unbosque.model.VueloLlegadaInternacionalDTO;
import co.edu.unbosque.model.VueloLlegadaNacional;
import co.edu.unbosque.model.VueloLlegadaNacionalDTO;
import co.edu.unbosque.model.VueloSalidaInternacional;
import co.edu.unbosque.model.VueloSalidaInternacionalDTO;
import co.edu.unbosque.model.VueloSalidaNacional;
import co.edu.unbosque.model.VueloSalidaNacionalDTO;
import co.edu.unbosque.util.structure.linkedlist.MyLinkedList;

public class DataMapper {

	public static Viajero ViajeroDTOToViajero(ViajeroDTO dto) {
		Viajero entity;
		entity = new Viajero(dto.getNombre(), dto.getNacionalidad(), dto.getFechaNacimiento());
		return entity;
	}

	public static ViajeroDTO ViajeroToViajeroDTO(Viajero entity) {
		ViajeroDTO dto;
		dto = new ViajeroDTO(entity.getNombre(), entity.getNacionalidad(), entity.getFechaNacimiento());
		return dto;
	}

	public static MyLinkedList<ViajeroDTO> listaViajeroToListaViajeroDTO(MyLinkedList<Viajero> entityList) {
		MyLinkedList<ViajeroDTO> dtoList = new MyLinkedList<>();
		for (Viajero entity : entityList) {
			dtoList.add(new ViajeroDTO(entity.getNombre(), entity.getNacionalidad(), entity.getFechaNacimiento()));
		}
		return dtoList;
	}

	public static MyLinkedList<Viajero> listaViajeroDTOToListaViajero(MyLinkedList<ViajeroDTO> dtoList) {
		MyLinkedList<Viajero> entityList = new MyLinkedList<>();
		for (ViajeroDTO dto : dtoList) {
			entityList.add(new Viajero(dto.getNombre(), dto.getNacionalidad(), dto.getFechaNacimiento()));
		}
		return entityList;
	}

	public static VueloSalidaNacional vueloSalidaNacionalDTOToVueloSalidaNacional(VueloSalidaNacionalDTO dto) {
		VueloSalidaNacional entity;
		entity = new VueloSalidaNacional(dto.getNumVuelo(), dto.getAerolinea(), dto.getFechaHoraSalida(),
				dto.getOrigen(), dto.getDestino(), dto.getListaViajeros());

		return entity;
	}

	public static VueloSalidaNacionalDTO vueloSalidaNacionalToVueloSalidaNacionalDTO(VueloSalidaNacional entity) {
		VueloSalidaNacionalDTO dto;
		dto = new VueloSalidaNacionalDTO(entity.getNumVuelo(), entity.getAerolinea(), entity.getFechaHoraSalida(),
				entity.getOrigen(), entity.getDestino(), entity.getListaViajeros());
		return dto;
	}

	public static MyLinkedList<VueloSalidaNacionalDTO> listaVueloSalidaNacionalToListaVueloSalidaNacionalDTO(
			MyLinkedList<VueloSalidaNacional> entityList) {
		MyLinkedList<VueloSalidaNacionalDTO> dtoList = new MyLinkedList<>();
		for (VueloSalidaNacional entity : entityList) {
			dtoList.add(new VueloSalidaNacionalDTO(entity.getNumVuelo(), entity.getAerolinea(),
					entity.getFechaHoraSalida(), entity.getOrigen(), entity.getDestino(), entity.getListaViajeros()));
		}
		return dtoList;
	}

	public static MyLinkedList<VueloSalidaNacional> listaVueloSalidaNacionalDTOToListaVueloSalidaNacional(
			MyLinkedList<VueloSalidaNacionalDTO> dtoList) {
		MyLinkedList<VueloSalidaNacional> entityList = new MyLinkedList<>();
		for (VueloSalidaNacionalDTO dto : dtoList) {
			entityList.add(new VueloSalidaNacional(dto.getNumVuelo(), dto.getAerolinea(), dto.getFechaHoraSalida(),
					dto.getOrigen(), dto.getDestino(), dto.getListaViajeros()));
		}
		return entityList;
	}

	public static VueloLlegadaNacional vueloLlegadaNacionalDTOToVueloLlegadaNacional(VueloLlegadaNacionalDTO dto) {
		VueloLlegadaNacional entity;
		entity = new VueloLlegadaNacional(dto.getNumVuelo(), dto.getAerolinea(), dto.getFechaHoraLlegada(),
				dto.getOrigen(), dto.getDestino(), dto.getListaViajeros());

		return entity;
	}

	public static VueloLlegadaNacionalDTO vueloLlegadaNacionalToVueloLlegadaNacionalDTO(VueloLlegadaNacional entity) {
		VueloLlegadaNacionalDTO dto;
		dto = new VueloLlegadaNacionalDTO(entity.getNumVuelo(), entity.getAerolinea(), entity.getFechaHoraLlegada(),
				entity.getOrigen(), entity.getDestino(), entity.getListaViajeros());
		return dto;
	}

	public static MyLinkedList<VueloLlegadaNacionalDTO> listaVueloLlegadaNacionalToListaVueloLlegadaNacionalDTO(
			MyLinkedList<VueloLlegadaNacional> entityList) {
		MyLinkedList<VueloLlegadaNacionalDTO> dtoList = new MyLinkedList<>();
		for (VueloLlegadaNacional entity : entityList) {
			dtoList.add(new VueloLlegadaNacionalDTO(entity.getNumVuelo(), entity.getAerolinea(),
					entity.getFechaHoraLlegada(), entity.getOrigen(), entity.getDestino(), entity.getListaViajeros()));
		}
		return dtoList;
	}

	public static MyLinkedList<VueloLlegadaNacional> listaVueloLlegadaNacionalDTOToListaVueloLlegadaNacional(
			MyLinkedList<VueloLlegadaNacionalDTO> dtoList) {
		MyLinkedList<VueloLlegadaNacional> entityList = new MyLinkedList<>();
		for (VueloLlegadaNacionalDTO dto : dtoList) {
			entityList.add(new VueloLlegadaNacional(dto.getNumVuelo(), dto.getAerolinea(), dto.getFechaHoraLlegada(),
					dto.getOrigen(), dto.getDestino(), dto.getListaViajeros()));
		}
		return entityList;
	}

	public static VueloSalidaInternacional vueloSalidaInternacionalDTOToVueloSalidaInternacional(
			VueloSalidaInternacionalDTO dto) {
		VueloSalidaInternacional entity;
		entity = new VueloSalidaInternacional(dto.getNumVuelo(), dto.getAerolinea(), dto.getFechaHoraSalida(),
				dto.getOrigen(), dto.getDestino(), dto.getListaViajeros());

		return entity;
	}

	public static VueloSalidaInternacionalDTO vueloSalidaInternacionalToVueloSalidaInternacionalDTO(
			VueloSalidaInternacional entity) {
		VueloSalidaInternacionalDTO dto;
		dto = new VueloSalidaInternacionalDTO(entity.getNumVuelo(), entity.getAerolinea(), entity.getFechaHoraSalida(),
				entity.getOrigen(), entity.getDestino(), entity.getListaViajeros());
		return dto;
	}

	public static MyLinkedList<VueloSalidaInternacionalDTO> listaVueloSalidaInternacionalToListaVueloSalidaInternacionalDTO(
			MyLinkedList<VueloSalidaInternacional> entityList) {
		MyLinkedList<VueloSalidaInternacionalDTO> dtoList = new MyLinkedList<>();
		for (VueloSalidaInternacional entity : entityList) {
			dtoList.add(new VueloSalidaInternacionalDTO(entity.getNumVuelo(), entity.getAerolinea(),
					entity.getFechaHoraSalida(), entity.getOrigen(), entity.getDestino(), entity.getListaViajeros()));
		}
		return dtoList;
	}

	public static MyLinkedList<VueloSalidaInternacional> listaVueloSalidaInternacionalDTOToListaVueloSalidaInternacional(
			MyLinkedList<VueloSalidaInternacionalDTO> dtoList) {
		MyLinkedList<VueloSalidaInternacional> entityList = new MyLinkedList<>();
		for (VueloSalidaInternacionalDTO dto : dtoList) {
			entityList.add(new VueloSalidaInternacional(dto.getNumVuelo(), dto.getAerolinea(), dto.getFechaHoraSalida(),
					dto.getOrigen(), dto.getDestino(), dto.getListaViajeros()));
		}
		return entityList;
	}

	public static VueloLlegadaInternacional vueloLlegadaInternacionalDTOToVueloLlegadaInternacional(
			VueloLlegadaInternacionalDTO dto) {
		VueloLlegadaInternacional entity;
		entity = new VueloLlegadaInternacional(dto.getNumVuelo(), dto.getAerolinea(), dto.getFechaHoraLlegada(),
				dto.getOrigen(), dto.getDestino(), dto.getListaViajeros());

		return entity;
	}

	public static VueloLlegadaInternacionalDTO vueloLlegadaInternacionalToVueloLlegadaInternacionalDTO(
			VueloLlegadaInternacional entity) {
		VueloLlegadaInternacionalDTO dto;
		dto = new VueloLlegadaInternacionalDTO(entity.getNumVuelo(), entity.getAerolinea(),
				entity.getFechaHoraLlegada(), entity.getOrigen(), entity.getDestino(), entity.getListaViajeros());
		return dto;
	}

	public static MyLinkedList<VueloLlegadaInternacionalDTO> listaVueloLlegadaInternacionalToListaVueloLlegadaInternacionalDTO(
			MyLinkedList<VueloLlegadaInternacional> entityList) {
		MyLinkedList<VueloLlegadaInternacionalDTO> dtoList = new MyLinkedList<>();
		for (VueloLlegadaInternacional entity : entityList) {
			dtoList.add(new VueloLlegadaInternacionalDTO(entity.getNumVuelo(), entity.getAerolinea(),
					entity.getFechaHoraLlegada(), entity.getOrigen(), entity.getDestino(), entity.getListaViajeros()));
		}
		return dtoList;
	}

	public static MyLinkedList<VueloLlegadaInternacional> listaVueloLlegadaInternacionalDTOToListaVueloLlegadaInternacional(
			MyLinkedList<VueloLlegadaInternacionalDTO> dtoList) {
		MyLinkedList<VueloLlegadaInternacional> entityList = new MyLinkedList<>();
		for (VueloLlegadaInternacionalDTO dto : dtoList) {
			entityList.add(new VueloLlegadaInternacional(dto.getNumVuelo(), dto.getAerolinea(),
					dto.getFechaHoraLlegada(), dto.getOrigen(), dto.getDestino(), dto.getListaViajeros()));
		}
		return entityList;
	}

}
