/**
 *
 *  @author Piotr Wrona
 *
 */

import java.util.ArrayList;

public class WybranyKwiat {

	 String rodzajKwiata;
	 double liczbaSztuk;
	 double cenaLacznaZaWybranyKwiat;
	
	
	
	public WybranyKwiat(String rodzajKwiata, double liczbaSztuk, double cenaLacznaZaWybranyKwiat) {
		this.rodzajKwiata = rodzajKwiata;
		this.liczbaSztuk = liczbaSztuk;
		this.cenaLacznaZaWybranyKwiat = cenaLacznaZaWybranyKwiat;
		dodajDoKoszyka(this);
	}
	
	
	public static ArrayList<WybranyKwiat> listaKwiatow = new ArrayList<WybranyKwiat>();
	public void dodajDoKoszyka(WybranyKwiat wybranyKwiat) {	
		System.out.println("dodano do koszyka \t" + rodzajKwiata + " sztuk:" + liczbaSztuk + " o lacznej cenie " + cenaLacznaZaWybranyKwiat + "zl");
		listaKwiatow.add(wybranyKwiat);		
	}


}
