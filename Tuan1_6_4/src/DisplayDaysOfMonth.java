import java.util.Scanner;

public class DisplayDaysOfMonth {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What's month?");
		String strMonth = keyboard.nextLine();

		System.out.println("What's year?");
		int intYear = keyboard.nextInt();
		int isLeap = LeapYear(intYear);
		keyboard.close();
		if (strMonth.equals("January") || strMonth.equals("Jan") || strMonth.equals("1")|| strMonth.equals("Jan.")) {
			System.out.println("31");
		}else if ((strMonth.equals("February") || strMonth.equals("Feb") || strMonth.equals("Feb.")|| strMonth.equals("2"))) {
			if (isLeap == 0) {
				System.out.println("28");
			}else {
				System.out.println("29");
			}
		}else if ((strMonth.equals("March") || strMonth.equals("Mar") || strMonth.equals("Mar.")|| strMonth.equals("3"))) {
			System.out.println("31");
		}else if ((strMonth.equals("April") || strMonth.equals("Apr") || strMonth.equals("Apr.")|| strMonth.equals("4"))) {
			System.out.println("30");
		}else if ((strMonth.equals("May") || strMonth.equals("May") || strMonth.equals("May.")|| strMonth.equals("5"))) {
			System.out.println("31");
		}else if ((strMonth.equals("June") || strMonth.equals("Jun") || strMonth.equals("Jun.")|| strMonth.equals("6"))) {
			System.out.println("30");
		}else if ((strMonth.equals("July") || strMonth.equals("Jul") || strMonth.equals("Jul.")|| strMonth.equals("7"))) {
			System.out.println("31");
		}else if ((strMonth.equals("August") || strMonth.equals("Aug") || strMonth.equals("Aug.")|| strMonth.equals("8"))) {
			System.out.println("31");
		}else if ((strMonth.equals("September") || strMonth.equals("Sept") || strMonth.equals("Sept.")|| strMonth.equals("9"))) {
			System.out.println("30");
		}else if ((strMonth.equals("October") || strMonth.equals("Oct") || strMonth.equals("Oct.")|| strMonth.equals("10"))) {
			System.out.println("31");
		}else if ((strMonth.equals("November") || strMonth.equals("Nov") || strMonth.equals("Nov.")|| strMonth.equals("11"))) {
			System.out.println("30");
		}else if ((strMonth.equals("December") || strMonth.equals("Dec") || strMonth.equals("Dec.")|| strMonth.equals("12"))) {
			System.out.println("31");
		}
	}
	
	public static int LeapYear(int year) {
	    if (year % 4 == 0) {
	      if (year % 100 == 0) {
	        if (year % 400 == 0)
	          return 1;
	        else
	          return 0;
	      }
	      
	      else
	        return 1;
	    }
	    
	    else
	      return 0;
    }
}
