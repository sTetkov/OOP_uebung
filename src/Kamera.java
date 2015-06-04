
public class Kamera extends Artikel {
	private boolean objektiv;
	public Kamera(String name, int minAnzahl, int aktAnzahl, float nettoPreis,
			boolean objektiv){
		super(name, minAnzahl, aktAnzahl, nettoPreis, (float) 19.0);
		this.objektiv=objektiv;
	}
	
	protected String getPrintString()
	{
		String res= super.getPrintString()+" - ist eine Kamera und hat";
		if(objektiv)
			return res+" ein Objektiv";
		return res+" kein Objektiv";
	}
}
