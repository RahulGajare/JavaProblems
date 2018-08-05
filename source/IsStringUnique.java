/*	
Check if string has all unique characters(considering white spaces and case sensitivity). 
Eg: i/p : reghav o/p : true i/p : raghav o/p : false
Sample Input: 1)reghav ->true
2)raghav ->false
3. java->false
*/

public class IsStringUnique
{
	public static void main(String [] args)
	{
		String str="dbase";
		System.out.println(IsStringUnique.isStringUnique(str));
		
		
	}
	
	public static boolean isStringUnique(String s)
	{
		char [] ca=s.toCharArray();
		
		for(int i=0;i<ca.length;i++)
		{
			for(int j=0;j<ca.length;j++)
			{
				if(i!=j)
				{
					if(ca[i]==ca[j])
					{
						return false;
					}
				}
			}
		}
		return true;
	}
}