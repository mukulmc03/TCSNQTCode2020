/**
 * @author mukulmc03
 *
 */

/* Java program to find nth element of the series
 * 1, 1, 2, 3, 4, 9, 8, 27, 16, 81, 32, 243, 64, 729, 128, 2187 … 
 */

import java.util.*;

public class Problem5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the value of n : ");				
		int n = sc.nextInt();
		int a = 1, b = 1;
		
		if(n % 2 == 0)
		{
			for(int i = 1 ; i <= (n-2) ; i = i+2)
			{
				a = a * 2;
				b = b * 3;
			}
			System.out.print(n+" element of the series is = "+b);
		}
		else
		{
			for(int i = 1 ; i < (n-2) ; i = i+2)
			{
				a = a * 2;
				b = b * 3;
			}
			a = a * 2;
			System.out.print(n+" element of the series is = "+a);
		}
		sc.close();
	}
}

