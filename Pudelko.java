/**
 *
 *  @author Piotr Wrona
 *
 */

import java.util.ArrayList;

public class Pudelko {

	
	static double lacznaLiczbaKwiatow = 0;
	static double pozostalychDoZapakowania = 0;	
	int szerokoscPudelka, glebokoscPudelka;
	static double wielkoscPudelka = 0;
	
	public Pudelko(int szerokoscPudelka, int glebokoscPudelka) {
		this.szerokoscPudelka = szerokoscPudelka;
		this.glebokoscPudelka = glebokoscPudelka;
		dodajPudelko(this);
	}


	public static void policzKwiaty(){
	
		for(WybranyKwiat wybranyKwiat : WybranyKwiat.listaKwiatow) {
			System.out.println("dodaje: " + wybranyKwiat.liczbaSztuk);
			lacznaLiczbaKwiatow = lacznaLiczbaKwiatow + wybranyKwiat.liczbaSztuk;
		}
		System.out.println("laczna liczba kwiatow do zapakowania: " + lacznaLiczbaKwiatow + "\n");
		zapakujKwiatyDoPudelek(lacznaLiczbaKwiatow);
	}
	
	
	public static void zapakujKwiatyDoPudelek(double lacznaLiczbaKwiatow){
		pozostalychDoZapakowania = lacznaLiczbaKwiatow;
		System.out.println("..do pakowania pozostalo " + pozostalychDoZapakowania);

		while (pozostalychDoZapakowania>0){
			FabrykaPudelek.utworzPudelko(pozostalychDoZapakowania);
			if (pozostalychDoZapakowania>=wielkoscPudelka){
				System.out.println("1 ** ** **  zapakowano " + wielkoscPudelka + "   zostlo " + (pozostalychDoZapakowania - wielkoscPudelka));
				pozostalychDoZapakowania = pozostalychDoZapakowania - wielkoscPudelka;
			}
			else{
				System.out.println("2 ** ** **  zapakowano " + pozostalychDoZapakowania + "   zostlo " + (pozostalychDoZapakowania - pozostalychDoZapakowania));
				pozostalychDoZapakowania = 0;
			}
		}	
		Kontener.policzPudelka();
		
	}
	
	
	public static ArrayList<Pudelko> listaPudelek = new ArrayList<Pudelko>();
	public double dodajPudelko(Pudelko pudelko) {	
		System.out.println("dodano " + pudelko);
		listaPudelek.add(pudelko);
		return (wielkoscPudelka = szerokoscPudelka * glebokoscPudelka);
	}
	
	
	public String toString(){
		return ("pudelko " + szerokoscPudelka + "x" + glebokoscPudelka);
	}
	
	
	public void accept(VisitorKontrola v) {
	    v.kontroluje(this);
	}	
	public static void kontrolaRozpoczeta(UrzadKontroli urzad){	
		VisitorKontrola v = new Kontrola();
		for(Pudelko p : listaPudelek){
			p.accept(v);
			System.out.println("\t kontroli dokonal urzad " + urzad);
		}
	}
	
	
}
