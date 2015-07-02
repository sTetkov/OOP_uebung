public class SimpleList implements Cloneable{
	private Node head = null;
	public void add(int i) { head = new Node(i, head); }
	
	@Override
	public Object clone()
	{
		//Clone auf Liste Kopiert alle Knoten
		SimpleList list=null;
		try {
			list = (SimpleList) super.clone();
			Node ptr=head;
			if(ptr==null)
				return list;
			ptr=(Node) ptr.clone();
			list.head=ptr;
			while(ptr.next!=null)
			{
				ptr.next=(Node) ptr.next.clone();
				ptr=ptr.next;
			}
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
	
	public String toString()
	{
		String res="{";
		Node ptr=head;
		while(ptr!=null)
		{
			res+=" "+ptr.value;
			if(ptr.next!=null)
				res+=", ";
			ptr=ptr.next;
		}
		res+="}";
		return res;
	}
}