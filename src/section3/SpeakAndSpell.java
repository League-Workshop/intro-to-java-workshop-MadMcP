package section3;

import javax.swing.JOptionPane;

public class SpeakAndSpell {

	public static void main(String[] args) {
		String word1;
		Boolean word2 = true;
		while (word2) {
			// 1. Use the speak method to say the word. "e.g. spell mandlebrot"
			speak("Spell concierge ");
			// 2. Catch the user's answer in a String
			word1 = JOptionPane.showInputDialog("Type the spelling of the word:");
			// 3. If the user spelled the word correctly, speak "correct"
			if (word1.equals("concierge")) {
				JOptionPane.showMessageDialog(null, "Correct!");
				word2 = false;
			}
			// 4. Otherwise say "wrong"
			else {
				JOptionPane.showMessageDialog(null, "Wrong...");
			}
		}
		// 5. repeat the process for other words

	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
