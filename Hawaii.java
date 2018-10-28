package Weekopdracht003;

public class Hawaii extends RisicoRijkeAttractie {

	Hawaii(String nm, double price, int surface) {
		naam = nm;
		prijs = price;
		oppervlakte = surface;
	}

	void draaien() {
		System.out.println("\n" + naam + " draait. De prijs is €" + df.format(prijs) + " per rit\n");
		aantalVerkochteKaartjes++;
		opstellingsKeuring();
		totaalVerkochteKaartjes++;
		totaleOmzet+=prijs;
		omzet+=prijs;
		
	}

	void opstellingsKeuring() {
		int draaiLimiet = 10;
		if ((aantalVerkochteKaartjes % draaiLimiet) == 0) {
			System.out.println(naam + " is gecontroleerd en gekeurd door een inspectie! En is klaar voor gebruik!\n");
		}
	}
}
