package org.generation.italy;

public class Main {

	public static void main(String[] args) {
		Veicolo v=new Veicolo("Fiat","Topo","DS4321",3,50);	//chiamata al costruttore (situazione iniziale)
		Automobile a=new Automobile();
		Motocicletta m=new Motocicletta();		
		Pilota p=new Pilota();	//chiamo il costruttore "predefinito" => tutti gli attributi vengono impostati ad un valore predefinito (stringhe="", interi=0, ..)

		
		v.setVelocitàMassima(40);   //modifico un attributo di un oggetto già esistente
		
		System.out.println("Veicolo");
		System.out.println("Marca: "+v.getMarca());
		System.out.println("Modello: "+v.getModello());
	
		
		
		a.setMarca("Ford");		//ereditato da Veicolo 
		a.setModello("Focus");	//ereditato da Veicolo 
		a.setCapienzaBagagliaio(500);	//proprio di Automobile
		System.out.println("Automobile");
		System.out.println("Marca: "+a.getMarca());
		System.out.println("Modello: "+a.getModello());
		System.out.println("Capienza bagagliaio: "+a.getCapienzaBagagliaio());
		

	}

}
