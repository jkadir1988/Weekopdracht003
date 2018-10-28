package Weekopdracht003;

import java.util.Scanner;

public class Klant {
	static String naam;

	void naamInvoeren() {
		System.out.println("Hallo !\n");
		System.out.println("Hoe heet u? : ");
		Scanner inputNaam = new Scanner(System.in);
		naam = inputNaam.nextLine();
		System.out.println("\nWelkom op de Kermis, " + naam + " !\n");
	}
}
