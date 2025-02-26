package co.edu.unbosque.util.structure.linkedlist;

import java.io.Serializable;
import java.util.Iterator;

public class MyLinkedListIterator<E> implements Iterator<E>, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3502164441546699056L;
	private Node<E> current;

	public MyLinkedListIterator(Node<E> first) {
		this.current = first;
	}

	@Override
	public boolean hasNext() {
		return current != null;
	}

	@Override
	public E next() {
		E data = current.getInfo();
		current = current.getNext();
		return data;
	}
}
