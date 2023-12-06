package org.generation.italy;

//sottoclasse
public class Automobile extends Veicolo{
	private int capienzaBagagliaio;		//specifica di Automobile

	
	
	public Automobile(String marca, String modello, String targa, int nrRuote, int velocitàMassima,
			int capienzaBagagliaio) {
		super(marca, modello, targa, nrRuote, velocitàMassima); //chiamata al costruttore della superclasse (veicolo)
		this.capienzaBagagliaio = capienzaBagagliaio;
		
	}


	public int getCapienzaBagagliaio() {
		return capienzaBagagliaio;
	}

	public void setCapienzaBagagliaio(int capienzaBagagliaio) {
		this.capienzaBagagliaio = capienzaBagagliaio;
	}
	
	
	
	
}
