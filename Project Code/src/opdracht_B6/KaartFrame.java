package opdracht_B6;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class KaartFrame extends JFrame implements ActionListener{
	private JLabel l1, l2;
	private JButton b1;
	
	public KaartFrame() {
		l1 = new JLabel("Druk op knop Kaart."); add(l1);
		b1 = new JButton("Kaart"); add(b1);
		b1.addActionListener(this);
		l2 = new JLabel("Het spel begint"); add(l2);
		setLayout(new FlowLayout());
		getContentPane().setBackground(Color.WHITE);
		setSize(200, 140); setVisible(true); 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent event) {
		int worp = 1 + (int) (13 * Math.random());
		int kleur = 1 + (int) (4 * Math.random());
		if (event.getSource() == b1) {
			String s = "";
			switch(worp) {
				case 1: s = "Aas"; break;
				case 2: s = "2"; break;
				case 3: s = "3"; break;
				case 4: s = "4"; break;
				case 5: s = "5"; break;
				case 6: s = "6"; break;
				case 7: s = "7"; break;
				case 8: s = "8"; break;
				case 9: s = "9"; break;
				case 10: s = "10"; break;
				case 11: s = "Boer"; break;
				case 12: s = "Vrouw"; break;
				case 13: s = "Heer"; break;
			}
			String s2 = "";
			switch(kleur) {
				case 1: s2 = "Harten"; break;
				case 2: s2 = "Klaveren"; break;
				case 3: s2 = "Schoppen"; break;
				case 4: s2 = "Ruiten"; break;
			}
			l2.setText("    " + s2 + " " + s + "    ");		
		}
	}
}