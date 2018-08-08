/*
Given an array of 'n' ints .Arrange the array elements in reverse order.
Sample Input: A={1,2,3,7,4}
Sample Output: {4,7,3,2,1}
*/



public class ReverseArray
{
	public static void main(String [] args)
	{
		int arr[]={1,2,4,5};
		int [] received=ReverseArray.reverseArray(arr);
		
		for(int i=0;i<received.length;i++)
		{
			System.out.println(received[i]);
		}
	}
	
	public static  int[] reverseArray(int[] b)
	{
		int [] arr=new int [b.length];
		int j=0;
		for(int i=b.length-1;i>=0;i--)
		{
			arr[j]=b[i];
			j++;
		}
		
		return arr;
	}
}
