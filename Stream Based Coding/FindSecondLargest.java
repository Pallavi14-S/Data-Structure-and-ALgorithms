import java.util.*;

import java.util.Arrays;
class FindSecondLargest{


public static void main(String args[]){

Scanner sc = new Scanner(System.in);


System.out.println("Enter array elements");

String StringNumber=sc.nextLine();


int arr[]= Arrays.stream(StringNumber.split(" "))
.mapToInt(Integer::parseInt)
.toArray();


int max=0;

for(int i=0;i<arr.length;i++)
{


if(max<arr[i]){
max=arr[i];
}}


int secondMax=0;

for(int i=0;i<arr.length;i++)
{



if(secondMax<arr[i]){
	
	if(max!=arr[i]){
secondMax=arr[i];

	}
}}



System.out.println(secondMax);

}

}