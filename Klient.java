/**
 *
 *  @author Piotr Wrona
 *
 */

public class Klient {

	String nazwaKlienta;
	double wPortfelu;
	boolean czyFirma;
	public static double kosztZakupow = 0;
	
	
	public Klient(String imieNazwisko, double wPortfelu, boolean czyFirma) {
		this.nazwaKlienta = imieNazwisko;
		this.wPortfelu = wPortfelu;
		this.czyFirma = czyFirma;
	}


	
	public void wybiera(String kwiat, int liczbaSztuk) {
		
		double cenaKwiata = Cennik.getCena(kwiat);
		double cenaLacznaZaWybranyKwiat = cenaKwiata*liczbaSztuk;
		
		kosztZakupow = kosztZakupow + cenaLacznaZaWybranyKwiat;
		wPortfelu = wPortfelu - cenaLacznaZaWybranyKwiat;
		
		if (cenaKwiata != 0){
			if (wPortfelu < 0){
				System.out.println(":: Fundusze klienta zostaly przekroczone. Do koszyka nie zostanie dodany " + kwiat.toUpperCase());
				wPortfelu = wPortfelu + cenaLacznaZaWybranyKwiat;
				kosztZakupow = kosztZakupow - cenaLacznaZaWybranyKwiat;
			}
			else {
				WybranyKwiat wybranyKwiat = new WybranyKwiat(kwiat, liczbaSztuk, cenaLacznaZaWybranyKwiat);
			}
		}
		else {
			System.out.println(":: Przykro nam, ale kwiata " + kwiat.toUpperCase() + " nie mamy obecnie w ofercie");
		}	
	}



	public void wypiszkoszyk() {
		for(WybranyKwiat wybranyKwiat : WybranyKwiat.listaKwiatow) {
			System.out.println(wybranyKwiat.rodzajKwiata + "\t sztuk: " + wybranyKwiat.liczbaSztuk + "\t laczna cena: " + wybranyKwiat.cenaLacznaZaWybranyKwiat + "zl");
		}			
		System.out.println("Cena laczna zakupow w koszyku \t" + kosztZakupow + "zl");
		System.out.println(nazwaKlienta + " posiada w portfelu jeszcze " + wPortfelu + "zl");		
	}



	public void placZaZakupy() {
		Pudelko.policzKwiaty();
	}


	public String toString(){
		return nazwaKlienta + " " + wPortfelu;
	}


	
}
