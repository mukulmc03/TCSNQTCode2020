/**
 * @author mukulmc03
 *
 */

/*Java program to check whether a number entered by user is prime or not for only positive numbers,
 if the number is negative then ask the user to re-enter the number*/

import java.util.*;

public class Problem3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to be checked : ");
		int n = sc.nextInt();
		
		Problem3 ob = new Problem3();
		
		ob.check(n);
		sc.close();
	}
	void check(int n)
	{
	if(n < 0)
	System.out.println("Please enter a positive integer");
	else
	prime(n);
	}
	void prime(int n)
	{
	int c = 0;
	for(int i = 2;i < n;i ++)
	{
	if(n % i == 0)
	++c;
	}
	if(c >= 1)
		System.out.println("Entered number is not a prime number");
		else
		System.out.println("Entered number is a prime number");
		}
}
