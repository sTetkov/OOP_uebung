public class test {
	
	static int add(long a, int b){return 1;}
	static int add(double a, float b){return 2;}
	static void print(ClassB b, ClassC c) {System.out.println(3);} // Methode 3
	static void print(ClassA a, ClassB b) {System.out.println(4);}
	public static void main(String[] args) {
		ClassA a = new ClassA(); ClassB b = new ClassB(); ClassC c = new ClassC();
		Print1 p1 = new Print1();
		Print2 p2 = new Print2();
		p1 = p2;
		System.out.println(p1.x);            // Aufruf 1
		System.out.println(((Print2)p1).x);  // Aufruf 2
		p1.print(c);                         // Aufruf 3
		((Print2)p1).print(c);               // Aufruf 4
		((Print1)p2).print(b);               // Aufruf 5
		((Print1)p2).print(c);               // Aufruf 6
		p2.print(c);                         // Aufruf 7
		p1 = new Print1();
		((Print2)p1).print(a);               // Aufruf 8
	}
}