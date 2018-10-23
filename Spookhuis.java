package Weekopdracht003;

//attractie 4
public class Spookhuis extends Attractie {

	Spookhuis(String nm, double price, int surface) {
		naam = nm;
		prijs = price;
		oppervlakte= surface;
	}

	void draaien() {
		System.out.println("de attractie " + naam + " draait");
	}
}
