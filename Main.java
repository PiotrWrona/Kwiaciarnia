/**
 *
 *  @author Piotr Wrona
 *
 */


public class Main {

	
	
  public static void main(String[] args) {
	  
	  System.out.println("test Main zad41 \n");
	   
	  // Tworze kwiaciarnie
	  Kwiaciarnia kwiaciarnia = new Kwiaciarnia();
	  
	  
	  // Testuje ceny kwiatow
	  Cennik.getCena("tulipan");
	  Cennik.getCena("roza");
	  Cennik.getCena("slonecznik");
	  Cennik.getCena("fiolek");
	  System.out.println("");

	  
	  // Tworze Urzedy
	  UrzadKontroli urzadGUOK = new GUOK("Glowny Urzad Ochrony Kwiatow");
	  UrzadKontroli urzadSSPKUS = new SSPKUS("Sekcja Sciagania Podatkow od Kwiatow Urzedu Skarbowego");
	  
	  
	  // Wlaczam GUI
	  WidokGUIpowitanie.main(null);
 
	  
	  /* ------------------------------------ TEST BEZ GUI --------------------------------------------------
	  // Tworze klienta
	  Klient k1 = new Klient("Jarzabek Waclaw", 1000, false);
	  System.out.println(k1.nazwaKlienta + " posiada " + k1.wPortfelu + "zl");
	  System.out.println(k1 + "\n");
	    
	  // Tworze liste zakupow
	  k1.wybiera("roza", 12);
	  k1.wybiera("tulipan", 24);
	  k1.wybiera("fiolek", 2);
	  k1.wybiera("slonecznik", 100);
	  k1.wybiera("tulipan", 50);
	  k1.wybiera("roza", 3);
	  System.out.println("");
	  
	  // Wypisuje koszyk
	  k1.wypiszkoszyk();
	  System.out.println("");
	  
	  // Dokonuje platnosci i pakuj kwiaty do pudelek
	  k1.placZaZakupy();
	  System.out.println("");
	  */// ---------------------------------- TEST BEZ GUI --------------------------------------------------

  
	  // Konrola Urzedow
	  Pudelko.kontrolaRozpoczeta(urzadGUOK);
	  Pudelko.kontrolaRozpoczeta(urzadSSPKUS);
	  Kontener.kontrolaRozpoczeta(urzadGUOK);
	  Kontener.kontrolaRozpoczeta(urzadSSPKUS);
	  System.out.println("");	  
  }
  
}

