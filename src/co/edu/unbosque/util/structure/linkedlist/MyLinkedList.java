package co.edu.unbosque.util.structure.linkedlist;

import java.io.Serializable;
import java.util.Iterator;
import java.util.function.Consumer;

public class MyLinkedList<E> implements Serializable, Iterable<E> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2226179239438445092L;
	protected Node<E> first;

	public MyLinkedList() {
		this.first = null;
	}

	public Node<E> getFirst() {
		return first;
	}

	public void setFirst(Node<E> first) {
		this.first = first;
	}

	public boolean isEmpty() {
		return (this.first == null);
	}

	public void add(E info) {
		Node<E> newNode = new Node<E>(info);
		newNode.setNext(this.first);
		first = newNode;
	}

	public void insert(E info, Node<E> previous) {
		if (previous != null) {
			Node<E> newNode = new Node<E>(info);
			newNode.setNext(previous.getNext());
			previous.setNext(newNode);
		}
	}

	public void addLast(E info) {
		if (isEmpty()) {
			this.first = new Node<E>(info);
		} else {
			addLastRecursive(this.first, info);
		}
	}

	private void addLastRecursive(Node<E> current, E info) {
		if (current.getNext() == null) {
			current.setNext(new Node<E>(info));
		} else {
			addLastRecursive(current.getNext(), info);
		}
	}

	public Node<E> getLastNode() {
		return getLastNodeRecursive(this.first);
	}

	private Node<E> getLastNodeRecursive(Node<E> current) {
		if (current == null || current.getNext() == null) {
			return current;
		}
		return getLastNodeRecursive(current.getNext());
	}

	public E extract() {
		if (this.first == null)
			return null;
		E data = this.first.getInfo();
		this.first = this.first.getNext();
		return data;
	}

	public E extract(Node<E> previous) {
		if (previous != null && previous.getNext() != null) {
			E data = previous.getNext().getInfo();
			previous.setNext(previous.getNext().getNext());
			return data;
		}
		return null;
	}

	public boolean remove(E info) {
		return removeRecursive(first, info);
	}

	private boolean removeRecursive(Node<E> current, E info) {

		if (current == null) {
			return false;
		}
		if (current.getInfo().equals(info)) {
			first = current.getNext();
			return true;
		}
		if (current.getNext() != null && current.getNext().getInfo().equals(info)) {
			current.setNext(current.getNext().getNext());
		}
		return removeRecursive(current.getNext(), info);
	}

	public int size() {
		return sizeRecursive(this.first);
	}

	private int sizeRecursive(Node<E> current) {
		if (current == null) {
			return 0;
		}
		return 1 + sizeRecursive(current.getNext());
	}

	public Node<E> get(E info) {
		return getRecursive(this.first, info);
	}

	private Node<E> getRecursive(Node<E> current, E info) {
		if (current == null || current.getInfo().equals(info)) {
			return current;
		}
		return getRecursive(current.getNext(), info);
	}

	public Node<E> get(int n) {
		return getRecursiveByIndex(this.first, n, 0);
	}

	private Node<E> getRecursiveByIndex(Node<E> current, int n, int counter) {
		if (current == null || counter == n) {
			return current;
		}
		return getRecursiveByIndex(current.getNext(), n, counter + 1);
	}

	public E getElementAt(int index) {
		return getRecursiveElementAt(this.first, index, 0);
	}

	private E getRecursiveElementAt(Node<E> current, int index, int counter) {
		if (current == null) {
			return null;
		}
		if (counter == index) {
			return current.getInfo();
		}
		return getRecursiveElementAt(current.getNext(), index, counter + 1);
	}

	public int indexOf(E info) {
		return indexOfRecursive(this.first, info, 0);
	}

	private int indexOfRecursive(Node<E> current, E info, int position) {
		if (current == null)
			return -1;
		if (current.getInfo().equals(info))
			return position;
		return indexOfRecursive(current.getNext(), info, position + 1);
	}

	public int numberOfOcurrence(E info) {
		return countOccurrencesRecursive(this.first, info);
	}

	private int countOccurrencesRecursive(Node<E> current, E info) {
		if (current == null)
			return 0;
		int count = current.getInfo().equals(info) ? 1 : 0;
		return count + countOccurrencesRecursive(current.getNext(), info);
	}

	public E extractLast() {
		if (isEmpty())
			return null;
		if (this.first.getNext() == null) {
			E info = this.first.getInfo();
			this.first = null;
			return info;
		}
		return extractLastRecursive(this.first);
	}

	private E extractLastRecursive(Node<E> current) {
		if (current.getNext().getNext() == null) {
			E info = current.getNext().getInfo();
			current.setNext(null);
			return info;
		}
		return extractLastRecursive(current.getNext());
	}

	public String print() {
		return toString();
	}

	@Override
	public String toString() {
		return toStringRecursive(this.first);
	}

	private String toStringRecursive(Node<E> current) {
		if (current == null)
			return "";
		String result = current.getInfo().toString();
		if (current.getNext() != null) {
			result += " --> " + toStringRecursive(current.getNext());
		}
		return result;
	}

	public String showAll() {
		return showAllRecursive(first);
	}

	private String showAllRecursive(Node<E> current) {
		if (current == null) {
			return "";
		}
		return current.getInfo() + "\n" + showAllRecursive(current.getNext());
	}

	@Override
	public Iterator<E> iterator() {
		return new MyLinkedListIterator<>(this.first); 
	}

	public void forEachRecursive(Consumer<E> action) {
		forEachRecursiveHelper(this.first, action);
	}

	private void forEachRecursiveHelper(Node<E> current, Consumer<E> action) {
		if (current == null) {
			return;
		}
		action.accept(current.getInfo());
		forEachRecursiveHelper(current.getNext(), action);
	}

}
