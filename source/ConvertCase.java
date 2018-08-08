/*
Pass a string as parameter. Convert the string characters to lowercase if it is uppercase and to uppercase if its lowercase.
 If there are digits or special chars in the string, they should be omitted.
Sample Input: Happy New Year-2012
Sample Output: hAPPY nEW yEAR-2012
*/

public class ConvertCase
{
	public static void main(String [] args)
	{
		String str="aa2%";
		System.out.println(ConvertCase.convertCase(str));
	}
	
	public static String convertCase(String s)
	{
		char [] ca=s.toCharArray();
		
		for(int i=0;i<ca.length;i++)
		{
			if(Character.isLowerCase(ca[i]))
			{
				ca[i]=Character.toUpperCase(ca[i]);
			}
			else
			{
				ca[i]=Character.toLowerCase(ca[i]);
			}
			
		}
		
		String l=new String(ca);
		return l;
	}
}