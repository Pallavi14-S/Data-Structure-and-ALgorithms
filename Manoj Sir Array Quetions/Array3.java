/*3. Find the Smallest Element 
Modify the previous program to find the smallest element in an array. 
Input: arr[] = {10, 25, 47, 85, 12}   
Output: 10
*/

class Array3
{
	
	public static void main(String args[])
	{
		
		int arr[]={23,25,47,85,12};
		int smaller=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(smaller>arr[i])
			{
				smaller=arr[i];
			}
			
		}
		
		System.out.println(smaller);
		
	}
	
}

			