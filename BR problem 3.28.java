import java.util.Scanner;

/**
 * 
 * @author Belay Reggaasa
 * @version 0.0.0 Date: 09/13/2020
 */

public class Distance {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		double x, y;
		double distance;

		System.out.print("Enter the value of x and y:");
		x = s.nextDouble();
		y = s.nextDouble();

		distance = Math.pow(Math.pow(x, 2) + Math.pow(y, 2), 0.5);

		if (distance <= 10) {
			System.out.print("Point (" + x + ", " + y + ") is in the circle.");
		} else {
			System.out.print("Point (" + x + ", " + y + ") is not in the circle.");
		}
	}
}
