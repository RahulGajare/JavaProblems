/*
Pass an int as parameter. The method should return whether the number passed is a square (like i/p-> 100, 9, 16, etc -> o/p should be true) or not.
Sample Input: 100
Sample Output: true
*/

public class IsSquare
{
	public static void main(String [] args)
	{
		int num=5;
		System.out.println(IsSquare.isSquare(num));
	}
	
	public static boolean isSquare(int num)
	{
		int sqrt=(int)Math.sqrt(num);
		
		if(sqrt*sqrt==num)
		{
			return true;
		}
		return false;
	}
}
