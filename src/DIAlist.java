public class DIAlist extends DynIntArray {
	
	private IntListNode head;
	private IntListNode tail;
	
	public void add(int e) {
		if(head==null)
		{
			head=new IntListNode(e);
			tail=head;
		}
		else
		{
			tail.setNext(new IntListNode(e));
			tail=tail.getNext();
		}
	}

	public void setElementAt(int i, int e) {
		IntListNode current=head;
		for(int cnt=0;cnt<i;cnt++)
		{
			if(current==null)
				return;
			current=current.getNext();
		}
		current.setValue(e);
	}

	public int getElementAt(int i) {
		IntListNode current=head;
		for(int cnt=0;cnt<i;cnt++)
		{
			if(current==null)
				return 0;
			current=current.getNext();
		}
		return current.getValue();
	}

	public int getElementCount() {
		int cnt=0;
		IntListNode current=head;
		while(current!=null)
		{
			current=current.getNext();
			cnt++;
		}
		return cnt;
	}

	public void print() {
		System.out.print("[");
		IntListNode current=head;
		while(current!=null)
		{
			System.out.print(current.getValue());
			current=current.getNext();
			if(current!=null)
				System.out.print(", ");
		}
		System.out.println("]");
	}
}
