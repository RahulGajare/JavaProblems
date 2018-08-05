/*
Given an int N,return the absolute difference between N and 21, except return double the absolute difference
 if N is over 21. diff21(19) --> 2 , diff21(10)--> 11 , diff21(21)-->0 , diff21(23)--> 4 ,
Sample Input: 19 ->2 10 ->11
Sample Output: 21-> 0
*/

public class Diff21
{
	public static void main (String [] args)
	{
		int n=10;
		System.out.println(Diff21.diff21(n));
	}
	
	public static int diff21(int n)
	{
		if(n>21)
		{
			return n-21;
		}
		else
		{
			return 21-n;
		}
	}
	
	
}
