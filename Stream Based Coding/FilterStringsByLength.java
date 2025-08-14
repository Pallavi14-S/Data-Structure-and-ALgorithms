import java.util.*;
import java.util.stream.Collectors;

class FilterStringsByLength{
public static void main(String args[])
{

Scanner sc = new Scanner(System.in);

System.out.println("Enter the length that length name you want");
int len=sc.nextInt();



List<String>fruits = Arrays.asList("Apple","Banana","Mango","Kiwi","Grape","Orange");

List<String> ShortWords = fruits.stream()
								.filter(n->n.length()>=len)
								.collect(Collectors.toList());
								
								for(String a:ShortWords){
									
									System.out.println(a);
									
								}



}
}