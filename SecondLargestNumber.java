//8. Find the Second Largest Number 
//Write a program to find the second largest element in an array without sorting. 

class SecondLargestNumber
{

int secondLarge(int arr[]){

int max=0;
int secondMax=0;

for(int i=0;i<arr.length;i++)
{
if(max<arr[i])
{
max=arr[i];
}
}

for(int i=0;i<arr.length;i++)
{

if(arr[i]!=max)
{
if(secondMax<arr[i])
{
secondMax=arr[i];
}

}
}
return secondMax;


}
public static void main(String args[])
{
int arr[]={1,44,3,77,5,9,2,3,1};
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");

}
System.out.println();
System.out.println("*************************************");
SecondLargestNumber obj = new SecondLargestNumber();
int max=obj.secondLarge(arr);

System.out.print(max);

}
}