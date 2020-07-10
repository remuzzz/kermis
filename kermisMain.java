import java.util.ArrayList;
import java.util.Scanner;

public class kermisMain {

	public static void main(String[] args) throws Exception {	
		Attractie attractie = new Attractie(); // attracties worden aangemaakt
		ArrayList<Attractie> attracties = new ArrayList<Attractie>(); 
		attracties = attractie.init_attractie();
		
		boolean spelen = false;
		while (!spelen) {
			System.out.println("Kies een attractie:");
			
			Scanner scanner = new Scanner(System.in);
			int input = scanner.nextInt();
			int i = input - 1;
			attracties.get(i).draaien();
			if (attracties.get(i) instanceof Gokattractie)
			{
				Belastinginspecteur belastinginspecteur = new Belastinginspecteur(attracties.get(i));
			}
			Scanner scanner2 = new Scanner(System.in);
			String input2 = scanner2.nextLine();
			
//			if (attracties.get(i).GokAttractie == true) {
//				Belastinginspecteur belastinginspecteur = new Belastinginspecteur(attracties.get(i));
//			}
//			if (attracties.get(i).RisicoRijkeAttractie == true) {
//				RisicoRijkeAttractie.keuren(2);
//				attracties.get(0)).keuren();
//				
//			}
			
			if (input2.equals("o")) {
				attracties.get(i).omzetTonen();
			}
			if (input2.equals("k")) {
				attracties.get(i).kaartjesTonen();
			}
			if (input2.equals("m")) {
				
				attracties.get(i).monteur();
			}

		}

	}
	

}