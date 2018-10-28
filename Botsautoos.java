package Weekopdracht003;

public class Botsautoos extends Attractie {

	Botsautoos(String nm, double price, int surface) {
		naam = nm;
		prijs = price;
		oppervlakte = surface;
	}

	void draaien() {
		System.out.println("\n" + naam + " draait. De prijs is €" + df.format(prijs) + " per rit\n");
		aantalVerkochteKaartjes++;
		totaalVerkochteKaartjes++;
		totaleOmzet+=prijs;
		omzet+=prijs;
	}
}
