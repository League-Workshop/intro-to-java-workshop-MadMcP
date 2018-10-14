package section4;

import javax.swing.JOptionPane;

public class QuizGame {

	public static void main(String[] args) {

		// 1. Create a variable to hold the user's score
		int score = 0;
		String preamble;
		String ratify;
		String protempore;
		String ordain;
		String copyright;
		String impeachment;
		String sufferage;
		String warrant;
		String lameDuck;
		String patent;
		// 2. Ask the user a question
		preamble = JOptionPane.showInputDialog("Introduction");
		// 3. Use an if statement to check if their answer is correct
		if (preamble.equalsIgnoreCase("Preamble")) {
			JOptionPane.showMessageDialog(null, "Correct! Score increased by 1");
			score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong... No score increase.");
		}
		copyright = JOptionPane.showInputDialog(
				"The exclusive right to sell an otherwise controlled book, play, poem, music, ect. granted by the government for a certain number of years");
		if (copyright.equalsIgnoreCase("Copyright")) {
			JOptionPane.showMessageDialog(null, "Correct! Score increased by 1");
			score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong... No score increase.");
		}
		ratify = JOptionPane.showInputDialog("To approve by vote");
		if (ratify.equalsIgnoreCase("Ratify")) {
			JOptionPane.showMessageDialog(null, "Correct! Score increased by 1");
			score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong... No score increase.");
		}
		protempore = JOptionPane.showInputDialog("Temporarily");
		if (protempore.equalsIgnoreCase("Pro-Tempore")) {
			JOptionPane.showMessageDialog(null, "Correct! Score increased by 1");
			score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong... No score increase.");
		}
		ordain = JOptionPane.showInputDialog("To establish by law");
		if (ordain.equalsIgnoreCase("Ordain")) {
			JOptionPane.showMessageDialog(null, "Correct! Score increased by 1");
			score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong... No score increase.");
		}
		impeachment = JOptionPane.showInputDialog("To bring formal charges against a public (civil) offical");
		if (impeachment.equalsIgnoreCase("Impeachment")) {
			JOptionPane.showMessageDialog(null, "Correct! Score increased by 1");
			score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong... No score increase.");
		}
		sufferage = JOptionPane.showInputDialog("The right to vote");
		if (sufferage.equalsIgnoreCase("Sufferage")) {
			JOptionPane.showMessageDialog(null, "Correct! Score increased by 1");
			score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong... No score increase.");
		}
		warrant = JOptionPane.showInputDialog("That which gives a right");
		if (warrant.equalsIgnoreCase("Warrant")) {
			JOptionPane.showMessageDialog(null, "Correct! Score increased by 1");
			score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong... No score increase.");
		}
		lameDuck = JOptionPane.showInputDialog(
				"When an offical, especially a Congress man, knows they have lost for reelection and is serving the last part of their term");
		if (lameDuck.equalsIgnoreCase("Lame Duck")) {
			JOptionPane.showMessageDialog(null, "Correct! Score increased by 1");
			score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong... No score increase.");
		}
		patent = JOptionPane.showInputDialog(
				"Something granted by the government to protect someone's invention for a certain number of years");
		if (patent.equalsIgnoreCase("Patent")) {
			JOptionPane.showMessageDialog(null, "Correct! Score increased by 1");
			score = score + 1;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong... No score increase.");
		}
		JOptionPane.showMessageDialog(null, "Your score is: " + score + "/10");
		// 4. if the user's answer is correct

		// -- add one to their score

		// 5. Create more questions by repeating steps 1, 2, and 3 below.

		// 6. After all the questions have been asked, print the user's score

	}
}
