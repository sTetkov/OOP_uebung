
public class TestMonth {
	public static void main(String args[]) {
		Month1 m11=Month1.Aug;
		Month1 m12=Month1.Feb;
		Month2 m21=Month2.Aug;
		Month2 m22=Month2.Feb;
		System.out.println("Month\t\tMonth1\t\tMonth2");
		System.out.println("Aug\t\t"+m11.isSummer()+"\t\t"+m21.isSummer());
		System.out.println("Feb\t\t"+m12.isSummer()+"\t\t"+m22.isSummer());
		
	}
}
