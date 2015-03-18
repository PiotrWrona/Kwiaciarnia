/**
 *
 *  @author Piotr Wrona
 *
 */

public class FabrykaPudelek { // wzorzec factory

	
	public static Pudelko utworzPudelko(double pozostalychDoZapakowania){
		Pudelko pudelko = null;
		
		if (pozostalychDoZapakowania > 250){
			pudelko = new Pudelko(50,50);
			System.out.println("...utworzono duze pudelko (50x50)");
		}
		else if (pozostalychDoZapakowania > 100){
			pudelko = new Pudelko(10,10);
			System.out.println("...utworzono srednie pudelko (10x10)");
		}
		else if (pozostalychDoZapakowania <= 100){
			pudelko = new Pudelko(5,5);
			System.out.println("...utworzono male pudelko (5x5)");
		}	
		return pudelko;		
	}
	

}
