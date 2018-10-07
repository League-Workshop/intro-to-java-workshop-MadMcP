package section2;

import org.jointheleague.graphical.robot.Robot;

/* Teacher’s note: before beginning, draw a pentagon and have students work out the angle that the robot will have to turn (360/5) */

public class PentagonCrazy {

	private void makePrettyThings() {
		// 1. Create a new Robot
		// Robot bot = new Robot();
		Robot ro = new Robot();
		Robot rob = new Robot();
		// 3. Put the robot's pen down
		// bot.penDown();
		ro.penDown();
		rob.penDown();
		// 8. Make the robot go at maximum speed (100)
		// bot.setSpeed(100);
		ro.setSpeed(100);
		rob.setSpeed(100);
		// 9. Set the pen to a color that you like for the shape
		// bot.setPenColor(0, 0, 0);
		ro.setPenColor(50, 50, 50);
		rob.setPenColor(50, 50, 50);
		// 4. Make a variable for the number of sides you want (can’t test this one)
		int x = 8;
		// 5. Make a second variable for the angle you want the robot to turn. Hint: you
		// can divide in Java using "/". Can’t test until step 6
		int y = (360 / x);
		// 7. Use a for loop to repeat steps #2 to #11, 200 times. When this is done you
		// should see a pentagon
		rob.turn(360 / 16);
		rob.move(500);
		rob.turn(180);
		rob.move(500);
		for (int j = 0; j < 7; j++) {
			rob.turn(360 / 8);
			rob.move(500);
			rob.turn(180);
			rob.move(500);
		}
		rob.penUp();
		rob.move(500);
		for (int i = 0; i < 1000; i++) {
			// 2. Move the robot 200 pixels
			// bot.move(i);
			ro.move(i - 1);
			// 10. Change the previous line of code to make the robot move "i" pixels
			// instead of 200

			// 6. Turn the robot the amount in your angle variable
			// bot.turn(y);
			ro.turn(y - 1);
			// 11. Turn the robot one more degree
			// bot.turn(1);
			ro.turn(1);
		}
	}

	// Variations:
	// *12. make the pattern really huge
	// *13. randomize the color of the pattern
	// *14. experiment with different shapes

	public static void main(String[] args) {
		new PentagonCrazy().makePrettyThings();
	}
}
