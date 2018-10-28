package Weekopdracht003;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kermis {
	Botsautoos botsauto = new Botsautoos("Mario Kart Battle", 2.50, 100);
	Spin spin = new Spin("Amazing Spiderman", 2.25, 200);
	Spiegelpaleis spiegelpaleis = new Spiegelpaleis("Mirror Dimension", 2.75, 300);
	Spookhuis spookhuis = new Spookhuis("The Haunted House", 3.20, 400);
	Hawaii hawaii = new Hawaii("Honolulu Beach", 2.9, 500);
	Ladderklimmen ladderklimmen = new Ladderklimmen("Stairway To Heaven", 5.00, 500);

	static Attractie attractie = new Attractie();
	Kassa kassa = new Kassa();
	Klant klant = new Klant();
	DecimalFormat df = new DecimalFormat("0.00");

	Scanner sc = new Scanner(System.in);
	String attractieMenu;

	void begin() {
		menuAttracties();
		boolean stoppen = true;
		while (stoppen) {
			attractieMenu = sc.nextLine().toLowerCase();
			switch (attractieMenu) {
			case "1":
				botsauto.draaien();
				menuAttracties();
				break;
			case "2":
				spin.draaien();
				menuAttracties();
				break;
			case "3":
				spiegelpaleis.draaien();
				menuAttracties();
				break;
			case "4":
				spookhuis.draaien();
				menuAttracties();
				break;
			case "5":
				hawaii.draaien();
				menuAttracties();
				break;
			case "6":
				ladderklimmen.draaien();
				menuAttracties();
				break;
			case "o":
				totaleOmzet();
				kassa.totaleOmzet();
				procentBelasting();
				menuAttracties();
				break;
			case "k":
				aantalVerkochteKaartjes();
				kassa.aantalVerkochteKaartjes();
				menuAttracties();
				break;
			case "q":
				stoppen = false;
				System.out.println("\nBedankt, " + Klant.naam + "! Tot de volgende keer !");
				break;
			default:
				System.out.println("\nToets een geldige knop aub!");
			}
		}
	}

	void menuAttracties() {
		System.out.println("Op welke attractie wilt u een ritje maken?");
		System.out.println("Kies 1 voor " + botsauto.naam + "\tKies 3 voor " + spiegelpaleis.naam + "\tKies 5 voor "
				+ hawaii.naam);
		System.out.println(
				"Kies 2 voor " + spin.naam + "\tKies 4 voor " + spookhuis.naam + "\tKies 6 voor " + ladderklimmen.naam);
		System.out.println(
				"\nKies O voor een overzicht van de omzet van de kermis.\nKies K voor de totale kaartenverkoop van de kermis.\nKies Q om de kermis te verlaten.");
	}

	void aantalVerkochteKaartjes() {
		System.out.println("\nAantal verkochte kaartjes per attractie: ");
		System.out.println(botsauto.aantalVerkochteKaartjes + "x\t" + botsauto.naam);
		System.out.println(spin.aantalVerkochteKaartjes + "x\t" + spin.naam);
		System.out.println(spiegelpaleis.aantalVerkochteKaartjes + "x\t" + spiegelpaleis.naam);
		System.out.println(spookhuis.aantalVerkochteKaartjes + "x\t" + spookhuis.naam);
		System.out.println(hawaii.aantalVerkochteKaartjes + "x\t" + hawaii.naam);
		System.out.println(ladderklimmen.aantalVerkochteKaartjes + "x\t" + ladderklimmen.naam);
	}

	void totaleOmzet() {
		System.out.println("\nOmzet per attractie: ");
		System.out.println("€" + df.format(botsauto.omzet) + "\t\t" + botsauto.naam);
		System.out.println("€" + df.format(spin.omzet) + "\t\t" + spin.naam);
		System.out.println("€" + df.format(spiegelpaleis.omzet) + "\t\t" + spiegelpaleis.naam);
		System.out.println("€" + df.format(spookhuis.omzet) + "\t\t" + spookhuis.naam);
		System.out.println("€" + df.format(hawaii.omzet) + "\t\t" + hawaii.naam);
		System.out.println("€" + df.format(ladderklimmen.omzet) + "\t\t" + ladderklimmen.naam); 
		
	}
	void procentBelasting() {
		System.out.println("€" + df.format(ladderklimmen.kansSpelBelastingBetalen(ladderklimmen)) + " = 30% over de omzet aan Kans Belasting door attractie " + ladderklimmen.naam + "\n");
	}
}
