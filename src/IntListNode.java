
public class IntListNode {

	private int value;
	private IntListNode next;
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public IntListNode getNext() {
		return next;
	}
	public void setNext(IntListNode next) {
		this.next = next;
	}

	public IntListNode(int value)
	{
		this.value=value;
	}
}
