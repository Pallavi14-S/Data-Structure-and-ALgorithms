import java.util.Scanner;
class Duplicate1
{

public static void duplicate(int arr[])
{
int dup[]=new int[arr.length];
int k=0;

for(int i=0;i<arr.length;i++)
{
	boolean flag=false;
	for(int j=0;j<arr.length;j++)
	{
		if(arr[i]==arr[j] && i!=j)
		{
			flag=true;
			break;
			
		}
		
	}
	
	if(flag)
	{
		boolean already=false;
		for(int l=0;l<k;l++)
		{
			if(arr[i]==dup[l])
			{
				already=true;
				break;
			
		}
		
		
		
	}
	if(!already)
		{
			
			dup[k++]=arr[i];
			
		}
	
	
}

}


for (int i = 0; i < k; i++) {
    System.out.print(dup[i] + " ");
}

}

public static void main(String args[])
{
Scanner sc = new Scanner(System.in);

int n=sc.nextInt();
int arr[]=new int[n];

for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();


}

duplicate(arr);



}

}