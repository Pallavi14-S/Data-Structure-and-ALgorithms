import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


class NameStartsWithAUsingFilter{

public static void main(String args[]){


List<String> list=Arrays.asList("Anuja","Amit","Pallavi","Om");

List<String> ListWithA=list.stream()
						   .filter(name->name.startsWith("A"))
						   .collect(Collectors.toList());
						   
						   System.out.println(ListWithA);
						   
							


}




}