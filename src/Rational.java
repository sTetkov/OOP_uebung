import java.util.Random;

public class Rational {

	private long z;
	private long n;
	private static Rational max;

	public long getZ() {
		return z;
	}

	public void setZ(long z) {
		this.z = z;
		Normalize();
	}

	public long getN() {
		return n;
	}

	public void setN(long n) {
		this.n = n;
		Normalize();
	}

	public static Rational getMax() {
		return max;
	}

	public Rational(long z, long n) throws IllegalArgumentException {
		if (n == 0) {
			throw new IllegalArgumentException("Nenner darf nicht 0 sein.");
		}
		this.z = z;
		this.n = n;
		Normalize();
		if (max == null)
			max = this;
		else if (isGreaterThan(max))
			max = this;
	}

	public Rational(long i) {
		this(i, 1);
	}

	public Rational() {
		this(0, 1);
	}

	public Rational Add(Rational x) {
		return new Rational(z * x.getN() + n * x.getZ(), n * x.getN());
	}

	public Rational Sub(Rational x) {
		return new Rational(z * x.getN() - n * x.getZ(), n * x.getN());
	}

	public Rational Mul(Rational x) {
		return new Rational(z * x.getZ(), n * x.getN());
	}

	public Rational Div(Rational x) {
		return new Rational(z * x.getN(), n * x.getZ());
	}

	public Rational Inv() {
		return new Rational(n, z);
	}

	public String toString() {
		return "" + z + "/" + n;
	}

	private void Normalize() {
		if (z == 0) {
			n = 1;
		} else {
			long ggt = getMCD(z, n);
			if (ggt != 1) {
				n = n / ggt;
				z = z / ggt;
			}
		}
	}

	private long getMCD(long a, long b) // GGT nach EUKLID
	{
		if (a < 0)
			a = -a;
		if (b < 0)
			b = -b;
		while (a != b)
			if (a > b)
				a = a - b;
			else
				b = b - a;
		return a;
	}

	public boolean isGreaterThan(Rational x) {
		if (z * x.getN() > x.getZ() * n)
			return true;
		return false;
	}

	public static void main(String[] args) {
		long n;
		long z;
		Rational a, b;
		while (true) {
			try {
				System.out
						.println("Bitte geben sie den Zaehler für die erste Zahl ein:");
				z = In.readLong();
				System.out
						.println("Bitte geben sie den Nenner für die erste Zahl ein:");
				n = In.readLong();
				a = new Rational(z, n);
				System.out
						.println("Bitte geben sie den Zaehler für die zweite Zahl ein:");
				z = In.readLong();
				System.out
						.println("Bitte geben sie den Nenner für die zweite Zahl ein:");
				n = In.readLong();
				b = new Rational(z, n);

				System.out.println("Ergebnisse:");
				System.out.println(a + " + " + b + " = " + a.Add(b));
				System.out.println(a + " - " + b + " = " + a.Sub(b));
				System.out.println(a + " x " + b + " = " + a.Mul(b));
				System.out.println(a + " / " + b + " = " + a.Div(b));
				System.out.println("1 / (" + a + ") = " + a.Inv());
				System.out.println("Bis jtzt erzeugte größte Zahl: "
						+ Rational.getMax());
				System.out.println();
				System.out.println();
				System.out.println();
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
