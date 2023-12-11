package org.generation.italy.model;

//superclasse
/**
 * rappresenta un veicolo generico
 */
public class Veicolo {
	private String marca, modello, targa;
	private int nrRuote;
	protected int velocità, velocitàMassima;		//gli attributi protected sono visibili nella classe in cui sono dichiarati e in tutte le sottoclassi
	
	public Veicolo() {			//costruttore senza parametri (implicito)
		marca="non definita";
		modello="non definita";
		targa="non definita";
		velocità=0;
		//ecc.
	}
	
	//inizializza gli attributi comuni
	public Veicolo(String marca, String modello, String targa, int nrRuote, int velocitàMassima) {
		super();	//chiamata al costruttore della classe Object (classe predefinita di Java, la "superclasse" di tutte le altre classi) 
		this.marca = marca;
		this.modello = modello;
		this.targa = targa;
		this.nrRuote = nrRuote;
		if (this.velocitàMassima>0)
			this.velocitàMassima = velocitàMassima;
		this.velocità=0;
	}

	/**
	 * accelera di un km/h
	 */
	//prima versione di accelera
	public void accelera() {
		if (velocità<velocitàMassima)
			velocità++;
	}
	
	public void decelera() {
		if (velocità>0)
			velocità--;
	}
	
	public void accelera(int quantità) {		//altra versione di accelera. Stesso nome, comportamento diverso (polimorfismo). Questo modo di utilizzare il polimorfismo viene detto "Overloading"
		if (velocità<velocitàMassima-quantità)
			velocità=velocità+quantità;
	}
		

	public void accelera(String quanto) {	  //altra versione di accelera. Stesso nome, comportamento diverso (polimorfismo). In particolare: "Overloading"
		switch (quanto) {
		case "poco": 
			velocità=velocità+1;
			break;
		case "abbastanza": 
			velocità=velocità+5;
			break;
		case "molto": 
			velocità=velocità+10;
			break;
		}
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public String getTarga() {
		return targa;
	}

	/**
	 * Imposta la targa del veicolo
	 * 
	 * @param targa
	 * 		la targa da impostare
	 */
	public void setTarga(String targa) {
		this.targa = targa;
	}

	//la velocità è in sola lettura (ho il getter ma non il setter)
	public int getVelocità() {
		return velocità;
	}
	
	public int getNrRuote() {
		return nrRuote;
	}

	public void setNrRuote(int nrRuote) {
		this.nrRuote = nrRuote;
	}

	public int getVelocitàMassima() {
		return velocitàMassima;
	}

	public void setVelocitàMassima(int velocitàMassima) {
		if (this.velocitàMassima>0)
			this.velocitàMassima = velocitàMassima;
	}
	
	
}
