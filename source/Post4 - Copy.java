/*
Given a non-empty array of ints, return a new array containing the elements from the original array that come after the last 4 in the original array. The original array will contain at least one 4. If the 4 is the last element in the array return the Original Arry.
Sample Input: 1. post4({2, 4, 1, 2}) -> {1, 2} 2. post4({4, 1, 4, 2}) -> {2} 3. post4({4, 4, 1, 2, 3}) -> {1, 2, 3}
Sample Output: post4({4, 1, 2, 3,4}) -> {4, 1, 2, 3,4}
*/

public class Post4
{
	public static void main(String [] args)
	{
		int [] arr={5,8,7,4,9,};
		int [] res=Post4.post4(arr);
		
		for(int i=0;i<res.length;i++)
		{
			System.out.println(res[i]);
		}
	}
	
	public static int[] post4(int[] nums)
	{
		
		int z=0;
		int [] arr;
		int countArrlength=0;
		int j=0;
		if(nums[nums.length-1]==4)
		{
			return nums;
		}
		
		for(int i=nums.length-1;i>0;i--)
		{
			
			if(nums[i]==4)
			{
				j=i+1;
				break;
			}
			
			countArrlength=countArrlength+1;
			
		}
		
		arr=new int[countArrlength];
		
		for(j=j;j<nums.length;j++)
		{
			arr[z]=nums[j];
			z++;
		}
		
		return arr;
	}
}