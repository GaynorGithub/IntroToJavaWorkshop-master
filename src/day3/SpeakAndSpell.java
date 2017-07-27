package day3;

import javax.swing.JOptionPane;

/**
 * Teacher's Note: Have the kids play with the Speak & Spell. The first Speak &
 * Spell was introduced at the summer Consumer Electronics Show in June 1978,
 * making it one of the earliest handheld electronic devices with a visual
 * display to use interchangeable game cartridges. Discuss with students how you
 * would make this program. Allow them to code it themselves, or use this
 * recipe.
 **/

public class SpeakAndSpell {

	public static void main(String[] args) {
		speak("e.g. spell mandlebrot");
		String ans = JOptionPane.showInputDialog("Spell the word that was just said");
		if (ans.equals("mandlebrot")) {
			speak("Great job m8, that is how you spell mandlebrot");
		} else {
			speak("Wrong, go back to school you pleb");
		}
		speak("e.g. spell supercalifragilisticexpialidocious");
		String ans2 = JOptionPane.showInputDialog("Spell the word that was just said");
		if (ans2.equals("supercalifragilisticexpialidocious")) {
			speak("Great job, even though the sound of it is really quite atrocious.");
		} else {
			speak("That is not how you spell supercalifragilisticexpialidocious, this is how you spell supercalifragilisticexpialidocious. s, u, p, e, r, c, a, l, i, f, r, a, g, i, l, i, s, t, i, c, e, x, p, i, a, l, i, d, o, c, i, o, u, s");
		} // speak("e.g. spell mandlebrot");
			// String ans = JOptionPane.showInputDialog("Spell the word that was
			// just said");
			// if (ans.equals("mandlebrot")) {
			// speak("Great job m8, that is how you spell mandlebrot");
			// } else {
			// speak("Wrong, go back to school you pleb");
			// }speak("e.g. spell mandlebrot");
			// String ans = JOptionPane.showInputDialog("Spell the word that was
			// just said");
			// if (ans.equals("mandlebrot")) {
			// speak("Great job m8, that is how you spell mandlebrot");
			// } else {
			// speak("Wrong, go back to school you pleb");
			// }

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
