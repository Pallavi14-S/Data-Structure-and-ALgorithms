import java.util.*;

class FindFactorial{

public static int fact(int n){

if(n==1)
{return 1;
}

return fact(n-1)*n;


}


public static void main(String args[]){

Scanner sc =new Scanner(System.in);

System.out.println("Enter number that you want find factorial");
int num = sc.nextInt();

System.out.println(fact(num));


}

}
