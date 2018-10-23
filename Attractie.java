package Weekopdracht003;

public class Attractie {
	String naam;
	double prijs;
	double omzet;
	double totaleOmzet;
	int oppervlakte;
	int aantalVerkochteKaartjes;
	int totaalVerkochteKaartjes;

//	@Override
//	public String toString() {
//		return "De attractie " + naam + " draait. De prijs is: " + prijs + " euro. De oppervlakte is: " + oppervlakte;
//	}
	void zinnetje() {
		System.out.println("de attractie " + naam + " draait. De prijs is " + prijs + " euro per rit");
		aantalVerkochteKaartjes++;
		totaalVerkochteKaartjes=+aantalVerkochteKaartjes;
		omzet+=prijs;
		totaleOmzet+=omzet;
	}
}
