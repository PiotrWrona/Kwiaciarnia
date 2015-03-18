import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 
 * @author Piotr Wrona
 *
 */
public class WidokGUI extends JFrame implements ActionListener{


	
	JPanel panel;
	static JButton jButtonDodajDoKoszyka, jButtonZamow, jButtonWyliczWartosc;
    JLabel jLabelKwiat, jLabelCenaZaSztuke, jLabelLiczbaSztuk, jLabelKoszykZakupow, jLabelWyliczWartosc, JLabelSaldo, JLabelCenaLacznaZakupow;
      
    static JTextField jTextWybranyKwiat, jTextCenaZaSztuke, jTextLiczbaSztuk, jTextCenaZaCalosc, JTextNazwaKlienta, JTextSaldo, jTextCenaLacznaZakupow;
    JMenuBar pasekMenu;
    JMenu program;
    static JMenuItem oProgramie, autor, wyjscie;
    
    static ImageIcon imgRoza = new ImageIcon(".\\source\\roza.jpg");
	static JButton jButtonRoza = new JButton(imgRoza);
	static ImageIcon imgFiolek = new ImageIcon(".\\source\\fiolek.jpg");
	static JButton jButtonFiolek = new JButton(imgFiolek);
	static ImageIcon imgSlonecznik = new ImageIcon(".\\source\\slonecznik.jpg");
	static JButton jButtonSlonecznik = new JButton(imgSlonecznik);
	static ImageIcon imgTulipan = new ImageIcon(".\\source\\tulipan.jpg");
	static JButton jButtonTulipan = new JButton(imgTulipan);
    
    
	
	public WidokGUI() {
        
		super("Kwiaciarnia");		
		setSize(800,600);
		setLocation(100,10);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		oknoGlowne();  
    }
	
	
	
	public void oknoGlowne() {

			
		panel = new JPanel(null);
		panel.setBackground(Color.DARK_GRAY);
		
		
		pasekMenu = new JMenuBar();
		program = new JMenu ("Program");
		oProgramie = new JMenuItem("O programie..");
		oProgramie.addActionListener(this);
		autor = new JMenuItem("Autor");
		autor.addActionListener(this);	
		wyjscie = new JMenuItem("Wyjscie");
		wyjscie.addActionListener(this);
		program.add(oProgramie);
		program.add(autor);
		program.addSeparator();
		program.add(wyjscie);
		pasekMenu.add(program);	
		setJMenuBar(pasekMenu);
		

		jButtonTulipan.setBounds(20,20,70,70);
		panel.add(jButtonTulipan);
		jButtonTulipan.addActionListener(this);
		jButtonRoza.setBounds(120,20,70,70);
		panel.add(jButtonRoza);
		jButtonRoza.addActionListener(this);
		jButtonSlonecznik.setBounds(20,120,70,70);
		panel.add(jButtonSlonecznik);
		jButtonSlonecznik.addActionListener(this);
		jButtonFiolek.setBounds(120,120,70,70);
		panel.add(jButtonFiolek);
		jButtonFiolek.addActionListener(this);
		
		
		jLabelKwiat = new JLabel("Wybrany kwiat");
		jLabelKwiat.setForeground(Color.WHITE);
		jLabelKwiat.setBounds(250,20,200,20);
		panel.add(jLabelKwiat);
		jTextWybranyKwiat = new JTextField(999);
		jTextWybranyKwiat.setBounds(250,40,200,20);
		jTextWybranyKwiat.setEditable(false);
		panel.add(jTextWybranyKwiat);
		
		jLabelCenaZaSztuke = new JLabel("Cena za sztuke");
		jLabelCenaZaSztuke.setForeground(Color.WHITE);
		jLabelCenaZaSztuke.setBounds(500,20,100,20);
		panel.add(jLabelCenaZaSztuke);
		jTextCenaZaSztuke = new JTextField();
		jTextCenaZaSztuke.setBounds(500,40,90,20);
		jTextCenaZaSztuke.setEditable(false);
		panel.add(jTextCenaZaSztuke);	
		
		jLabelLiczbaSztuk = new JLabel("Zamow sztuk");
		jLabelLiczbaSztuk.setForeground(Color.WHITE);
		jLabelLiczbaSztuk.setBounds(250,100,80,20);
		panel.add(jLabelLiczbaSztuk);
		jTextLiczbaSztuk = new JTextField();
		jTextLiczbaSztuk.setBounds(250,120,80,20);
		panel.add(jTextLiczbaSztuk);
		
		jLabelWyliczWartosc = new JLabel("Oblicz..");
		jLabelWyliczWartosc.setForeground(Color.WHITE);
		jLabelWyliczWartosc.setBounds(400,100,190,20);
		panel.add(jLabelWyliczWartosc);
		jButtonWyliczWartosc = new JButton("laczna wartosc");
		jButtonWyliczWartosc.addActionListener(this);
		jButtonWyliczWartosc.setBounds(400,120,190,20);
		panel.add(jButtonWyliczWartosc);
		jTextCenaZaCalosc = new JTextField();
		jTextCenaZaCalosc.setBounds(400,150,190,20);
		jTextCenaZaCalosc.setEditable(false);
		panel.add(jTextCenaZaCalosc);	
		
			
		jButtonDodajDoKoszyka = new JButton("Dodaj");
		jButtonDodajDoKoszyka.addActionListener(this);
		jButtonDodajDoKoszyka.setBounds(660,150,100,20);
		jButtonDodajDoKoszyka.setBackground(Color.GREEN);
		panel.add(jButtonDodajDoKoszyka);
		
		jButtonZamow = new JButton("Zamow i zapakuj");
		jButtonZamow.setBounds(20,470,200,50);
		jButtonZamow.setBackground(Color.GREEN);
		jButtonZamow.addActionListener(this);
		panel.add(jButtonZamow);
		
        JLabelCenaLacznaZakupow = new JLabel("Laczna kwota zakupow:");
        JLabelCenaLacznaZakupow.setForeground(Color.WHITE);
        JLabelCenaLacznaZakupow.setBounds(560,470,200,20);
		panel.add(JLabelCenaLacznaZakupow);	
        jTextCenaLacznaZakupow = new JTextField("0");
        jTextCenaLacznaZakupow.setBounds(560,500,200,20);
        jTextCenaLacznaZakupow.setEditable(false);
		panel.add(jTextCenaLacznaZakupow);	
        
		
		
		JTextNazwaKlienta = new JTextField(WidokGUIpowitanie.jTextNazwaKlienta.getText());
		JTextNazwaKlienta.setBounds(300,470,200,20);
		JTextNazwaKlienta.setEditable(false);
		panel.add(JTextNazwaKlienta);	
		JLabelSaldo = new JLabel("Saldo");
		JLabelSaldo.setForeground(Color.WHITE);
		JLabelSaldo.setBounds(300,500,40,20);
		panel.add(JLabelSaldo);
		JTextSaldo = new JTextField(WidokGUIpowitanie.jTextPortfelKlienta.getText());
		JTextSaldo.setBounds(350,500,150,20);
		JTextSaldo.setEditable(false);
		panel.add(JTextSaldo);

		
		jLabelKoszykZakupow = new JLabel("Koszyk zakupow:");
		jLabelKoszykZakupow.setForeground(Color.WHITE);
		jLabelKoszykZakupow.setBounds(20,240,200,20);
		panel.add(jLabelKoszykZakupow);
		utworzTablice();
		  

		
        add(panel);
        setResizable(false);
        setVisible(true);
        
	}


	

	
	public void utworzTablice() {

		Object dane[][] = null;
		String[] nazwyKolumn = {"Nazwa kwiata", "Cena za sztuke", "Liczba sztuk", "Cena laczna"};		
		JTable tabelaMiejsc = new JTable(new DefaultTableModel(dane, nazwyKolumn));
		DefaultTableModel model = (DefaultTableModel) tabelaMiejsc.getModel();
		
		for(WybranyKwiat wybranyKwiat : WybranyKwiat.listaKwiatow) {
			model.addRow(new Object[]{wybranyKwiat.rodzajKwiata, wybranyKwiat.liczbaSztuk, (wybranyKwiat.cenaLacznaZaWybranyKwiat/wybranyKwiat.liczbaSztuk) ,wybranyKwiat.cenaLacznaZaWybranyKwiat});
			System.out.println("=> " + wybranyKwiat.rodzajKwiata + "\t sztuk: " + wybranyKwiat.liczbaSztuk + "\t laczna cena: " + wybranyKwiat.cenaLacznaZaWybranyKwiat + "zl");
		}

		JScrollPane scrollPane = new JScrollPane(tabelaMiejsc);
		scrollPane.setBounds(20,260,740,200);
		add(scrollPane);			
	}
	
	
	
	
	
	public static void main(String[] args) {	
		new WidokGUI();
	}


	public static boolean utworzTablice;
	public void actionPerformed(ActionEvent e) {
		utworzTablice = false;
		KontrolerGUI.kontrolerGUI(e);
		if(utworzTablice==true){
			utworzTablice();
		}
	}

	

}
