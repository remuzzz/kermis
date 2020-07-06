import java.util.ArrayList;
import java.util.Scanner;

public class kermisMain {

	public static void main(String[] args) {
		ArrayList<Attractie> attracties = new ArrayList<Attractie>(); // Create an ArrayList object
		attracties.add(new Spin()); // 0
		attracties.add(new Botsauto()); // 1
		attracties.add(new Hawaii()); // 2
		attracties.add(new Ladderklimmen()); // 3
		attracties.add(new Spiegelpaleis()); // 4
		attracties.add(new Spookhuis()); // 5

		boolean spelen = false;
		while (!spelen) {
			System.out.println("Kies een attractie:");

			Scanner scanner = new Scanner(System.in);
			int input = scanner.nextInt();
			int i = input -1;
			attracties.get(i).draaien();		
				Scanner scanner2 = new Scanner(System.in);
				String input2 = scanner2.nextLine();
				Spin spin = (Spin)attracties.get(0); // KAN DIT GEAUTOMATISEERD??
				int prijs = spin.kaartjes; // zodat ik dit kan doen met alle attracties
				
				if (input2.equals("o"))
				{
					attracties.get(i).omzet();
				}
				if (input2.equals("k"))
				{
					attracties.get(i).kaartjes();
				}
			
		}

	}

}