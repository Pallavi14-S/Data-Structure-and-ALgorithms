import java.util.*;
import java.util.Arrays;

class NonDuplicates{

public static void main(String args[])
{
Scanner sc =new Scanner(System.in);

String numberString = sc.nextLine();

int arr[]= Arrays.stream(numberString.split(" ")).
				 mapToInt(Integer::parseInt).
				 toArray();
				 
				 
				 ArrayList<Integer>duplicates = new ArrayList<>();
				 
				 
				 for(int i =0;i		<arr.length;i++) {
		                 for(int
		                 j=i+1;j<arr.length;j++)
		                 {
		                 if(arr[j]==arr[i] && !duplicates.contains(arr[i]))
		                 {
		                 duplicates.add(arr[i]);
		                 }
		                 }
		                 }
		        ArrayList<Integer>Noduplicates=new ArrayList<>();
				int k=0;
				
				while(k<arr.length){
				
				if(!duplicates.contains(arr[k])){
				Noduplicates.add(arr[k]);
				}
				k++;
				
				
				}
				
				
				
				System.out.println(Noduplicates);
				



}


}