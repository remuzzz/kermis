
public class Ladderklimmen extends Attractie implements Gokattractie {
	double prijs = 5.00;
	double omzet;
	int kaartjes;
	double belasting;
	boolean GokAttractie = true;
	String naam = "Ladderklimmen";
	
	void draaien() {
		
			
		System.out.println("Deze attractie draait nu: " + naam);
		kaartjes++;
		omzet += (prijs*0.7);
		belasting += (prijs*0.3);
		
		
	}
	public void kansSpelBelastingBetalen()	{
	}
}
