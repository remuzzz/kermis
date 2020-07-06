
public abstract class RisicoRijkeAttractie extends Attractie {
	
	
	void keuren(int kaartjes) {
		if (kaartjes == 0)	{
			opstellingsKeuring();
		}
		if (kaartjes == 5) {
			onderhoudsBeurt();
		}
	}
}
