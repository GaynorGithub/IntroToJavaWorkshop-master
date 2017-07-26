package day3;

import javax.swing.JOptionPane;

public class Creepy {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null,
				"Hello! I am arthur, king of the britins. We must ask you a few questions.");
		String name = JOptionPane.showInputDialog("WHAT! Is your naaaame?");
		String quest = JOptionPane.showInputDialog("WHAT! Is your quest?");
		String colour = JOptionPane.showInputDialog("WHAT! Is your favourite Colour?");
		String speed = JOptionPane.showInputDialog("Last Question! WHAT! Is the average speed of an unlatten swallow?");
		JOptionPane.showMessageDialog(null, "I don't know that! AHHHHHHHHHHH!!!!");
		JOptionPane.showMessageDialog(null,
				"You responded with these answers: " + name + ", " + quest + ", " + colour + ", " + speed);
	}
}
