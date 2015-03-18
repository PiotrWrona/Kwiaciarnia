/**
 *
 *  @author Piotr Wrona
 *
 */

public class FabrykaKontener { // wzorzec factory
	
	
	public static Kontener utworzKontener(double pozostalychDoZapakowania, double pojemnoscKontenera){
		Kontener kontener = null;
				
		if (pozostalychDoZapakowania > pojemnoscKontenera){
			kontener = new Kontener();
			System.out.println("...utworzono kontener");
		}
		return kontener;		
	}
	

}
