
class Node implements Cloneable{
	public int value;
	public Node next;
	public Node(int val, Node next) { value = val; this.next = next; }
	
	public Object clone() throws CloneNotSupportedException 
	{
		Node res=(Node) super.clone();//value wird Kopiert, bei next wird die reference kopiert
		return res;
	}
}
