package random;

import javax.swing.JOptionPane;

public class VotingBooth {
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog(null, "How old are you small one?");
		int b = Integer.parseInt(a);
		if (b > 18) {
			JOptionPane.showInputDialog(null, "Who should be the next president");
		}

		if (b < 18) {

			JOptionPane.showInputDialog(null,
					"Your opinon matters more than anyone who is over the age of 18. Tell me what what you think!");
		}
	}

	public VotingBooth() {

	}

}
