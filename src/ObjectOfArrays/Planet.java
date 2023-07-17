package ObjectOfArrays;

import java.util.Arrays;

public class Planet 
{
	String name;
	String []atm;
	int moon;
	boolean ring;
	public Planet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Planet(String name, String[] atm, int moon, boolean ring) {
		super();
		this.name = name;
		this.atm = atm;
		this.moon = moon;
		this.ring = ring;
	}
	@Override
	public String toString() {
		return "Planet [name :" + name + ", Atmosperic Gas :" + Arrays.toString(atm) + ", moon :" + moon + ", ring :" + ring + "]";
	}
	
	
}
