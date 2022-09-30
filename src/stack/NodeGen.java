package stack;

public class NodeGen<E> {

	E val;
	NodeGen<E> next;

	public NodeGen(E newVal) {
			val = newVal;
			next = null;
		}

	public NodeGen(E newVal, NodeGen<E> next) {
			val = newVal;
			this.next = next;
		}

	public E getVal() {
		return val;
	}

	public void setVal(E val) {
		this.val = val;
	}

	public NodeGen<E> getNext() {
		return next;
	}

	public void setNext(NodeGen<E> next) {
		this.next = next;
	}

}
