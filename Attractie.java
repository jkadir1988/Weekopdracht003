package Weekopdracht003;

import java.util.Scanner;

public class Attractie {
	String naam;
	double prijs;
	int oppervlakte;
	boolean stoppen = true;

	public String toString() {
		return "De attractie " + naam + " draait. De prijs is: " + prijs + " euro. De oppervlakte is: " + oppervlakte;
	}

	void starten() {
		System.out.println("Welkom op de Kermis !");

		Botsautoos botsauto = new Botsautoos("BOTSAUTO", 2.50, 100);
		Spin spin = new Spin("SPIN", 2.25, 200);
		Spiegelpaleis spiegelpaleis = new Spiegelpaleis("SPIEGELPALEIS", 2.75, 300);
		Spookhuis spookhuis = new Spookhuis("SPOOKHUIS", 3.20, 400);
		Hawaii hawaii = new Hawaii("HAWAII", 2.90, 500);
		Ladderklimmen ladderklimmen = new Ladderklimmen("LADDERKLIMMEN", 5.00, 500);

		Scanner sc = new Scanner(System.in);
		int attractieMenu = 0;

		while (stoppen) {
			System.out.println("\nKies uit de volgende attracties: ");
			System.out.println("Kies 1. om een ritje te maken in : " +botsauto.naam);
			System.out.println("Kies 2. om een ritje te maken in : " +spin.naam);
			System.out.println("Kies 3. om een ritje te maken in : " +spiegelpaleis.naam);
			System.out.println("Kies 4. om een ritje te maken in : " +spookhuis.naam);
			System.out.println("Kies 5. om een ritje te maken in : " +hawaii.naam);
			System.out.println("Kies 6. om een ritje te maken in : " +ladderklimmen.naam);
			System.out.println("Kies 0. om de kermis te verlaten");
			attractieMenu = sc.nextInt();
			switch (attractieMenu) {
			case 1:
				botsauto.draaien();
				break;
			case 2:
				spin.draaien();
				break;
			case 3:
				spiegelpaleis.draaien();
				break;
			case 4:
				spookhuis.draaien();
				break;
			case 5:
				hawaii.draaien();
				break;
			case 6:
				ladderklimmen.draaien();
				break;
			case 0:
				stoppen = false;
				einde();
				break;
			default:
				System.out.println("\nToets een geldige knop aub!");
			}
		}
	}
	void zinnetje() {
		System.out.println("de attractie " + naam + " draait. De prijs is " + prijs + " euro");
	}

	void einde() {
		System.out.println("\nTot de volgende keer!\n");
	}
}
