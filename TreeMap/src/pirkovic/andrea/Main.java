package pirkovic.andrea;
import java.util.Map;
import java.util.TreeMap;

//TreeMapa se sortira u skladu sa 
//prirodnim redosledom njenih ključeva, 
//ili pomoću komparatora koji je obezbeđen u vreme 
//kreiranja mape, u zavisnosti od toga koji konstruktor se korist
// koristi se za sortiranje po kljucu

public class Main {
 
	 Map<String, Integer> map = new TreeMap<>();{
	 
	        //Unos parova kljuc/vredost u TreeMap pomocu put() metoda
		 	map.put("Ana", 101);
	        map.put("Pera", 303);
	        map.put("Zika", 202);
	        
	        //Stampa kljuceva i vrednosti u parovima
	        System.out.println (map.entrySet());
	 
	        //Stampa vrednosti 
	        System.out.println(map.values());
	        //Stampa kljuceve
	        System.out.println(map.keySet());
	        
	        // Zamena vrednosti po kljucu
	        map.replace("Ana", 101, 505);
	        
	        
	        //Vraca skup mapiranih parova kljuc-vrednost posle zamene
	        System.out.println(map.entrySet());
	        
	        //remove(key)uklanja ključ i njemu pridruženu vrednost 
	        map.remove("Pera");
	        // stampa mape posle uklanjanja
	        System.out.println(map.entrySet());
	        
	        //higherKey(key) metoda vraca najmanji ključ veci od zadatog 
	       // System.out.println(map.higherKey("Zika"));
	        
	       // Vraca najveci  kljuc u mapi pomocu metode lastKey();
	        //System.out.println(map.lastKey());
}}
