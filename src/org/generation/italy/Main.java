package org.generation.italy;

import java.util.ArrayList;

import org.generation.italy.model.Automobile;
import org.generation.italy.model.Motocicletta;
import org.generation.italy.model.SUV;
import org.generation.italy.model.Veicolo;

/**
 * classe principale
 */
public class Main {

	/**
	 * @param args 
	 * 		parametri riga di comando
	 */
	public static void main(String[] args) {
		//Object<-Veicolo<-Automobile<-SUV
		//Object<-Veicolo<-Motocicletta
		
		ArrayList<Veicolo> elencoVeicoli=new ArrayList<Veicolo>();
		
		
		
		Veicolo v=new Veicolo("Fiat","Topo","DS4321",3,50);	//chiamata al costruttore (situazione iniziale)
		Automobile a=new Automobile("Ford","Focus","EF42433",200,500);
		Motocicletta m=new Motocicletta("Honda", "CRX", "FE3232",220);					
		
		Veicolo v1;		//dichiaro un veicolo
		v1= new Automobile("Opel", "Vectra", "AB43234", 190, 200);	//assegno al veicolo un'automobile
		
		((Automobile) v1).azionaTurbo();   //per poter chiamare un metodo della sottoclasse bisogna "convertire il veicolo in automobile" (Casting)
		
		System.out.println("L'automobile è: "+ v1.toString());
		
		
		elencoVeicoli.add(v);		//aggiungo un veicolo
		elencoVeicoli.add(a);		//aggiungo un'automobile
		elencoVeicoli.add(m);		//aggiungo una motocicletta
		elencoVeicoli.add(v1);		//aggiungo un'automobile
		elencoVeicoli.add(new SUV("BMW","X6","FR43223",220,600));   //aggiungo un SUV
		elencoVeicoli.add(new Veicolo()); //aggiungo un veicolo chiamando il costruttore senza parametri
		elencoVeicoli.add(new Veicolo("Ford","Castoro","TR4321",7,50)); //aggiungo un veicolo chiamando il costruttore con parametri
		
		
		System.out.println("ELENCO VEICOLI");
		for(Veicolo veicolo:elencoVeicoli)	//scorro tutti i veicoli dell'elenco
		{
			//la variabile "veicolo" di volta in volta assumerà la forma di un'automobile, di una motocicletta, di un SUV, ...  (polimorfismo)
			
			System.out.println(
					"Targa: "+veicolo.getTarga()+
					" Marca: "+veicolo.getMarca()+
					" Modello: "+veicolo.getModello());
		}
			
		
		
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
	
		a.accelera();		//Accelera di 1	(primo metodo)
		a.accelera(10);		//Accelera di 10 (secondo metodo)
		a.accelera("abbastanza");	//accelera di 5 (terzo metodo)
		a.decelera();
				
		System.out.println(a.getVelocità());
	
		
	}

}
