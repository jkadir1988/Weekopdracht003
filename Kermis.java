package Weekopdracht003;

import java.util.Scanner;

public class Kermis {
	Botsautoos botsauto = new Botsautoos("BOTSAUTO", 2.50, 100);
	Spin spin = new Spin("SPIN", 2.25, 200);
	Spiegelpaleis spiegelpaleis = new Spiegelpaleis("SPIEGELPALEIS", 2.75, 300);
	Spookhuis spookhuis = new Spookhuis("SPOOKHUIS", 3.20, 400);
	Hawaii hawaii = new Hawaii("HAWAII", 2.9, 500);
	Ladderklimmen ladderklimmen = new Ladderklimmen("LADDERKLIMMEN", 5.00, 500);
	Attractie attractie = new Attractie();
	Kassa kassa = new Kassa();
	
	Scanner sc = new Scanner(System.in);
	String attractieMenu; 
	
	void begin(){
		System.out.println("Welkom op de Kermis !\n");
		System.out.println("Op welke attractie wilt u een ritje maken: ");
		System.out.println("Kies 1 voor " + botsauto.naam);
		System.out.println("Kies 2 voor " + spin.naam);
		System.out.println("Kies 3 voor " + spiegelpaleis.naam);
		System.out.println("Kies 4 voor " + spookhuis.naam);
		System.out.println("Kies 5 voor " + hawaii.naam);
		System.out.println("Kies 6 voor " + ladderklimmen.naam);
		System.out.println("\nKies O om de omzet van de kermis te zien");
		System.out.println("Kies K om het aantal verkochte kaartje te laten zijn");
		System.out.println("\nKies Q om de kermis te verlaten");
		boolean stoppen = true;
		while (stoppen) {
			attractieMenu = sc.nextLine().toLowerCase();
			switch (attractieMenu) {
			case "1":
				botsauto.draaien();
				break;
			case "2":
				spin.draaien();
				break;
			case "3":
				spiegelpaleis.draaien();
				break;
			case "4":
				spookhuis.draaien();
				break;
			case "5":
				hawaii.draaien();
				break;
			case "6":
				ladderklimmen.draaien();
				break;
			case "o":
				totaleOmzet();
				kassa.totaleOmzet();
				break;
			case "k":
				aantalVerkochteKaartjes();
				kassa.aantalVerkochteKaartjes();
				break;
			case "q":
				stoppen = false;
				System.out.println("\nTot de volgende keer!\n");
				System.exit(0);
				break;
			default:
				System.out.println("\nToets een geldige knop aub!");
			}
		}
	}
	void aantalVerkochteKaartjes() {
		System.out.println("Aantal verkochte kaartjes per attractie: ");
		System.out.println(botsauto.aantalVerkochteKaartjes + "x\t" + botsauto.naam);
		System.out.println(spin.aantalVerkochteKaartjes + "x\t" + spin.naam);
		System.out.println(spiegelpaleis.aantalVerkochteKaartjes + "x\t" + spiegelpaleis.naam);
		System.out.println(spookhuis.aantalVerkochteKaartjes+ "x\t" + spookhuis.naam);
		System.out.println(hawaii.aantalVerkochteKaartjes + "x\t" + hawaii.naam);
		System.out.println(ladderklimmen.aantalVerkochteKaartjes+ "x\t" + ladderklimmen.naam);
		
	}
	void totaleOmzet() {
		System.out.println("Omzet per attractie: ");
		System.out.println("€" + botsauto.omzet + "\t" + botsauto.naam);
		System.out.println("€" + spin.omzet + "\t" + spin.naam);
		System.out.println("€" + spiegelpaleis.omzet + "\t" + spiegelpaleis.naam);
		System.out.println("€" + spookhuis.omzet+ "\t" + spookhuis.naam);
		System.out.println("€" + hawaii.omzet + "\t" + hawaii.naam);
		System.out.println("€" + ladderklimmen.omzet+ "\t" + ladderklimmen.naam);

	}
}
