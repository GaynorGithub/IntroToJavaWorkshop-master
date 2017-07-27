package day5;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic_8_Ballz {

	// 1. Make a main method that includes all the steps below….
	public static void main(String[] args) {

		int rand = new Random().nextInt(5);
		JOptionPane.showInputDialog("Ask a question for the mysterious and mystical 8 ball...");
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "Yes, the answer to thine question is Yes.");
		}
		if (rand == 1) {
			JOptionPane.showMessageDialog(null, "NO!!! THE 8 BALL HAS SPOKEN");
		}
		if (rand == 2) {
			JOptionPane.showMessageDialog(null, "Maybe, thou should asketh Google?");
		}
		if (rand == 3) {

			JOptionPane.showMessageDialog(null, "Try againe later");
		}
		if (rand == 4) {
			JOptionPane.showMessageDialog(null, "Yes, And also the Book of Mormon is a good play.");
		}
	}
	// 2. Make a variable that will hold a random number and put a random number
	// into this variable using "new Random().nextInt(4)"

	// 3. Print out this variable

	// 4. Get the user to enter a question for the 8 ball

	// 5. If the random number is 0

	// -- tell the user "Yes"

	// 6. If the random number is 1

	// -- tell the user "No"

	// 7. If the random number is 2

	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3

	// -- write your own answer

}
