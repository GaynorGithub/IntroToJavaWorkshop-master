package day5;

import javax.swing.JOptionPane;

public class Its_a_QUIZ {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "ITS TIME FOR THE Processing™ QUIIIIIIIZZZZZZZZZZZZZZZZZZZZZZ");
		String q1 = JOptionPane.showInputDialog("What is better? Cats or dogs?");
		String q2 = JOptionPane.showInputDialog("What special variable do you use for the x position of the mouse?");
		String q3 = JOptionPane.showInputDialog("What do you use for telling if the mouse is clicked?");
		String q4 = JOptionPane
				.showInputDialog("What do you use to tell whether the right or left mouse button was pressed?");
		String q5 = JOptionPane.showInputDialog("Strawberry or vanilla?");
		String q6 = JOptionPane.showInputDialog("What command draws a circle?");
		String q7 = JOptionPane.showInputDialog("What command draws a square?");
		String q8 = JOptionPane.showInputDialog("How do you choose a color?");
		String q9 = JOptionPane.showInputDialog("What is the name of the method is called repeatedly?");
		String q10 = JOptionPane.showInputDialog("What method happens only once at the beginning?");

		if (q1.equalsIgnoreCase("cats")) {
			JOptionPane.showMessageDialog(null, "Question 1! Right! Cats are amazing!");
		} else {
			JOptionPane.showMessageDialog(null, "Question 1! You don't like cats? WHY? Cats are amazing!");
		}
		if (q2.equals("mouseX")) {
			JOptionPane.showMessageDialog(null, "Question 2! That is COOOORRRREEEECCCCCTTTTTTT");
		} else {
			JOptionPane.showMessageDialog(null, "Question 2! No. It is mouseX not " + q2);
		}
		if (q3.equals("mousePressed")) {
			JOptionPane.showMessageDialog(null, "Question 3! Thats Right!");
		} else {
			JOptionPane.showMessageDialog(null,
					"Question 3! Sorry, but thats incorrect. The correct answer is mousePressed!");
		}
		if (q4.equals("mouseButton")) {
			JOptionPane.showMessageDialog(null, "Question 4! GREEAAAATTT JOOOOOBBBBBBB!!!!");
		} else {
			JOptionPane.showMessageDialog(null, "Question 4! NOOOOO. DAS RONG");
		}
		if (q5.equalsIgnoreCase("Strawberry")) {
			JOptionPane.showMessageDialog(null, "Question 5! Good Choice?");
		} else {
			JOptionPane.showMessageDialog(null, "Question 5! Good Choice!");
		}
		if (q6.equalsIgnoreCase("ellipse")) {
			JOptionPane.showMessageDialog(null, "Question 6! CORRREEEECTTT ANSWWWWEEEEERRRRRRRR");
		} else {
			JOptionPane.showMessageDialog(null,
					"Question 6! WRONG. IM BUILDING A WALL BETWEEN US. MAKE SOMEONE ELSE PAY");
		}
		if (q7.equalsIgnoreCase("rect")) {
			JOptionPane.showMessageDialog(null, "Question 7! GReaaataaa jooobaru");
		} else {
			JOptionPane.showMessageDialog(null, "Question 7! Wrong. Get rect.");
		}
		if (q8.equalsIgnoreCase("fill")) {
			JOptionPane.showMessageDialog(null, "Question 8! Nice job!");
		} else {
			JOptionPane.showMessageDialog(null, "Question 8! *annoying buzzer sound* Thats Incorrect!");
		}
		if (q9.equalsIgnoreCase("draw")) {
			JOptionPane.showMessageDialog(null, "Question 9! Nice");
		} else {
			JOptionPane.showMessageDialog(null, "Question 9! Bad");
		}
		if (q10.equalsIgnoreCase("setup")) {
			JOptionPane.showMessageDialog(null, "Question 10! GREAT JOB! YOU FINISHED THE QUIZ");
		} else {
			JOptionPane.showMessageDialog(null, "Question 10! WRONG! YOU FAILED THE QUIZ");
		}
		JOptionPane.showMessageDialog(null, "Thank you so muuch, Wahoo!");

	}

}
