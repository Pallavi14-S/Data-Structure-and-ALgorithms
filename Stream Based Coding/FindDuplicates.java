import java.util.Arrays;
import java.util.*;

class FindDuplicates{

public static void main(String args[])
{

Scanner sc =new Scanner(System.in);

String NumberSTring = sc.nextLine();

int arr[]=Arrays.stream(NumberSTring.split(" ")).
				mapToInt(Integer::parseInt).
				toArray();


ArrayList<Integer> duplicates= new ArrayList<>();

int k=0;
for(int i=0;i<arr.length;i++)
{

for(int j=i+1;j<arr.length;j++)
{


if(arr[i]==arr[j] && i!=j)
{
duplicates.add(arr[i]);

}

}
}


for(int i:duplicates){
	
	System.out.print(i+" ");
}


}
}