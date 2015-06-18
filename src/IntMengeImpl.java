import java.util.Iterator;
import java.util.Vector;


public class IntMengeImpl extends AbstractIntMenge {

    public IntMengeImpl()
    {
	menge = new Vector<Integer>();
    }
    public void add(int i) {
	Integer elem=new Integer(i);
	if(!menge.contains(elem))
	    menge.addElement(elem);
    }

    public void remove(int i) {
	Integer elem=new Integer(i);
	if(menge.contains(elem))
	    menge.removeElement(elem);
    }

    public boolean contains(int i) {
	Integer elem=new Integer(i);
	return menge.contains(elem);
    }

    public int getSize() {
	return menge.size();
    }

    public int[] getElements() {
	int[] res=new int[menge.size()];
	int idx=0;
	Iterator<Integer> itr=menge.iterator();
	while(itr.hasNext())
	    res[idx++]=itr.next().intValue();
	return res;
    }

}
