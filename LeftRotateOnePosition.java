//7. Left Rotate an Array by One Position 
//Write a Java program to left rotate an array by one position. 

class LeftRotateOnePosition
{
void leftRotate(int arr[])
{

int first=arr[0];


for(int i=0;i<arr.length-1;i++)
{
arr[i]=arr[i+1];

}
arr[arr.length-1]=first;


}
public static void main(String args[])
{
int arr[]={1,2,3,4,5,6};
System.out.println("Before Rotation");

for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}

LeftRotateOnePosition obj = new LeftRotateOnePosition();
obj.leftRotate(arr);
System.out.println();
System.out.println("After Rotation");
for(int i=0;i<arr.length;i++)
{
System.out.print(arr[i]+" ");
}


}
}