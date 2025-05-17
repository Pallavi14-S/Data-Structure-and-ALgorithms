class MoveZeros
{

static void move(int arr[])
{
int index=0;
for(int i=0;i<arr.length;i++)
{

if(arr[i]!=0)
{
arr[index++]=arr[i];

}

}

while(index<arr.length)
{
arr[index]=0;
index++;
}

}


public static void main(String args[])
{
int arr[]={0,4,5,2,0,4,3,0,9,0};


move(arr);

for(int num: arr)
{
System.out.print(num+" ");


}

}



}
