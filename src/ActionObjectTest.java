
public class ActionObjectTest {

	public static void showContainsZero(List list) {
		PrintFoundZeroAction action=new PrintFoundZeroAction();
		list.applyActionToEachElement(action);
		System.out.println("There is a zero in the list: "+action.isThereZero());
	}
	
	public static void showPosSum(List list) {
		SumPositiveIntegerAction action=new SumPositiveIntegerAction();
		list.applyActionToEachElement(action);
		System.out.println("The sum of all positive Integers is "+action.getSum());
	}
		
	public static void main(String[] args) {
		java.util.Random rand = new java.util.Random();
		int elems=rand.nextInt(120);
		List list=new List();
		for (int i=0;i<elems;i++)
			if(rand.nextInt(100)<50)
			{
				list.add(new Integer(rand.nextInt(10)-5));
			}
			else
			{
				switch(rand.nextInt(3))
				{
				case 0:
					list.add(new Object());
					break;
				case 1:
					list.add(new Boolean(false));
					break;
				case 2:
					list.add(null);
				}
			}
		showContainsZero(list);
		showPosSum(list);
	}

}
