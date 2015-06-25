 	
public class Auftragsabwicklung {
	public static void main(String args[]) {
		final double produktion = 200; // Wochenproduktion
		// fuelle die Bestellung mit Flussigkeitsbehaltnissen
		
		Behaeltnis[] bestellung = {
		new Tetrapack(2.3, 0.9, 0.7), new Dose(0.35 , 1.15),
		new Dose(0.35 , 1.15), new Tetrapack(1.1, 0.7, 0.7) // ...
		};
		// gebe Liste aller bestellten Flussigkeitsbehaltnisse aus
		for (int i = 0; i < bestellung.length; i++) {
			bestellung[i].println();
		}
		
		double bestellungsVolumen=0.0;
		for (int i = 0; i < bestellung.length; i++) {
			bestellungsVolumen+=bestellung[i].volumen();
		}
		System.out.println("Wöchentliche Bestellung: "+String.format("%.6f",bestellungsVolumen)
				+ "; Restliche Produktion: "+String.format("%.6f",(produktion-bestellungsVolumen)));
		}
}
