import java.util.Iterator;
import java.util.Vector;


public abstract class AbstractIntMenge implements IntMenge {
    
    protected Vector<Integer> menge;
    
    public boolean isEmpty() {
	return menge.isEmpty();
    }

    public int getSum() {
	int sum=0;
	Iterator<Integer> itr=menge.iterator();
	while(itr.hasNext())
	    sum+=itr.next().intValue();
	return sum;
    }

    public void print() {
	System.out.print("{");
	Iterator<Integer> itr=menge.iterator();
	if(itr.hasNext())
	System.out.print(" "+itr.next()+" ");    
	while(itr.hasNext())
	    System.out.print(", "+itr.next()+" ");
	System.out.print("}");    
	
    }

}
