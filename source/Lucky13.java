/*
Given an array of ints, return true if the array does not have any 1's or 3's.
Sample Input: 1. lucky13({0, 2, 4}) -> true 2. lucky13({1, 2, 3}) -> false 3. lucky13({1, 2, 4}) -> false
Sample Output: 1. lucky13({0, 2, 4}) -> true
*/


public class Lucky13
{
	public static void main(String [] args)
	{
		int [] arr={2,5,8,4,6};
		System.out.println(lucky13(arr));
	}
	
	public static boolean lucky13(int[] nums)
	{
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==1||nums[i]==3)
			{
				return false;
			}
			
		}
		
		return true;
	}
}