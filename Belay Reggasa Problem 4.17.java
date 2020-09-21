import java.util.Scanner;

/**
 * 
 * @author Belay Reggsaa
 * @version 0.0.0
 * @date 09/16/2020
 */
public class DayDeterminer {
//Variable declaration
	public int year, day;
	public int month;

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a year:");
		int year = input.nextInt();
		System.out.println("Enter a month");
		String month = input.next();

//Februay has 29 days every four years
		if (month.equals("Feb")) {

			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {

				System.out.println("February " + year + " has 29 days");
			} else {

				System.out.println("February " + year + " has 28 days");
			}
		}
		// January, March, May,July,Augest, October and December has 31 days
		if ((month.equals("Jan")) || (month.equals("Mar")) || (month.equals("May")) || (month.equals("Jul"))
				|| (month.equals("Aug")) || (month.equals("Oct")) || (month.equals("Dec"))) {
			System.out.println(month + " " + year + " has 31 days");
			// April,June, November and September has 30 days
		} else if ((month.equals("Apr")) || (month.equals("Jun")) || (month.equals("Nov")) || (month.equals("Sep"))) {
			System.out.println(month + " " + year + " has 30 days");
		}
	}

}
