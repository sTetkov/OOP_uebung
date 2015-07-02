
public class PrintFoundZeroAction implements ActionObject {

	private boolean isThereZero=false;
	
	public boolean isThereZero()
	{return isThereZero;}
	@Override
	public void action(GenericNode n) {
		if(n.data!=null)
			if(n.data.getClass()==Integer.class)
			{
				if(((Integer)n.data).intValue()==0)
					isThereZero=true;
			}
	}

}
