package Weekopdracht003;

class Kassa {
	int totaalAantalVerkochteKaartjes;
	double totaleOmzet;
	
	void aantalVerkochteKaartjes() {
		System.out.println("=======\n" + Attractie.totaalVerkochteKaartjes + "x\tTotaal verkochte kaartje van alle attracties.");
	}
	void totaleOmzet() {
		System.out.println("=======\n€" + Attractie.totaleOmzet + "\tTotaal omzet van alle attracties.");
	}
}
