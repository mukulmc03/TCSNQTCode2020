/**
 * @author mukulmc03
 *
 */

/*Java program to check whether a year entered by user is a leap year or not and a leap year is a year
which is completely divisible by 4,but the year should not be a century year except it is divisible by 400*/

import java.util.*;

public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Year");
		int year = sc.nextInt();
		
        	if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
        		System.out.println(year + " is a leap year.");
            else
            	System.out.println(year + " is not a leap year.");
        sc.close();
	}

}
