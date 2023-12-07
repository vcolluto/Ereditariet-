package org.generation.italy;

//sottoclasse
/**
 * rappresenta un'automobile
 */
public class Automobile extends Veicolo{
	private int capienzaBagagliaio;		//specifica di Automobile

	
	
	/**
	 * @param marca 
	 * 		la marca dell'automobile
	 * @param modello 
	 * 		il modello dell'automobile
	 * @param targa
	 * 		la targa dell'automobile
	 * @param velocitàMassima
	 * 		la velocità massima
	 * @param capienzaBagagliaio
	 * 		la capienza del bagagliaio
	 */
	public Automobile(String marca, String modello, String targa,  int velocitàMassima,
			int capienzaBagagliaio) {
		super(marca, modello, targa, 4, velocitàMassima); //chiamata al costruttore della superclasse (veicolo) con nrRuote=4
		//super();		//il costruttore senza parametri può essere chiamato anche in maniera implicita
		this.capienzaBagagliaio = capienzaBagagliaio;
		
	}


	
	/**
	 * @return la capienza dell'automobile
	 */
	public int getCapienzaBagagliaio() {
		return capienzaBagagliaio;
	}

	/**
	 * imposta la capienza del bagagliaio 
	 * 
	 * @param capienzaBagagliaio
	 * 		la capienza da impostare
	 */
	public void setCapienzaBagagliaio(int capienzaBagagliaio) {
		this.capienzaBagagliaio = capienzaBagagliaio;
	}
	
	
	
	
}
