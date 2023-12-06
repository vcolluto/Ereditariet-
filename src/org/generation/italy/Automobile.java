package org.generation.italy;

//sottoclasse
public class Automobile extends Veicolo{
	private int capienzaBagagliaio;		//specifica di Automobile

	
	
	public Automobile(String marca, String modello, String targa,  int velocitàMassima,
			int capienzaBagagliaio) {
		super(marca, modello, targa, 4, velocitàMassima); //chiamata al costruttore della superclasse (veicolo) con nrRuote=4
		this.capienzaBagagliaio = capienzaBagagliaio;
		
	}


	public int getCapienzaBagagliaio() {
		return capienzaBagagliaio;
	}

	public void setCapienzaBagagliaio(int capienzaBagagliaio) {
		this.capienzaBagagliaio = capienzaBagagliaio;
	}
	
	
	
	
}
