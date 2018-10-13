package section3;

import javax.swing.JOptionPane;

public class WorldDomination {

	public static void main(String[] args) {
		String code;
		// 1. Ask the user if they know how to write code.
		code = JOptionPane.showInputDialog("Do you know how to write code?");
		// 2. If they say "yes", tell them they will rule the world.
		if (code.equals("yes")) {
			JOptionPane.showMessageDialog(null, "You will RULE THE WORLD!");
		}
		// 3. Otherwise, wish them good luck washing dishes.
		else {
			JOptionPane.showMessageDialog(null, "Well, good luck washing dishes!");
		}
	}
}
