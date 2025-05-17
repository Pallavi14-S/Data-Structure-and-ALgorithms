class MoveNegative
{
static void move(int arr[])
{

int index=0;
int result[]= new int[arr.length];
for(int i=0;i<arr.length;i++)
{

if(arr[i]<0)
{
result[index++]=arr[i];
}
}
for(int i=0;i<arr.length;i++)
{
if(arr[i]>=0)
{
result[index++]=arr[i];
}
}

for(int i=0;i<arr.length;i++)
{
arr[i]=result[i];
}


}





public static void main(String args[])
{
int arr[]={-3,0,8,9,3,0,-3,-1};

move(arr);

for(int num:arr)
{
System.out.print(num+" ");

}


}
}