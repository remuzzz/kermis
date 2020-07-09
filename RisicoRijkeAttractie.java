
public abstract class RisicoRijkeAttractie extends Attractie {
	
void draaien() {
		System.out.println("Dit is een risicovolle.");
		keuren(kaartjes);
		System.out.println("Deze attractie draait nu: " + naam);
		kaartjes++;
		omzetBerekenen();
		
	}
	
	void keuren(int kaartjes) {
		if (kaartjes == 0)	{
			opstellingsKeuring();
		}
		if (kaartjes == 5) {
			onderhoudsBeurt();
		}
	}
}
