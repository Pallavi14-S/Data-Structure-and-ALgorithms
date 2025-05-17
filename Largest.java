class Largest{
public static void main(String args[])
{
int arr[] = {10, 25, 47, 85, 12};

for(int i=0;i<arr.length;i++)
{


boolean flag = true;

for(int j=0;j<arr.length-1;j++)
{
if(arr[i]<arr[j])
{
flag=false;
break;
}
}

if(flag)
{
System.out.println(arr[i]);
}
}
}
}