/*
 * # TCS Coding Question 1 | Our hoary culture had several great persons …
# Problem Statement
# Our hoary culture had several great persons since time immemorial and king vikramaditya’s nava ratnas
# (nine gems) belongs to this ilk.They are named in the following shloka:
# {some Image}
# Among these, Varahamihira was an astrologer of eminence and his book Brihat Jataak is recokened as
# the ultimate authority in astrology.
# He was once talking with Amarasimha,another gem among the nava ratnas and the author of Sanskrit thesaurus,
# Amarakosha. Amarasimha wanted to know the final position of a person, who starts from the origin 0 0 and
# travels per following scheme.

# Scheme
# He first turns and travels 10 units of distance
# His second turn is upward for 20 units
# Third turn is to the left for 30 units
# Fourth turn is the downward for 40 units
# Fifth turn is to the right(again) for 50 units
# … And thus he travels, every time increasing the travel distance by 10 units.

# Test Cases
# Case 1
# Input : 3
# Expected Output :-20 20

# Case 2
# Input: 4
# Expected Output: -20 -20

# Case 3
# Input : 5
# Expected Output : 30 -20

# Case 4
# Input : 7
# Expected Output : 90 -20
*/
/**
 * @author mukulmc03
 *
 */

import java.util.Scanner;
public class Problem1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 int testCase = sc.nextInt();
		 getDistance(testCase);
		 sc.close();
	}
	
	public static void getDistance(int a) {
		  int distance = 10;
		  int x = 0;
		  int y = 0;
		  char ch = 'R';
		  while(a > 0) 
		  {
		    switch(ch) 
		    {
		      case 'R':
		      x = x + distance;
		      ch = 'U';
		      distance = distance+10;
		      break;

		      case 'U':
		      y = y + distance;
		      ch = 'L';
		      distance = distance + 10;
		      break;

		      case 'L':
		      x = x - distance;
		      ch = 'D';
		      distance = distance + 10;
		      break;

		      case 'D':
		      y = y - distance;
		      ch = 'A';
		      distance = distance + 10;
		      break;

		      case 'A':
		      x = x + distance;
		      ch = 'R';
		      distance = distance + 10;
		      break;
		    }
		    a--;
		  }
		  System.out.println(x+ " , "+y);
	}
}
