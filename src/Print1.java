
public class Print1 {
	int x = 1;
	public void print(ClassA a) { System.out.println(x); 
	System.out.println("Print1.print(ClassA)");}
	public void print(ClassB b) { System.out.println(x+1); 
	System.out.println("Print1.print(ClassB)");}
}
