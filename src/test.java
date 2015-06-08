public class test {
	
	static int add(long a, int b){return 1;}
	static int add(double a, float b){return 2;}
	static void print(ClassB b, ClassC c) {System.out.println(3);} // Methode 3
	static void print(ClassA a, ClassB b) {System.out.println(4);}
	public static void main(String[] args) {
		Einwohner t1 = new Einwohner();
		t1.setEinkommen(112);
		Leibeigener t2 = new Leibeigener();
		t2.setEinkommen(112);
		System.out.println(t1.steuer());
		System.out.println(t2.steuer());
		System.out.println(add(1.0,2.0F));
		System.out.println(add(1,2));
		ClassA a =new ClassA();
		ClassB b=new ClassB();
		ClassC c=new ClassC();
		print(c, c); // Aufruf 5
		print(a, c); // Aufruf 6
		print(c, b); // Aufruf 7
		print(b, a); // Aufruf 8
	}
}