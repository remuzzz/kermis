import java.util.ArrayList;

public class Attractie {
	boolean RisicoRijkeAttractie;
	String naam;
	double prijs;
	int kaartjes;
	int onderhoudsinterval;
	boolean GokAttractie;
	double omzet;
	double belastingpotje;
	
	ArrayList<Attractie> init_attractie() {
			ArrayList<Attractie> attracties = new ArrayList<Attractie>(); 
			attracties.add(new Spin()); // array 0: 
			attracties.add(new Botsauto()); // 1
			attracties.add(new Hawaii()); // 2
			attracties.add(new Ladderklimmen()); // 3
			attracties.add(new Spiegelpaleis()); // 4
			attracties.add(new Spookhuis()); // 5
			attracties.get(0).prijs = 2.25;
			attracties.get(0).naam= "Spin";
			attracties.get(3).prijs = 5;
			attracties.get(3).naam= "Ladderklimmen";
			attracties.get(4).prijs = 2.75;
			attracties.get(4).naam= "Spiegelpaleis";
			
			return attracties;
	}
	
	void draaien() throws Exception {
		//keuren(kaartjes);
		System.out.println("Deze attractie draait nu: " + naam);
		kaartjes++;
		omzetBerekenen();
	}
	public void omzetBerekenen()
	{
	
		System.out.println("Dit is een omzet in de attractieklasse");
		if (this instanceof Gokattractie) {
			omzet += (prijs*0.70);
			Kassa.omzet += (prijs*0.70);
			belastingpotje += (prijs*0.30);
			System.out.println(prijs*0.70 + prijs*0.30);
			Kassa.kaartjes += 1;
		}
		else {
			omzet += prijs;
			Kassa.omzet += prijs;
			Kassa.kaartjes += 1;
		}
		System.out.println("Dit is de totaalomzet van de kermis nu"+ Kassa.omzet);
		System.out.println("Dit is het totaal aantal kaartjes"+ Kassa.kaartjes);
		
	}
	void omzetTonen() {
		System.out.println("Omzet: " + omzet);
	}
	void kaartjesTonen() {
		System.out.println("Aantal kaartjes verkocht: " + kaartjes);
	}
	void opstellingsKeuring() 	{
	}
	void monteur() {
	}

}