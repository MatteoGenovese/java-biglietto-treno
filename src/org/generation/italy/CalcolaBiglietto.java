package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {
	
//	TODO:
//
//		Ciao!
//		Esercitazione di oggi: Biglietto del treno
//		Nome repo: java-biglietto-treno
//		Il programma dovrà chiedere all'utente il numero di chilometri che vuole percorrere e l'età del passeggero. 
//		Sulla base di queste informazioni dovrà calcolare il prezzo totale del viaggio, 
//		secondo queste regole:
//		il prezzo del biglietto è definito in base ai km (0.21 € al km)
//		va applicato uno sconto del 20% per i minorenni
//		va applicato uno sconto del 40% per gli over 65
//		Come sempre create un progetto java con lo stesso nome del repo (java-biglietto-treno), 
//		aggiungete un package org.generation.italy e una classe CalcolaBiglietto. 
//		Il programma va implementato nel metodo main della classe CalcolaBiglietto.
//		Per acquisire l'input dell'utente usate la classe Scanner, come visto stamattina a lezione.
//		Buon lavoro!
//
//		-------------------------------------
//
//		BONUS1: i minori di 12 anni viaggiano gratis
//		BONUS2: ogni km costa 1 centesimo piu' del precedente (es: 1km = 0.21E, 2km = 0.43, 3km = 0.66E, ecc)


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in); //istanzia un oggetto lettore di tipo Scanner
		
		float saving = 0.0f;
		float pricePerKm = 0.21f;

		
		System.out.print("numeri di km da percorrere: ");
        int kmToDo = scanner.nextInt(); 
		System.out.print("età: ");
        int customerAge = scanner.nextInt(); 
        
        if(customerAge < 18)
        {
        	saving=0.2f;
        }
        if(customerAge <12)
        {
        	saving=1f;
        }
        if(customerAge > 65)
        {
        	saving=0.4f;
        }
        
        float total= pricePerKm * kmToDo +( (kmToDo-1)*((kmToDo-1)+1f)/2f ) * 0.01f - pricePerKm * saving * kmToDo;
        
        System.out.println("Total: "+total);

	}

}
