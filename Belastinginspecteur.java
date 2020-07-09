import java.util.Random;

public class Belastinginspecteur {

	Belastinginspecteur(Attractie attractie) {
		Random r = new Random();
		int randomgetal = r.nextInt(2);
		if (randomgetal == 1) {
			System.out.println("inspecteur komt langs");

			
		} else {
			System.out.println("inspecteur komt niet");
		}
	}
}
