/**
 *
 *  @author Piotr Wrona
 *
 */

public abstract class Kwiat {	
	
	public String rodzajKwiata;
	public String kolor;

	
	public Kwiat(String rodzaj, String kolor) {
        super();
        this.rodzajKwiata = rodzajKwiata;
        this.kolor = kolor;
    }
		
	public String toString(){
		return rodzajKwiata + " " + kolor;
	}
	
	
}
