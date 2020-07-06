import java.util.Random;

public class Belastinginspecteur {

	Belastinginspecteur(Attractie attracties) {
		Random r = new Random();
		int randomgetal = r.nextInt(15);
		if (randomgetal == 1) {
			System.out.println("inspecteur komt langs");
		} else {
			System.out.println("inspecteur komt niet");
		}
	}
}
