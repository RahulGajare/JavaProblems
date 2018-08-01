/*
Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.
Sample Input: 1. has12({1, 3, 2})->true ,
 2. has12({3, 1, 2})->true ,
Sample Output: 3. has12({3, 1, 4, 5, 2}) -> true
*/





public class Has12
{
	public static void main(String [] args)
	{
		int [] arr={2,1,0,8,2};
		System.out.println(Has12.has12(arr));
	}
	
	public static boolean has12(int[] nums) 
	{
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==1)
			{
				for(int j=i+1;j<nums.length;j++)
				{
					if(nums[j]==2)
					{
						return true;
					}
				}
				break;
			}
		}
		return false;
	}
}