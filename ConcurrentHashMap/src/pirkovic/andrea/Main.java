package pirkovic.andrea;
import java.util.concurrent.ConcurrentHashMap;
//ConcurrentHashMap klasa se koristi za MulipleThreading  tj. više niti 
//može da radi u isto vreme sa istom mapom, tj ista mapa radice sa bilo kojim brojem niti za operaciju čitanja 
//a ta opcija  ne postoji u HashMap-u. Istovremeno, 16 operacija ažuriranja mape mogu da se izvrše pomoću niti.
public class Main {
   
	public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> mapa = new ConcurrentHashMap<>();
 
        //Dodavanje elemenata u mapu
        mapa.put("A", 1);
        mapa.put("B", 2);
        mapa.put("C", 3);
        // Stampa velicine mape
        System.out.println("Map size: " + mapa.size());
 
        // Uzimanje vrednosti iz mape
        int valueA = mapa.get("A");
        System.out.println("Vrednost kljuca A: " + valueA);
 
        // Uklanjanje elemenata iz mape
        mapa.remove("B");
        System.out.println("Map size: " + mapa.size());
    }
}