package day5;

import javax.swing.JOptionPane;

public class Madlibs_of_the_Amazon {

	public static void main(String[] args) {

		// Put this sentence in a pop up:
		JOptionPane.showMessageDialog(null,
				"If you find yourself having to cross a piranha-infested river, here's how to do it...");
		// Get the user to enter an adjective
		String adj = JOptionPane.showInputDialog("PLEAS ENTR AN AHJECTIVE");
		// Get the user to enter a type of liquid
		String liq = JOptionPane.showInputDialog("PLEAS ENTR AN TYPES OF LIUQUID");
		// Get the user to enter a body part
		String body = JOptionPane.showInputDialog("GIVE A BODEH PART");
		// Get the user to enter a verb
		String verb = JOptionPane.showInputDialog("I NEEDIN A VERBS");
		// Get the user to enter a place
		String place = JOptionPane.showInputDialog("GIF MEH A PLACE");
		// Fit the user's words into this sentence, and save it in a String:
		JOptionPane.showMessageDialog(null,
				"Piranhas are more " + adj
						+ " during the day, so cross the river at night. Piranhas are attracted to fresh " + liq
						+ " and will most likely take a bite out of your " + body + " if you " + verb
						+ ". Whatever you do, if you have an open wound, try to find another way to get back to the "
						+ place + ". Good luck!");
		// Make a pop-up for the final story. You can use \n to go to the next

	}

}
