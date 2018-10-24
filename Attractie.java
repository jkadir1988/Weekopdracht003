package Weekopdracht003;

public class Attractie {
	String naam;
	double prijs;
	double omzet;
	static double totaleOmzet;
	int oppervlakte;
	int aantalVerkochteKaartjes;
	static int totaalVerkochteKaartjes;

//	@Override
//	public String toString() {
//		return "De attractie " + naam + " draait. De prijs is: " + prijs + " euro. De oppervlakte is: " + oppervlakte;
//	}
	void zinnetje() {
		System.out.println("de attractie " + naam + " draait. De prijs is " + prijs + " euro per rit");
		aantalVerkochteKaartjes++;
		totaalVerkochteKaartjes++;
		totaleOmzet+=prijs;
		omzet+=prijs;
	}
}
