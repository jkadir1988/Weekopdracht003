package Weekopdracht003;

public class Ladderklimmen extends Attractie {

	Ladderklimmen(String nm, double price, int surface) {
		naam = nm;
		prijs = price;
		oppervlakte= surface;
	}

	void draaien() {
		zinnetje();
	}
}
