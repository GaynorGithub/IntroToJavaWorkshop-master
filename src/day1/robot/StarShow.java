package day5;

import org.jointheleague.graphical.robot.Robot;

/*** Teacher's note ***/
/*
 * Before beginning recipe: 1. ask students to find and explain the method in
 * this recipe. 2. ask students how they might use the method to make the
 * picture in the laminated hand-outs.
 */

public class StarShow {

	Robot r2 = new Robot("batman");

	void makeStars() {

		// 13. Set the speed to 8
		r2.setSpeed(10);
		// 6. Make a variable to hold the X position of the Robot and set it to
		// 10
		int xPos = 10;

		// 7. Make a variable to hold the Y position of the Robot and set it to
		// 950
		int yPos = 950;
		// 8. Make a variable to hold the star size and set it to 25
		int starSize = 25;
		// 12. Repeat the steps #19 to #18, 30 times
		for (int i = 0; i < 30; i++) {
			// 19. Set the pen width to i
			r2.setPenWidth(i);
			// 10. Set the X position of the robot to your X variable
			r2.setX(xPos);
			// 11. Set the Y position of the robot to your Y variable
			r2.setY(yPos);
			// 9. Call the drawStar() method with your star size variable
			drawStar(starSize);
			// 14. Increase the X position by star size. See Figure 2.
			xPos = starSize + xPos;
			// 15. decrease the Y position by star size. See Figure 3.
			yPos = yPos - starSize;
			// 16. Increase the star size by 20
			starSize = starSize + 20;
			// 17. Turn the robot 30 degrees
			r2.turn(12);
			// 18. Make each star a different random color like in Figure 4.
			r2.setRandomPenColor();
		}

	}

	private void drawStar(int starSize) {
		// 2. Put the robot's pen down
		r2.penDown();
		// 4. Repeat both commands 5 times. See Figure 1 at
		// http://bit.ly/star-show
		for (int i = 0; i < 5; i++) {
			// 1. Move the robot the distance of the starSize variable
			r2.move(starSize);
			// 3. Turn the robot 144 degrees
			r2.turn(144);
		}
	}

	public static void main(String[] args) {
		new StarShow().makeStars();
	}
}
