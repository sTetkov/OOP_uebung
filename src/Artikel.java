
public class Artikel {
	private int aktAnzahl;
	private int minAnzahl;
	private String name;
	private float nettoPreis;
	private float mwSt; 
	
	public Artikel(String name, int minAnzahl, int aktAnzahl, float nettoPreis, float mwSt)
	{
		this.name=name;
		this.minAnzahl=minAnzahl;
		this.aktAnzahl=aktAnzahl;
		this.nettoPreis=nettoPreis;
		this.mwSt=mwSt;
	}
	
	protected String getPrintString()
	{
		return "Artikel "+name+"\t\t"+aktAnzahl+"/"+minAnzahl
				+"\tPreis: "+nettoPreis+" Euro\t MwSt: "+mwSt
				+"% Preis Inkl. MwSt: "+nettoPreis*(1+mwSt/100);
	}
	
	public void print()
	{
		System.out.println(getPrintString());
	}
	
	public void printBestellung()
	{
		int vorrat=aktAnzahl-minAnzahl;
		if(vorrat>=0)
			System.out.println("Artikel "+name+":\t\t Vorrat reicht");
		else
		{
			vorrat=-vorrat;
			System.out.println("Artikel "+name+":\t\t es müssen mindestens "+vorrat
					+" Exemplare bestellt werden für Netto Kosten (ohne MwSt) von "+(nettoPreis*vorrat)
					+" Euro und einen Gesamtpreis (inkl. MwSt) von "+(nettoPreis*vorrat*(1+mwSt/100))+" Euro");
		}
	}
	public static void printArtikel(Artikel arts[]) {
		System.out.println("Artikelliste:");
		for (int i = 0; i < arts.length; i++) {
		arts[i].print(); System.out.println();
		}
		System.out.println("\nBestellung:");
		for (int i = 0; i < arts.length; i++) {
		arts[i].printBestellung(); System.out.println();
		}
		}
	
	public static void main(String[] args)
	{
		Artikel[] arts=new Artikel[6];
		arts[0]=new Buch("Java für Anfänger",10,4,(float) 19.90,234);
		arts[1]=new Audio("Acht Fälle für Lord Peter",4,8,(float)23,8);
		arts[2]=new Audio("Berthold Beitz: Die Biographie",16,8,(float)16,6);
		arts[3]=new Kamera("Nikon Coolpix P900",8,5,(float)520.30,true);
		arts[4]=new Kamera("Kodak EasyShare C195",10,20,(float)52.20,false);
		arts[5]=new Buch("Der große Gatsby",10,10,(float)4.2,220);
		printArtikel(arts);
	}
}
