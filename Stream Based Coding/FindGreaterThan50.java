import java.util.*;
import java.util.stream.Collectors;

class FindGreaterThan50{

public static void main(String args[]){
List<Integer> marks = Arrays.asList(120,21,9,109,78,98,146);

List<Integer>passed=marks.stream()
						 .filter(mark->mark>50)
						 .collect(Collectors.toList());
						 
						 
						 System.out.println(passed);

}
}