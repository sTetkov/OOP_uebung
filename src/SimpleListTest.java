
public class SimpleListTest {
	public static void main(String[] args) {
		SimpleList list1=new SimpleList();
		for(int i=0;i<10;i++)
			list1.add(i);
		SimpleList list2=(SimpleList) list1.clone();
		System.out.println("List 1: "+list1);
		System.out.println("List 2: "+list2);
		System.out.println("Adding element to List 1");
		list1.add(10);
		System.out.println("List 1: "+list1);
		System.out.println("List 2: "+list2);
	}
}
