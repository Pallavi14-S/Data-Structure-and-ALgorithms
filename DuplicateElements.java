//9. Find Duplicate Elements 
//Write a Java program to find all duplicate elements in an array. 

class DuplicateElements 
{

public static void main(String args[])
{
int arr[]={1,5,3,7,8,2,5,0,5,6,3,7,8,2,5,3};

for(int i=0;i<arr.length;i++){
for(int j=1;j<arr.length-1;j++)
{
if(arr[i]==arr[j]){
System.out.println(arr[i]+" ");
continue;
}


}

}

}
}



