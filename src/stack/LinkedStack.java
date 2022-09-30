package stack;

import java.util.EmptyStackException;

public class LinkedStack<E> {
	NodeGen<E> first;
	int size;

	public LinkedStack() {
		first = null;
		size = 0;

	}

	public boolean empty() {
		return size == 0;
	}

	public int size() {
		return size;
	}

	public E pop() {
		if (!empty()) {
			E toBeReturned = first.getVal();
			first = first.getNext();
			size--;
			return toBeReturned;
		} else {
			throw new EmptyStackException();
		}
	}
	public E peek() {
		if(empty()) {
			throw new EmptyStackException();
		}
		else {
			return first.getVal();
		}
	}
	public void push(E val) {
		NodeGen<E> newNode = new NodeGen<>(val);
		newNode.setNext(first);
		first = newNode;
		size++;
		
	}

}
