package Weekopdracht003;

import java.text.DecimalFormat;

class Kassa {
	int totaalAantalVerkochteKaartjes;
	static double totaleOmzet;
	DecimalFormat df = new DecimalFormat("0.00");

	void aantalVerkochteKaartjes() {
		System.out.println("=================================\n" + Attractie.totaalVerkochteKaartjes + "x\ttotaal verkochte kaartjes van alle attracties." + "\n");
	}

	void totaleOmzet() {
		System.out.println("=================================\n€" + df.format(Attractie.totaleOmzet) + "\ttotaal omzet van alle attracties.");
	}
}
