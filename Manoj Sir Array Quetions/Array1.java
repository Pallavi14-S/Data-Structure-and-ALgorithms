/*. Sum of Array Elements 
Write a Java program to calculate the sum of all elements in an integer array. 
Example: 
Input: arr[] = {1, 2, 3, 4, 5}   
Output: 15   
*/

class Array1
{
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5};
		int result=0;
		
		for(int i=0;i<arr.length;i++)
		{
			result=result+arr[i];
			
		}
		
		System.out.println(result);
		
	}
	
}