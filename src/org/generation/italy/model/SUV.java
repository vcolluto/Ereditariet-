package org.generation.italy.model;

public class SUV extends Automobile {
	
	
	/**
	 * Metodo costruttore
	 * 
	 * @param marca
	 * 			la marca dek SUV
	 * @param modello
	 * 			il modello del SUV
	 * @param targa
	 * @param velocitàMassima
	 * @param capienzaBagagliaio
	 */
	public SUV(String marca, String modello, String targa, int velocitàMassima, int capienzaBagagliaio) {
		super(marca, modello, targa, velocitàMassima, capienzaBagagliaio);	//chiamo il costruttore della superclasse (Automobile)
		
		this.gancioTraino="x";
	}

	String gancioTraino;
}
