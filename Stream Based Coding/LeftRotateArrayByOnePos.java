import java.util.*;
import java.util.Arrays;

class LeftRotateArrayByOnePos{

public static void main(String args[]){


Scanner sc = new Scanner(System.in);

System.out.println("Enter Array Elements");

String StringList = sc.nextLine();

int arr[] = Arrays.stream(StringList.split(" ")).
					mapToInt(Integer::parseInt).
					toArray();
					
		
					int a=arr[0];
						
					
					for(int i=0;i<arr.length-1;i++)
					{
						arr[i]=arr[i+1];
						
					}
						
					arr[arr.length-1]=a;

for(int i :arr )
					{
					
					System.out.print(i+" ");
					}

}



}