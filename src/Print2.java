
public class Print2 extends Print1 {
	int x = 3;
	public void print(ClassA a) { System.out.println(x); 
	System.out.println("Print2.print(ClassA)");}
	public void print(ClassB b) { System.out.println(x+1);
	System.out.println("Print2.print(ClassB)");}
	public void print(ClassC c) { System.out.println(x+2); 
	System.out.println("Print2.print(ClassC)");}
}
