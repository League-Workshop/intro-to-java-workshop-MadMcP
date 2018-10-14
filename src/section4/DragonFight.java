package section4;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class DragonFight {
	// 1. Create a main method and put all of the code below inside of it
	public static void main(String[] args) {

		ImageIcon dragon = new ImageIcon("src/section4/dragonPicture.jpg");
		String attack;
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal
		// to 100)
		String friendship;
		int playerHealth = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set
		// it equal to 100)
		int dragonHealth = 100;
		// 4. Create a variable to hold the damage the player's attack does each round
		int playerDamage = 0;
		// 5. Create a variable to hold the damage the dragon's attack does each round
		int dragonDamage = 0;
		friendship = JOptionPane.showInputDialog("Do you wish to make friends with the dragon? (No capitals!)");
		if (friendship.equals("yes")) {
			JOptionPane.showMessageDialog(null,
					"You make friends with the dragon. He gives you all his gold as a gift. You ride around the world with your dragon, making peace with all dragons. While on your journey, you spread awareness of dragon peace. You end up winning the Nobel Peace Prize and live happily ever after with all your dragon friends.");
		}
		// 6. Delete the slashes at the beginning of the next line.
		else {
			while (playerHealth > 0 && dragonHealth > 0) { // this line of code keeps the
				// battle going until someone's health reaches 0

				// 7. Add a closing mustache at the very bottom of this program (since we just
				// added an opening mustache on the previous step).

				// 8. Ask the player in a pop-up if they want to attack the dragon with a yell
				// or a kick
				attack = JOptionPane.showInputDialog("Player, will you attack with a yell or a kick?");
				// 9. If they typed in "yell":
				if (attack.equals("yell")) {
					// -- Find a random number between 0 and 10 and store it in dragonDamage
					int Random = new Random().nextInt(11);
					dragonDamage = Random;
					// -- Subtract that number from the dragon's health variable
					dragonHealth = dragonHealth - dragonDamage;
				}
				// 10. If they typed in "kick":
				if (attack.equals("kick")) {
					// -- Find a random number between 0 and 25 and store it in dragonDamage
					int random = new Random().nextInt(26);
					dragonDamage = random;
					// -- Subtract that number from the dragon's health variable
					dragonHealth = dragonHealth - dragonDamage;
				}
				// 11. Find a random number between 0 and 35 and store it in playerDamage
				int number = new Random().nextInt(36);
				playerDamage = number;
				// 12. Subtract this number from the player's health
				playerHealth = playerHealth - playerDamage;
				// 13. If the user's health is less than or equal to 0
				if (playerHealth <= 0) {
					// -- Tell the user that they lost
					JOptionPane.showMessageDialog(null, "You've lost!");
				}
				// 14. Else if the dragon's health is less than or equal to 0
				else if (dragonHealth <= 0) {
					// -- Tell the user that the dragon is dead and they took a ton of gold!
					JOptionPane.showMessageDialog(null, "You've won! The dragon's gold is yours!");
				}
				// 15. Else
				else {
					// -- Pop up a message that tells the their current health and the dragon's
					// currently health (Bonus: Also display the amount of health that was lost for
					// each player this round)
					JOptionPane.showMessageDialog(null,
							"Your health: " + playerHealth + " Dragon's Health: " + dragonHealth
									+ " Damage taken this turn: " + playerDamage + " Dragon damage taken this turn: "
									+ dragonDamage);
				}
			}
		}
	}
}
