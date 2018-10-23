package Weekopdracht003;

public class Botsautoos extends Attractie{

	Botsautoos(String nm, double price, int surface) {
		naam = nm;
		prijs = price;
		oppervlakte= surface;
	}

	void draaien() {
		zinnetje();
	}	
}
