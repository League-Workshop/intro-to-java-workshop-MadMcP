package section2;

import org.jointheleague.graphical.robot.Robot;

public class TriangleShell {

	// 1. Create a new Robot
	Robot bot = new Robot();

	void go() {
		// 3. delete this line (used only for testing)

		// 6. Make the robot go as fast as possible
		bot.setSpeed(100);
		// 4. make a variable to hold the length of the triangle and set it to 50
		int x = 50;
		// 7. Use a for loop to repeat steps #9 to #10, 60 times
		for (int i = 0; i < 60; i++) {
			// 9. Change the color of the pen to a random color
			bot.setRandomPenColor();
			// 8. Increase the length variable by 10

			// 5. call your drawTriangle() method using your length variable
			drawTriangle(x);
			// 10. Turn the robot 6 degrees to the right
			bot.turn(6);
		}
	}

	/*
	 * 2. fill in the method below to draw a triangle. Use the length variable when
	 * you call move().
	 */
	private void drawTriangle(int length) {
		bot.penDown();
		for (int i = 0; i < 3; i++) {
			bot.move(length);
			bot.turn(360 / 3);
		}
	}

	public static void main(String[] args) {
		new TriangleShell().go();
	}
}
