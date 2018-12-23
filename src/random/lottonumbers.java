package random;

import java.util.Random;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class lottonumbers {

	public static void main(String[] args) {

		Random randomMaker = new Random();
		JPanel panel = new JPanel();
		int randomNumber0 = randomMaker.nextInt(5);
		int randomNumber1 = randomMaker.nextInt(5);
		int randomNumber2 = randomMaker.nextInt(5);
		int randomNumber3 = randomMaker.nextInt(5);
		int randomNumber4 = randomMaker.nextInt(5);
		JOptionPane.showMessageDialog(null, randomNumber1 + "    " + randomNumber0 + "    " + randomNumber2 + "    "
				+ randomNumber3 + "    " + randomNumber4);
	}
}