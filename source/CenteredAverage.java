/*Return the "centered" average of an array of ints, which we'll say is the mean average of the values, 
except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value, 
ignore just one copy, and likewise for the largest value. Use int division to produce the final average.
 You may assume that the array is length 3 or more.
Sample Input: 1. centeredAverage({1, 2, 3, 4, 100}) -> 3 ,
 2. centeredAverage({1, 1, 5, 5, 10, 8, 7}) -> 5 ,
Sample Output: 3. centeredAverage({10,4,2,4,2, 0}) -> 3
*/


public class CenteredAverage
{
	public static void main (String [] args)
	{
		int[] arr={5,2,8,4,1,6,9};
		int [] res=CenteredAverage.centeredAverage(arr);
		   
		for(int i=0;i<res.length;i++)
		{
		   System.out.println(arr[i]);
		}
			
	}
	
	public static int[] centeredAverage(int[] nums) 
	{
		return Arrays.sort(nums);
	}
}