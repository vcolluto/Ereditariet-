package org.generation.italy;

public class SUV extends Automobile {
	
	
	public SUV(String marca, String modello, String targa, int velocitàMassima, int capienzaBagagliaio) {
		super(marca, modello, targa, velocitàMassima, capienzaBagagliaio);	//chiamo il costruttore della superclasse (Automobile)
		
		this.gancioTraino="x";
	}

	String gancioTraino;
}
