
public class List {

	private GenericNode head=null;
	
	public void add(Object object)
	{
		head=new GenericNode(object,head);
	}

	public void applyActionToEachElement(ActionObject action)
	{
		GenericNode n=head;
		while(n!=null)
		{
			action.action(n);
			n=n.next;
		}
	}
}
