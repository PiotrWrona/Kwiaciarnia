/**
 *
 *  @author Piotr Wrona
 *
 */

import java.awt.Color;
import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.net.URI;

import javax.swing.JOptionPane;

public class KontrolerGUI {

	
	static Klient klientGUI = null;
	
	public static void kontrolerGUI(ActionEvent e){
		Object zdarzenie = e.getSource();
		
		
		
		if(zdarzenie==WidokGUIpowitanie.jButtonUtworzKlienta){
			if ( WidokGUIpowitanie.jTextNazwaKlienta.getText().equals("") || WidokGUIpowitanie.jTextPortfelKlienta.getText().equals("") ){
				JOptionPane.showMessageDialog(null, "Prosze wypelnic wszystkie pola", "Blad!", JOptionPane.ERROR_MESSAGE);
			}
			else{
				boolean czyFirma;
				if (WidokGUIpowitanie.jTextPortfelKlienta.getText().equals(WidokGUIpowitanie.JComboBox1)){
					czyFirma = false;
				}
				else{
					czyFirma = true;
				}
				klientGUI = new Klient(WidokGUIpowitanie.jTextNazwaKlienta.getText(),  Double.parseDouble(WidokGUIpowitanie.jTextPortfelKlienta.getText()), czyFirma);	
				System.out.println("..tworze klienta");	
				System.out.println(klientGUI + "\n");
				WidokGUI.main(null);
			}		
		}
		
		
		
		if(zdarzenie==WidokGUI.jButtonRoza){
			System.out.println("..kliknieto roze");
			WidokGUI.jTextCenaZaCalosc.setText("");
			WidokGUI.jTextLiczbaSztuk.setText("");
			WidokGUI.jTextWybranyKwiat.setText("Czerwona roza");
			WidokGUI.jTextCenaZaSztuke.setText(Double.toString(Cennik.getCena("roza")));
			if (Cennik.getCena("roza")==0){
				WidokGUI.jTextCenaZaSztuke.setForeground(Color.RED);
			}	
			else{
				WidokGUI.jTextCenaZaSztuke.setForeground(Color.black);
			}
		}
		if(zdarzenie==WidokGUI.jButtonTulipan){
			System.out.println("..kliknieto tulipan");
			WidokGUI.jTextCenaZaCalosc.setText("");
			WidokGUI.jTextLiczbaSztuk.setText("");
			WidokGUI.jTextWybranyKwiat.setText("Zolty tulipan");
			WidokGUI.jTextCenaZaSztuke.setText(Double.toString(Cennik.getCena("tulipan")));
			if (Cennik.getCena("tulipan")==0){
				WidokGUI.jTextCenaZaSztuke.setForeground(Color.RED);
			}	
			else{
				WidokGUI.jTextCenaZaSztuke.setForeground(Color.black);
			}
		}
		if(zdarzenie==WidokGUI.jButtonSlonecznik){
			System.out.println("..kliknieto slonecznik");
			WidokGUI.jTextCenaZaCalosc.setText("");
			WidokGUI.jTextLiczbaSztuk.setText("");
			WidokGUI.jTextWybranyKwiat.setText("Zolty slonecznik");
			WidokGUI.jTextCenaZaSztuke.setText(Double.toString(Cennik.getCena("slonecznik")));
			if (Cennik.getCena("slonecznik")==0){
				WidokGUI.jTextCenaZaSztuke.setForeground(Color.RED);
			}
			else{
				WidokGUI.jTextCenaZaSztuke.setForeground(Color.black);
			}
		}
		if(zdarzenie==WidokGUI.jButtonFiolek){
			System.out.println("..kliknieto slonecznik");
			WidokGUI.jTextCenaZaCalosc.setText("");
			WidokGUI.jTextLiczbaSztuk.setText("");
			WidokGUI.jTextWybranyKwiat.setText("Fioletowy fiolek");
			WidokGUI.jTextCenaZaSztuke.setText(Double.toString(Cennik.getCena("fiolek")));
			if (Cennik.getCena("fiolek")==0){
				WidokGUI.jTextCenaZaSztuke.setForeground(Color.RED);
			}
			else{
				WidokGUI.jTextCenaZaSztuke.setForeground(Color.black);
			}
		}
		
		
		
		if(zdarzenie==WidokGUI.jButtonWyliczWartosc){
			if(!WidokGUI.jTextWybranyKwiat.getText().equals("") && !WidokGUI.jTextLiczbaSztuk.getText().equals("")){
				if ( Double.parseDouble(WidokGUI.jTextCenaZaSztuke.getText())==0 ){
					JOptionPane.showMessageDialog(null, "Kwiat jest w tej chwili niedostepny", "Blad!", JOptionPane.ERROR_MESSAGE);
				}
				else{
					double cenaLaczna = Double.parseDouble(WidokGUI.jTextCenaZaSztuke.getText()) * Double.parseDouble(WidokGUI.jTextLiczbaSztuk.getText());
					WidokGUI.jTextCenaZaCalosc.setText(Double.toString(cenaLaczna));
					System.out.println("..wyliczam laczna wartosc dla danego kwiata.. = " + cenaLaczna);
				}
			}
			else{
				WidokGUI.jTextCenaZaCalosc.setText("0");
			}
		}

		
		
		if(zdarzenie==WidokGUI.jButtonDodajDoKoszyka){
			if ( WidokGUI.jTextWybranyKwiat.getText().equals("") || WidokGUI.jTextLiczbaSztuk.getText().equals("") ){
				JOptionPane.showMessageDialog(null, "Prosze wypelnic wszystkie pola", "Blad!", JOptionPane.ERROR_MESSAGE);
			}
			else{
				if ( Double.parseDouble(WidokGUI.jTextCenaZaSztuke.getText())==0 ){
					JOptionPane.showMessageDialog(null, "Kwiat jest w tej chwili niedostepny", "Blad!", JOptionPane.ERROR_MESSAGE);
				}
				else{
					double cenaDodanychKwiatow = Double.parseDouble(WidokGUI.jTextCenaZaSztuke.getText()) * Double.parseDouble(WidokGUI.jTextLiczbaSztuk.getText());
					double noweSaldo = Double.parseDouble(WidokGUI.JTextSaldo.getText()) - cenaDodanychKwiatow;	
					if(noweSaldo>=0){
						WybranyKwiat wybranyKwiat = new WybranyKwiat(WidokGUI.jTextWybranyKwiat.getText(), Double.parseDouble(WidokGUI.jTextLiczbaSztuk.getText()), cenaDodanychKwiatow);					
						WidokGUI.utworzTablice=true;
						System.out.println("..dodaje do koszyka");	
						
						WidokGUI.JTextSaldo.setText(Double.toString(noweSaldo));
						double nowaCenaLaczna = Double.parseDouble(WidokGUI.jTextCenaLacznaZakupow.getText()) + cenaDodanychKwiatow;
						WidokGUI.jTextCenaLacznaZakupow.setText(Double.toString(nowaCenaLaczna));
						WidokGUI.jTextWybranyKwiat.setText("");
						WidokGUI.jTextCenaZaSztuke.setText("");
						WidokGUI.jTextLiczbaSztuk.setText("");
						WidokGUI.jTextCenaZaCalosc.setText("");
					}
					else{
						JOptionPane.showMessageDialog(null, "Przekroczono saldo", "Blad!", JOptionPane.ERROR_MESSAGE);
					}
				}
			}	
		}
	
		
		
		if(zdarzenie==WidokGUI.jButtonZamow){		
			System.out.println("..zamawiam i pakuje");
			klientGUI.placZaZakupy();	
			JOptionPane.showMessageDialog(null, "Zakupy zostaly pomyslnie zrealizowane \n ", "Potwierdzenie", JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
		}
		
		
		
		if(zdarzenie==WidokGUI.oProgramie){
			System.out.println("o programie..");
			int odpowiedz = JOptionPane.showConfirmDialog(null, "Czy chcesz otworzyc plik OpisAplikacji.html?","Pytanie", JOptionPane.YES_NO_OPTION);
			if(odpowiedz == JOptionPane.YES_OPTION) {		
				System.out.println("..otwieram przegladarke z plikiem OpisAplikacji.html");	
				try {
					String url = "http://www.staroczaszkowo.pl/Txt/KwiaciarniaOpisAplikacji.html";
			        java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
				} catch (IOException e1) {
					JOptionPane.showMessageDialog(null, "Brak pliku..", "Blad!", JOptionPane.ERROR_MESSAGE);
					e1.printStackTrace();
				}
			}
			
		}
		
		
		
		if(zdarzenie==WidokGUI.autor){
			System.out.println("autor..");
			JOptionPane.showMessageDialog(null, "\nGUI symulacja zakupow w kwiaciarni \n\nPiotr Wrona \n ", "Autor", JOptionPane.INFORMATION_MESSAGE);
		}
		
		
		
		if(zdarzenie==WidokGUI.wyjscie){
			int odpowiedz = JOptionPane.showConfirmDialog(null, "Czy na pewno chcesz zakonczyc program?","Pytanie", JOptionPane.YES_NO_OPTION);
			if(odpowiedz == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
		}
	
		
		
	}
	
	

}
