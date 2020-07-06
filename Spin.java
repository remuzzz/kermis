
public class Spin extends RisicoRijkeAttractie {
	String naam = "spin";
	double prijs = 2.25;
	int kaartjes;
	boolean RisicoRijkeAttractie = true;
	boolean GokAttractie = false;
	double omzet;

	void draaien() {
		
		keuren(kaartjes);
		
		System.out.println("Deze attractie draait nu: " + naam);
		kaartjes++;
		omzet += prijs;
		
	}
	void omzet() {
		System.out.println("Omzet: " + omzet);
	}
	void kaartjes() {
		System.out.println("Aantal kaartjes verkocht: " + kaartjes);
	}

	
}
