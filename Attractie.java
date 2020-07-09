import java.util.ArrayList;

public class Attractie {
	boolean RisicoRijkeAttractie;
	String naam;
	double prijs;
	int kaartjes;
	boolean GokAttractie;
	double omzet;
	
	ArrayList<Attractie> init_attractie() {
			ArrayList<Attractie> attracties = new ArrayList<Attractie>(); 
			attracties.add(new Spin()); // 0
			attracties.add(new Botsauto()); // 1
			attracties.add(new Hawaii()); // 2
			attracties.add(new Ladderklimmen()); // 3
			attracties.add(new Spiegelpaleis()); // 4
			attracties.add(new Spookhuis()); // 5
			attracties.get(0).prijs = 2.25;
			attracties.get(0).naam= "Spin";
			return attracties;
	}
	
	

	void draaien() {
		
		//keuren(kaartjes);
		
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
	void opstellingsKeuring() 	{
	}
	void onderhoudsBeurt() {
	}
	void kansSpelBelastingBetalen() {
	}
}