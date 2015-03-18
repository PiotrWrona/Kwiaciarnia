/**
 *
 *  @author Piotr Wrona
 *
 */

public abstract class UrzadKontroli {

	public String nazwaUrzedu;
	
	
	public UrzadKontroli(String nazwaUrzedu) {
        super();
		this.nazwaUrzedu = nazwaUrzedu;
    }
		
	public String toString(){
		return nazwaUrzedu;
	}
	

}
