package Weekopdracht003;

public class Spiegelpaleis extends Attractie{

	Spiegelpaleis(String nm, double price, int surface) {
		naam = nm;
		prijs = price;
		oppervlakte= surface;
	}

	void draaien() {
		zinnetje();
	}
}
