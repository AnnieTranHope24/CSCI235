package stack;

public class Node {
	Integer val;
	Node next;
	public Node(Integer newVal) {
		val = newVal;
		next = null;
	}
	public Node(Integer newVal, Node next) {
		val = newVal;
		this.next = next;
	}
	public Integer getVal() {
		return val;
	}
	public void setVal(Integer val) {
		this.val = val;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
	
}
