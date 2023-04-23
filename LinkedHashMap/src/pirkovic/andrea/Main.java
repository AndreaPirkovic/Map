package pirkovic.andrea;
import java.util.*;
public class Main {
	
	/*LinkedHashMap je isto kao HashMap sa dodatnom funkcijom održavanja 
	 redosleda elemenata umetnutih u njega. 
	 LinkedHashMap obezbeđuje da se elementima može pristupiti u njihovom
	  redosledu umetanja  */
	
	
	// Implementacija LinkedHashmap klase
	 
	  public static void main(String[] args)
	    {
	 
	        // Kreiranje prazne LinkedHashMap
	        Map<String, Integer> mapa = new LinkedHashMap<>();
	 
	        //Unos parova kljuc/vredost u LinkedHashMap pomocu put() metoda
	        mapa.put("Ana", 101);
	        mapa.put("Pera", 303);
	        mapa.put("Zika", 202);
	 
	        //Prolazak kroz mapu
	        for (Map.Entry<String, Integer> e : mapa.entrySet())
	 
	            //Stampa
	            System.out.println(e.getKey() + " "
	                               + e.getValue());
	        //Zamena vrednosti po kljucu
	        mapa.replace("Ana", 101, 505);
	        
	        //Stampa vrednosti
	        System.out.println(mapa.values());
	        //Stampa kljuceve
	        System.out.println(mapa.keySet());
	        
	        //Vraca skup mapiranih parova kljuc-vrednost
	        System.out.println(mapa.entrySet());
	        
	        //remove(key)uklanja ključ i njemu pridruženu vrednost 
	        mapa.remove("Pera");
	        // stampa mape posle uklanjanja
	        System.out.println(mapa.entrySet());
	    }
	}

