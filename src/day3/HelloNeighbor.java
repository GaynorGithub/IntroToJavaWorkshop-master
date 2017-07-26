package day3;

import javax.swing.JOptionPane;

public class HelloNeighbor {
	public static void main(String[] args) {

		String ans = JOptionPane.showInputDialog("Do you like your neighbors?");
		if (ans == "yes") {
			JOptionPane.showMessageDialog(null, "Answer registered as: " + ans + ". Thank you for taking our survey.");
		} else {
			JOptionPane.showMessageDialog(null, "Answer registered as: " + ans
					+ ". Thank you for taking our survey. Please try to form better bonds with your neightbors.");
		}
	}
}
