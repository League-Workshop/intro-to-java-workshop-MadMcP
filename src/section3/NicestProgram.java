package section3;

import javax.swing.JOptionPane;

public class NicestProgram {
	public static void main(String[] args) {
		String name;
		JOptionPane.showMessageDialog(null, "Hi! You look great today! You seem so nice! And smart!");
		name = JOptionPane.showInputDialog("What's your name?");
		JOptionPane.showMessageDialog(null, name + ", that's a very nice name!");
		JOptionPane.showInputDialog(name + ", how are you?");
	}
}
