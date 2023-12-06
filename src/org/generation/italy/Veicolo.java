package org.generation.italy;

//superclasse
public class Veicolo {
	private String marca, modello, targa;
	private int velocità, nrRuote, velocitàMassima;
	
	
	
	
	public Veicolo(String marca, String modello, String targa, int nrRuote, int velocitàMassima) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.targa = targa;
		this.nrRuote = nrRuote;
		if (this.velocitàMassima>0)
			this.velocitàMassima = velocitàMassima;
		this.velocità=0;
	}

	void accelera() {
		if (velocità<velocitàMassima)
			velocità++;
	}
	
	void decelera() {
		if (velocità>0)
			velocità--;
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

	public void setTarga(String targa) {
		this.targa = targa;
	}

	public int getVelocità() {
		return velocità;
	}

	public void setVelocità(int velocità) {
		this.velocità = velocità;
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
		this.velocitàMassima = velocitàMassima;
	}
	
	
}