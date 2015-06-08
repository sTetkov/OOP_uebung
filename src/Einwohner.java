public class Einwohner {
	private int einkommen;

	public int zuVersteuerndesEinkommen() {
		return einkommen;
	}

	public int steuer() {
		int steuer = zuVersteuerndesEinkommen() / 10;
		if (steuer == 0)
			steuer = 1;
		return steuer;
	}

	void setEinkommen(int einkommen) {
		this.einkommen = einkommen;
	}
}