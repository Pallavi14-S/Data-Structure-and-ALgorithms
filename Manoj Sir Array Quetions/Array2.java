/*
2. Find the Largest Element 
Write a program to find the maximum element in an array. 
Input: arr[] = {10, 25, 47, 85, 12}   
Output: 85   
*/


class Array2
{
	public static void main(String args[])
	{
		
		int arr[]={10,25,47,85,12};
		
		int greater=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			
				if(greater<arr[i])
				{
					greater=arr[i];
				}
				
				
		}
		
		System.out.println(greater);
		
	}
}