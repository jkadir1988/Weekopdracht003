package Weekopdracht003;

//attractie 2
public class Spin extends Attractie {

	Spin(String nm, double price, int surface) {
		naam = nm;
		prijs = price;
		oppervlakte= surface;
	}

	void draaien() {
		zinnetje();
	}
}
