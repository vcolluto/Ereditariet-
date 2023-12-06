package org.generation.italy;

//sottoclasse
/**
 * 
 */
public class Automobile extends Veicolo{
	private int capienzaBagagliaio;		//specifica di Automobile

	
	
	/**
	 * @param marca	: la marca dell'automobile
	 * @param modello: il modello
	 * @param targa
	 * @param velocitàMassima
	 * @param capienzaBagagliaio
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

	public void setCapienzaBagagliaio(int capienzaBagagliaio) {
		this.capienzaBagagliaio = capienzaBagagliaio;
	}
	
	
	
	
}
