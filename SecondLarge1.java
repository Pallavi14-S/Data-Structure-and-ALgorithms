import java.util.Scanner;
class SecondLarge1
{
public static int secondLarge(int arr[])
{
int n=arr.length;
int max1=arr[0];
int max2=arr[0];


for(int i=1;i<n;i++)
{
if(max1<arr[i])
{
max1=arr[i];
}
}

for(int i=1;i<n;i++)
{

if(max1>arr[i])
{
if(max2<arr[i])
{

max2=arr[i];


}
}
}
return max2;

}


public static void main(String args[])
{
Scanner sc= new Scanner(System.in);

System.out.println("Enter How many Element you want to insert");
int n=sc.nextInt();
int arr[]=new int[n];

for(int i=0;i<n;i++)
{
arr[i]=sc.nextInt();

}

System.out.println("Max is: "+secondLarge(arr));




}
}