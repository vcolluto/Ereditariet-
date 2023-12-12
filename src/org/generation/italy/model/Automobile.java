package org.generation.italy.model;

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
	
	//il costruttore della sottoclasse riceve anche i parametri per gli attributi ereditati
	//inizializza gli attributi ereditati (comuni)+gli attributi specifici di automobile
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
	
	public void azionaTurbo() {
		if (velocità<velocitàMassima-10)
			velocità+=10;
	}
	
	public void accelera(int quantità, String unitàMisura) {		//overloading sulla sottoclasse
		if (unitàMisura.equals("kmh"))
			velocità+=quantità;
		else if (unitàMisura.equals("mph"))
			velocità+=quantità*1.6;
	}
	
	@Override
	public void accelera() {		//versione di accelera() senza parametri - specifico di Automobile
		velocità+=2;
	}
	
	@Override
	public String getDettagli() {		//descrizione del veicolo specifica di automobile
		return "Sono un'automobile di targa " + getTarga();
	}
	
	
	
}
