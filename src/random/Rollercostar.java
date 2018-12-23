package random;

import javax.swing.JOptionPane;

public class Rollercostar {

	public static void main(String[] args) {

		String a = JOptionPane.showInputDialog(null, "How tall are you small one?");
		int b = Integer.parseInt(a);
		if (b > 48) {
			JOptionPane.showInputDialog(null, "You may go on the ride of death");
		}

		if (b < 48) {

			JOptionPane.showInputDialog(null, "Save youselves! We have had 15 deaths in the last five minutes.");

		}
	}
}
