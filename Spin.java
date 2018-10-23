package Weekopdracht003;

public class Spin extends Attractie{

	Spin(String nm, double price, int surface) {
		naam = nm;
		prijs = price;
		oppervlakte= surface;
	}

	void draaien() {
		zinnetje();
	}
}
