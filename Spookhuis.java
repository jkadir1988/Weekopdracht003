package Weekopdracht003;

public class Spookhuis extends Attractie{

	Spookhuis(String nm, double price, int surface) {
		naam = nm;
		prijs = price;
		oppervlakte= surface;
	}

	void draaien() {
		zinnetje();
	}
}
