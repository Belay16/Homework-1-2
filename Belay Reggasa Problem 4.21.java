import java.util.Scanner;

/**
 * 
 * @author Belay Reggasa
 * @version 0.0.0
 * @date 09/18/2020
 *
 */
public class CheckSSN {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a SSN");
		String A = input.next();

		// validation
		// character.isdigit is used for restrict the input in numbers between 0 and 9
		// charaAt is used to indicate the index in the user input.
		if (A.length() == 11 && A.charAt(0) <= '9' && A.charAt(0) >= '0' && Character.isDigit(A.charAt(1))
				&& Character.isDigit(A.charAt(2)) && A.charAt(3) == '-' && Character.isDigit(A.charAt(4))
				&& Character.isDigit(A.charAt(5)) && A.charAt(6) == '-' && Character.isDigit(A.charAt(7))
				&& Character.isDigit(A.charAt(8)) && Character.isDigit(A.charAt(9))
				&& Character.isDigit(A.charAt(10))) {
			System.out.println(A + " is a valid social security number");
		} else {
			System.out.println(A + " is an invalid social security number");
		}

	}

}
