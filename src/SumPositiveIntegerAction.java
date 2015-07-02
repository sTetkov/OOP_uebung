
public class SumPositiveIntegerAction implements ActionObject {

	private int sum=0;
	
	public int getSum()
	{return sum;}
	@Override
	public void action(GenericNode n) {
		if(n.data!=null)
			if(n.data.getClass()==Integer.class)
			{
				if(((Integer)n.data).intValue()>0)
					sum+=((Integer)n.data).intValue();
			}
	}
}
