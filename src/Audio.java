
public class Audio extends Artikel {
	private int elemente;
	public Audio(String name, int minAnzahl, int aktAnzahl, float nettoPreis,
			int elemente){
		super(name, minAnzahl, aktAnzahl, nettoPreis, (float) 19.0);
		this.elemente=elemente;
	}
	
	protected String getPrintString()
	{
		return super.getPrintString()+" - ist Audio und besteht aus "+elemente+" Elementen";
	}
}
