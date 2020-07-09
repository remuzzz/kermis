import java.util.Random;

public class Belastinginspecteur {

	Belastinginspecteur(Attractie attractie) {
		Random r = new Random();
		int randomgetal = r.nextInt(5);
		if (randomgetal == 1) {
			System.out.println("inspecteur komt langs en heeft " +attractie.belastingpotje+ " euro geind.");
			attractie.belastingpotje = 0; 
					
		} else {
			System.out.println("inspecteur komt niet");
		}
	}
}
