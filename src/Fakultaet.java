import java.util.Random;

public class Fakultaet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int n = new Random().nextInt(10);
		System.out.println("Random number :" + n + "!=" + fakultaet(n));
		System.out.println();
		printTable(10);
	}

	private static void printTable(int i) {
		for (int j = 1; j <= i; j++)
			System.out.println(j + "!=" + fakultaet(j));
	}

	private static int fakultaet(int n) {
		if (n < 3)
			return n;
		else if (n == 0)
			return 1;
		else
			return n * fakultaet(n - 1);
	}

}
