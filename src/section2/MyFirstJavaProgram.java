package section2;

import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {

	public static void main(String[] args) {

		// START HERE
		Robot bot = new Robot();
		bot.setSpeed(10000);
		bot.penDown();
		bot.setPenColor(255, 10, 200);
		bot.move(250);
		bot.turn(90);
		bot.move(150);
		bot.turn(90);
		bot.move(50);
		bot.penUp();
		bot.turn(180);
		bot.move(100);
	}
}
