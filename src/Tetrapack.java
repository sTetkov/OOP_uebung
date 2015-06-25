
public class Tetrapack extends Behaeltnis {

	private double volume;
	private double width;
	private double length;
	private double height;
	public Tetrapack(double width, double length, double height) {
		this.width=width;
		this.length=length;
		this.height=height;
		volume=width*length*height;
	}

	@Override 
	public double volumen() {
		return volume;
	}

	@Override
	public void println() {
		System.out.println("Tetrapack "+String.format("%.2f",width)+"x"+String.format("%.2f",length)+"x"+String.format("%.2f",height)
				+"\tVolume: "+String.format("%.2f",volume));
	}

}
