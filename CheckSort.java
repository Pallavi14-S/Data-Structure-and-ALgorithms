class CheckSort{

public static void main(String args[]){
int arr[]= {1,2,3,4,5};
int flag=0;
for(int i=0;i<arr.length-1;i++){
	
	if(arr[i]>arr[i+1])
	{
		flag=1;
		break;
	}

}
if(flag==1)
{System.out.println("False");
}
else{
	
	System.out.println("True");
}


}

}