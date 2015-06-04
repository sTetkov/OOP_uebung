
public class Buch extends Artikel {

	private int seiten;
	public Buch(String name, int minAnzahl, int aktAnzahl, float nettoPreis,
			int seiten){
		super(name, minAnzahl, aktAnzahl, nettoPreis, (float) 7.0);
		this.seiten=seiten;
	}
	
	protected String getPrintString()
	{
		return super.getPrintString()+" - ist ein buch mit "+seiten+" seiten";
	}

}
