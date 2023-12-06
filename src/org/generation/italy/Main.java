package org.generation.italy;

public class Main {

	public static void main(String[] args) {
		//Object<-Veicolo<-Automobile<-SUV
		//Object<-Veicolo<-Motocicletta
		
		
		Veicolo v=new Veicolo("Fiat","Topo","DS4321",3,50);	//chiamata al costruttore (situazione iniziale)
		Automobile a=new Automobile("Ford","Focus","EF42433",200,500);
		Motocicletta m=new Motocicletta("Honda", "CRX", "FE3232",220);		
		
		
		
		v.setVelocitàMassima(40);   //modifico un attributo di un oggetto già esistente
		
		System.out.println("Veicolo");
		System.out.println("Marca: "+v.getMarca());
		System.out.println("Modello: "+v.getModello());
		System.out.println("Nr ruote: "+v.getNrRuote());
		
	
		System.out.println("\n\nAutomobile");
		System.out.println("Marca: "+a.getMarca());
		System.out.println("Modello: "+a.getModello());
		System.out.println("Capienza bagagliaio: "+a.getCapienzaBagagliaio());
		System.out.println("Nr ruote: "+a.getNrRuote());
		
		
		System.out.println("\n\nMotocicletta");
		System.out.println("Marca: "+m.getMarca());
		System.out.println("Modello: "+m.getModello());		
		System.out.println("Nr ruote: "+m.getNrRuote());
		

	}

}
