package GenericsSrc;

public class DataNode<E> {
	private E data;
	private DataNode<? super Integer> next;
	
	public DataNode(E data, DataNode<? super Integer> next) {
		super();
		this.data = data;
		this.next = next;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public DataNode<? super Integer> getNext() {
		return next;
	}

	public void setNext(DataNode<? super Integer> next) {
		this.next = next;
	}
}
