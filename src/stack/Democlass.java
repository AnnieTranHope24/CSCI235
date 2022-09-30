package stack;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Democlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arrayStack
//		Stack<String> stack = new Stack<>();
//		stack.push("Mai");
//		stack.push("Hai");
//		stack.push("Ngoc");
//		System.out.println(stack.size());
//		System.out.println(stack.peek());
//		stack.pop();
//		System.out.println(stack.peek());
//		stack.pop();
//		stack.pop();
//		System.out.println(stack.empty());
		
		//postfix
//		PostfixEvaluator pfE = new PostfixEvaluator("5 9 - 2 + 3 *");
//		try{
//			System.out.println(pfE.evaluate());
//		}catch(NumberFormatException e) {
//			System.out.println("Invalid expression. Expression must contain only numbers and math operators.");
//		}catch(Exception e) {
//			System.out.println("Invalid expression.");
//		}
		
		
		
		
//		//testing the Node class
//		Node one = new Node(1);
//		Node two = new Node(2);
//		one.setNext(two);
//		two.setNext(new Node(3));
//		Node first = one;
//		//Traverse the list
//		Node copy = first;
//		while(copy!= null) {
//			//System.out.print(copy.getVal() + " ");
//			copy = copy.getNext();
//		}
//		Node newNode = new Node(0, first);
//		first = newNode;
//		copy = first;
//		while(copy!= null) {
//			System.out.print(copy.getVal() + " ");
//			copy = copy.getNext();
//		}
//		System.out.println();
//		//insert the node in the middle
//		copy = first;
//		//insert a node at index 3
//		for(int i =0;i<2 ;i++) {
//			copy = copy.getNext();
//		}
//		newNode = new Node(10);
//		newNode.setNext(copy.getNext());
//		copy.setNext(newNode);
//		copy = first;
//		while(copy!= null) {
//			System.out.print(copy.getVal() + " ");
//			copy = copy.getNext();
//		}
		
		
		
		
//		//add at the middle of the list
//		Node newNode = Node(12);
//		copy = first;
//		int index = 2;
//		for(int i=0; i< index-1;i++) {
//			copy = copy.getNext();
//		}
//		
//	
//	}
	
	

		
		//Iterator
//		ArrayList<Integer> myList = new ArrayList<>();
//		
//		for(int i =0; i<10; i++) {
//			myList.add(i);
//		}
		
//		for(int i =0; i<myList.size(); i++) {
//			myList.remove(i);
//		}
		
//		Iterator<Integer> it = myList.iterator();
//		while(it.hasNext()) {
//			int num = it.next();
//			it.remove();
//		}
//		for(int i = 0; i<myList.size(); i++) {
//			System.out.println(myList.get(i));
//		}
//	
//		//Demonstrate fail-fast (concurrent modification)
//		System.out.println("Modifying the collection without using the iterator: ");
//		myList = new ArrayList<>();
//		for(int i =0; i<10; i++) {
//			myList.add(i);
//		}
//		it = myList.iterator();
//		for(int i = 0; i<myList.size(); i++) {
//			System.out.println(it.next());
//		}
//		System.out.println("Add another number");
//		myList.add(10);
//		it = myList.iterator();
//		for(int i = 0; i<myList.size(); i++) {
//			System.out.println(it.next());
//		}
//	}
	
		//ListIterator
		ArrayList<Integer> myList = new ArrayList<>();
		for(int i =0; i<10; i++) {
			myList.add(i);
		}
		ListIterator<Integer> lit = myList.listIterator();
		//print forwards
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
		System.out.println();
		//print backwards
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		System.out.println("Printing after adding another element");
//		myList.add(10);
//		lit = myList.listIterator();
		lit.add(10);
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}
//		for(int i = 0; i< myList.size(); i++) {
//			System.out.println(myList.get(i));
//		}
		
	}}
