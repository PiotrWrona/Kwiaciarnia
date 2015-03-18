/**
 *
 *  @author Piotr Wrona
 *
 */

public class Kwiaciarnia {

	public Kwiaciarnia() {
	    
		
		// Dodanie asortymentu do sklepu
		Kwiat tulipan = new Tulipan("tulipan", "zolty");
		Kwiat roza = new Roza("roza", "czerwona");
		Kwiat slonecznik = new Roza("slonecznik", "zolty");
		//Kwiat fiolek = new Fiolek("fiolek", "fioletowy");  <==== latwe dodanie fiolka do oferty kwiaciarni
		
		
		// Dodanie cennika sklepu
	    Cennik cenyKwiatow = Cennik.getInstance();
	    cenyKwiatow.setCena("tulipan", 2);
	    cenyKwiatow.setCena("roza", 3);
	    cenyKwiatow.setCena("slonecznik", 5);
	    //cenyKwiatow.setCena("fiolek", 4);   <==== latwe dodanie fiolka do oferty kwiaciarni
	
	    
	    
	}
	


}
