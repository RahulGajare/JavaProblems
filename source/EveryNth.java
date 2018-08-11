/*
 Given a non-empty string and an int N, return the string made starting with char 0, and then every N th char of the string.
 So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
Sample Input: 1. everyNth("Miracle", 2) -> Mrce 
2. everyNth("abcdefg", 2) -> aceg 
3. everyNth("abcdefg", 3) -> adg

*/

public class EveryNth
{
	public static void main (String [] args)
	{
		String str="rahul";
		int x=2;
		System.out.println(EveryNth.everyNth(str,x));
	}
	
	public static String everyNth(String str, int n)
	{
	   String mod="";
		
		char [] ca=str.toCharArray();
		
		 mod=mod+ca[0];
		for(int i=n;i<str.length();i=i+n)
		{
			mod=mod+ca[i];
		}
		
		return mod;
	}
}