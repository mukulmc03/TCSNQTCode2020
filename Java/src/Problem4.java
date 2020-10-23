/**
 * @author mukulmc03
 *
 */

/*Java program to find 15th element of the series
 * 0,0,7,6,14,12,21,18, 28
 */

public class Problem4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 7, b = 0,c;
		System.out.println("Series :");
		for(int i = 1 ; i < 8 ; i++)
		{
			c = a * b;
			System.out.print(c+"	"+(c-b)+"	");
			b++;
		}
			c = a * b;
			System.out.println(c);
			System.out.print("15th element of the series is = "+c);
	}
}

