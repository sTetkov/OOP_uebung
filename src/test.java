public class test{
	public static void main(String[] args)
	{
		Einwohner t1=new Einwohner();
		t1.setEinkommen(112);
		Leibeigener t2=new Leibeigener();
		t2.setEinkommen(112);
		System.out.println(t1.steuer());
		System.out.println(t2.steuer());
	} 
}