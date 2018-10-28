package Weekopdracht003;

public class Ladderklimmen extends Attractie implements GokAttractie {

	Ladderklimmen(String nm, double price, int surface) {
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

	public double kansSpelBelastingBetalen(Attractie attractie) {
		attractie.kansBelasting += (attractie.prijs * 0.3);
		return attractie.kansBelasting;
		
	}
}
