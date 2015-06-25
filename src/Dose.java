
public class Dose extends Behaeltnis {

	private double volume;
	private double diameter;
	private double height;
	public Dose(double diameter, double height) {
		double radius=diameter/2;
		this.diameter=diameter;
		double base=radius*radius*Math.PI;
		this.height=height;
		volume=base*height;
	}

	@Override
	public double volumen() {
		return volume;
	}

	@Override
	public void println() {
		System.out.println("Dose Ø"+String.format("%.2f",diameter)+" h:"+String.format("%.2f",height)+
				"\t\tVolume: "+String.format("%.2f",volume));
	}

}
