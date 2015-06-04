public class DIAarray extends DynIntArray {
	
	private int[] array;
	private int internalSize;
	private static final int maxIncrement=1024;
	
	public void add(int e) {
		if (internalSize==0)
			array=new int[1];
		if(internalSize==array.length)
			extendArray();
		array[internalSize]=e;
		internalSize++;
	}

	private void extendArray() {
		int increment=internalSize;
		if (increment>maxIncrement)
			increment=maxIncrement;
		int[] newArray=new int[internalSize+increment];
		for(int i=0;i<internalSize;i++)
			newArray[i]=array[i];
		array=newArray;
	}

	public void setElementAt(int i, int e) {
		if(i>=internalSize)
			return;
		array[i]=e;
	}

	public int getElementAt(int i) {
		if(i>=internalSize)
			return 0;
		return array[i];
	}

	public int getElementCount() {
		return internalSize;
	}

	public void print() {
		System.out.print("[");
		for (int i=0;i<internalSize;i++)
		{
			System.out.print(array[i]);
			if(i<internalSize-1)
				System.out.print(", ");
		}
		System.out.println("]");
	}
}
