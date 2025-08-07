import java.util.*;

class ReverseNumber{
public static int reverse(int num){

int sum=0;int rem=0;

while(num>0)
{
rem=num%10;
sum=sum*10+rem;
num=num/10;}


return sum;
}



public static void main(String args[]){
Scanner sc = new Scanner(System.in);

System.out.println("Enter num you want's to reverse");
int n= sc.nextInt();

System.out.println(reverse(n));

}

}