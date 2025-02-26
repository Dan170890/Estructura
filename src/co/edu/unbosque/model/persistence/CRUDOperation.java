package co.edu.unbosque.model.persistence;

import co.edu.unbosque.util.structure.linkedlist.MyLinkedList;

public interface CRUDOperation<D, E> {

	public String showAll();

	public MyLinkedList<D> getAll();

	public boolean add(D newData);

	public boolean delete(D toDelete);

	public E find(E toFind);

	public boolean update(D previous, D newData);
}
