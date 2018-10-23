package Weekopdracht003;

//attractie 1
public class Botsautoos extends Attractie {

	Botsautoos(String nm, double price, int surface) {
		naam = nm;
		prijs = price;
		oppervlakte= surface;
	}

	void draaien() {
		System.out.println("de attractie " + naam + " draait");
	}
}
