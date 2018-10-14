package section4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {

	// 1. Make a main method that includes all the steps below…
	public static void main(String[] args) {
		// 2. Make a variable that will hold a random number and put a random number
		// into this variable using "new Random().nextInt(4)"
		int Random = new Random().nextInt(4);
		// 3. Print out this variable
		JOptionPane.showMessageDialog(null, Random);
		// 4. Get the user to enter something that they think is awesome
		JOptionPane.showInputDialog("Enter something you think is awesome:");
		// 5. If the random number is 0
		if (Random == 0) {
			// -- tell the user whatever they entered is awesome!
			JOptionPane.showMessageDialog(null, "Oh yeah! That is awesome!");
		}
		// 6. If the random number is 1
		if (Random == 1) {
			// -- tell the user whatever they entered is ok.
			JOptionPane.showMessageDialog(null, "Eh, that's okay...");
		}
		// 7. If the random number is 2
		if (Random == 2) {
			// -- tell the user whatever they entered is boring.
			JOptionPane.showMessageDialog(null, "Ugh, that's so boring!");
		}
		// 8. If the random number is 3
		if (Random == 3) {
			// -- write your own answer
			JOptionPane.showMessageDialog(null, "I never want to see you again!");
		}
	}
}
