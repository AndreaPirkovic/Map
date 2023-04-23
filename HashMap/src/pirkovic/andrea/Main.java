package pirkovic.andrea;

import java.util.HashMap;
import java.util.Map;

public class Main {
/*Interfejs Mape je prisutan u paketu java.util i 
predstavlja mapiranje između ključa i vrednosti. 
Mapa sadrži jedinstvene ključeve.Koriste se za mapiranje
 asocijacija ključ-vrednost, za traženje po ključevima ili 
 kada neko želi da preuzme i ažurira elemente po ključevima*/
	
	//Upotreba Map interface-a
	 
	  public static void main(String args[])
	    {
	        // Stvaranje prazne HashMap
	       Map<String, Integer> hm= new HashMap<String, Integer>();
	 
	        //Unosenje parova pomocu metode put() ,npr ime studenta kao kljuc i br indeksa kao vrednost
	        hm.put("Ana", 101);
	        hm.put("Pera", 220);
	        hm.put("Mika", 359);
	        hm.put("Zika", 421);
	 
	        //Prolazak kroz Mapu pomocu for petlje
	        for (Map.Entry<String, Integer> mapa :hm.entrySet()) {//entrySet()metoda vraca skup svih parova ključ-vrednost u mapi
	 
	            System.out.print(mapa.getKey() + ":"); //stampa kljuceva
	            System.out.println(mapa.getValue());//stampa vrednosti
	        }
	    
	        if (hm.containsKey("Ana"))//containsKey(key): Vraca true ako mapa sadrži ključ, inače false.
	        {
	        	Integer a = hm.get("Ana");//get(key)Vraca vrednost koja je sacuvana za dati ključ.
	        	System.out.println(" Vrednost za kljuc 'Ana' je: " + a);
	    }
	        
	        
	        //  Vraca true ako je mapa prazna, inace false.
	        System.out.println("Da li je mapa prazna? "+ hm.isEmpty());
	}}

