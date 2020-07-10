
public abstract class RisicoRijkeAttractie extends Attractie {
	
void draaien() throws Exception {
		System.out.println("Dit is een risicovolle.");
		
		try {		
			kaartjes++;
			onderhoudsinterval++;
			checkKeuring(onderhoudsinterval); 
			System.out.println("Deze attractie draait nu: " + naam);
			
			omzetBerekenen();
			}
		catch (Exception e) { 
			System.out.println("De attractie is toe aan een beurt en het is niet veilig om in te stappen. Roep een moneur op met M");
		}
		
		finally {
		
		}
	}
	
	void checkKeuring(int onderhoudsinterval) throws Exception {
	
		if (super.naam == "Spin" && onderhoudsinterval >= 6) {
			
			throw new Exception();	
		}
		if (super.naam == "Hawaii" && onderhoudsinterval >= 11) {
			
			throw new Exception();	
		}
		
	}
	
	void monteur() {
	onderhoudsinterval = 0;
	}
}
