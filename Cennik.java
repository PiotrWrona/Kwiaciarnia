/**
 *
 *  @author Piotr Wrona
 *
 */

import java.util.HashMap;
import java.util.Map;

public class Cennik {

	
	static Map<String,Double> cennik = new HashMap<String,Double> ();
	
	private static Cennik instance = null;
    private Cennik() { }
    public static synchronized Cennik getInstance() { // wzorzec singleton
        if (instance == null) {
            instance = new Cennik();
        }
        return instance;
    }

	
	public static double getCena(String rodzajKwiata) {
		if (Cennik.cennik.get(rodzajKwiata)!=null){
			System.out.println(rodzajKwiata + " kosztuje " + cennik.get(rodzajKwiata));	
			return cennik.get(rodzajKwiata);
		}
		else {
			System.out.println(rodzajKwiata + " nie znajduje sie w cenniku");
			return 0;
		}
	}
	
	
	public void setCena(String rodzajKwiata, double cena) { 
		cennik.put(rodzajKwiata, cena);
	}
	

	

}
