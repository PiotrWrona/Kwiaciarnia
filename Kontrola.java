/**
 *
 *  @author Piotr Wrona
 *
 */

public class Kontrola implements VisitorKontrola{ // wzorzec Visitor


	public void kontroluje(Pudelko p) {
	    System.out.print("..kontrola pudelka " + p);	    
	}

	public void kontroluje(Kontener p) {
	    System.out.print("..kontrola kontenera " + p);			
	} 

}
