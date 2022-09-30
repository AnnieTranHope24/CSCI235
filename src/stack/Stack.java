package stack;

import java.util.Arrays;

public class Stack<E> {
	private int top;
	private E[] elements; 
	public Stack() {
		elements = (E[]) new Object[2];
		top = 0;
	}
	public Stack(int capacity) {
		elements = (E[]) new Object[capacity];
		top = 0;
	}
	public E pop() {
		if(!empty()) {
			top--;
			return elements[top+1];
			
		}
		return null;
	}
	public E peek() {
		if(!empty()) {
			return elements[top-1];
		}
		return null;
	}
	public void push(E item) {
		//if the array is full, double the size of the underlying array
		if(!isFull()) {
			elements[top] = item;
			top++;
		}else {
			elements = Arrays.copyOf(elements, elements.length*2);
			elements[top] = item;
			top++;
		}
	}
	public boolean empty() {
		return top==0;
	}
	public boolean isFull() {
		return top==elements.length;
	}
	public int lengthOfArray() {
		return elements.length;
	}
	public int size() {
		return top;
	}
}
