

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class WidokGUIpowitanie extends JFrame implements ActionListener{

	
	protected static String JComboBox1 = "Osoba prywatna";
	protected static String JComboBox2 = "Firma";
	
	public static JButton jButtonUtworzKlienta;
	public JComboBox jComboRodzajKlienta;
	public JLabel jLabelRodzajKlienta, jLabelNazwaKlienta, jLabelPortfelKlienta;
	public static JTextField jTextNazwaKlienta, jTextPortfelKlienta;
	
	
	public WidokGUIpowitanie(){
		
		setSize(500,280);
		setLocation(200, 100);
		setResizable(false);
		setTitle("Utworz klienta");
		setLayout(null);
		
		
		jLabelRodzajKlienta = new JLabel("Rodzaj dzialalnosci");
		//jLabelRodzajKlienta.setForeground(Color.WHITE);
		jLabelRodzajKlienta.setBounds(20,40,150,20);
		add(jLabelRodzajKlienta);
		
		jComboRodzajKlienta = new JComboBox(new String[] {JComboBox1, JComboBox2});
		jComboRodzajKlienta.setBounds(200,40,150,20);
		add(jComboRodzajKlienta);
		
		
		jLabelNazwaKlienta = new JLabel("Nazwa klienta");
		jLabelNazwaKlienta.setBounds(20,80,150,20);
		add(jLabelNazwaKlienta);
		
		jTextNazwaKlienta = new JTextField();
		jTextNazwaKlienta.setBounds(200,80,150,20);
		add(jTextNazwaKlienta);
		
		
		jLabelPortfelKlienta = new JLabel("Kwota na zakupy (PLN)");
		jLabelPortfelKlienta.setBounds(20,120,150,20);
		add(jLabelPortfelKlienta);
		
		jTextPortfelKlienta = new JTextField();
		jTextPortfelKlienta.setBounds(200,120,150,20);
		add(jTextPortfelKlienta);
		

		jButtonUtworzKlienta = new JButton("Utworz");
		jButtonUtworzKlienta.setBackground(Color.WHITE);
		jButtonUtworzKlienta.addActionListener(this);
		jButtonUtworzKlienta.setBounds(400,180,80,30);
		add(jButtonUtworzKlienta);

		
	
	}
	
	
	
	public static void main(String[] args) {
		
		WidokGUIpowitanie oknoPowitalne = new WidokGUIpowitanie();
		oknoPowitalne.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		oknoPowitalne.setVisible(true);	
	}


	public void actionPerformed(ActionEvent e) {
		KontrolerGUI.kontrolerGUI(e);
	}

	
}
