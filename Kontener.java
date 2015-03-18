/**
 *
 *  @author Piotr Wrona
 *
 */

import java.util.ArrayList;

public class Kontener {

	
	final static double szerokoscKontenera = 100;
	final static double dlugoscKontenera = 500;
	final static double pojemnoscKontenera = szerokoscKontenera * dlugoscKontenera;
	

	public Kontener() {
		dodajKontener(this);
	}
	
	
	public static ArrayList<Kontener> listaKontenerow = new ArrayList<Kontener>();
	public double dodajKontener(Kontener kontener) {	
		listaKontenerow.add(kontener);
		return pojemnoscKontenera;
	}
	
	
	
	
	static double objetoscPudelek = 0;
	static double pozostalaObjetoscPudelek = 0;
	
	public static void policzPudelka(){		
		for(Pudelko pudelko : Pudelko.listaPudelek) {
			objetoscPudelek = objetoscPudelek + (pudelko.szerokoscPudelka * pudelko.glebokoscPudelka);
			System.out.println("objetoscPudelek " + objetoscPudelek + "   szerokoscPudelka x glebokoscPudelka " + (pudelko.szerokoscPudelka * pudelko.glebokoscPudelka));
		}
		System.out.println("Calkowita objetosc pudelek " + objetoscPudelek);
		zapakujKwiatyDoKontenerow(objetoscPudelek);
	}
	


	
	public static void zapakujKwiatyDoKontenerow(double objetoscPudelek){
		pozostalaObjetoscPudelek = objetoscPudelek;
		while (pozostalaObjetoscPudelek>0){
			FabrykaKontener.utworzKontener(pozostalaObjetoscPudelek, pojemnoscKontenera);
			if (pozostalaObjetoscPudelek>=pojemnoscKontenera){
				System.out.println("1 ^^ ^^ ^^  zapakowano " + pojemnoscKontenera + "   zostlo " + (pozostalaObjetoscPudelek - pojemnoscKontenera));
				pozostalaObjetoscPudelek = pozostalaObjetoscPudelek - pojemnoscKontenera;
			}
			else{
				System.out.println("2 ^^ ^^ ^^  zapakowano " + pozostalaObjetoscPudelek + "   zostlo " + (pozostalaObjetoscPudelek - pozostalaObjetoscPudelek));
				pozostalaObjetoscPudelek = 0;
			}
		}
	}
	
	
	public String toString(){
		return ("kontener " + pojemnoscKontenera);
	}
	
	
	public void accept(VisitorKontrola v) {
	    v.kontroluje(this);
	 }	
	public static void kontrolaRozpoczeta(UrzadKontroli urzad){	
		VisitorKontrola v = new Kontrola();
		for(Kontener p : listaKontenerow){
			p.accept(v);
			System.out.println("\t kontroli dokonal urzad " + urzad);
		}	
	}
}
