import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

/**
 * @author Belay Reggaasa
 * @version 0.0.0 Date: 09/13/2020
 * 
 */
public class QuadraticEquation {
//Creating class
	private static DecimalFormat df2 = new DecimalFormat("#.######");
	private static DecimalFormat df1 = new DecimalFormat("#.#####");

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// main method
		// declaring of r1 and r2
		float r1, r2;
		// Creating Scanner class
		Scanner input = new Scanner(System.in);
		// Ask the user to input
		System.out.println("Enter a,b,c");
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		// Calcuation
		double result = (b * b) - (4 * a * c);
		// calculate r1 and r2
		r1 = (float) ((-b + Math.pow(result, 0.5)) / 2 * a);
		r2 = (float) ((-b - Math.pow(result, 0.5)) / 2 * a);
		// Check the result if it is postive
	
		if (result > 0) {
			System.out.println("The equation has two roots " + df2.format(r1) + " and " + df1.format(r2));
		} else if (result == 0) {
			System.out.println("The equation has one root " + df2.format(r1));
		} else
			System.out.println("The equation has no real root");
		// Closing the main method
		// closing the class

	}

}
