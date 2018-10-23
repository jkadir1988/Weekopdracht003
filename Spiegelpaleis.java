package Weekopdracht003;

//attractie 3
public class Spiegelpaleis extends Attractie {

	Spiegelpaleis(String nm, double price, int surface) {
		naam = nm;
		prijs = price;
		oppervlakte= surface;
	}

	void draaien() {
		System.out.println("de attractie " + naam + " draait");
	}
}
