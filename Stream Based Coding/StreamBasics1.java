import java.util.Arrays;
import java.util.List;

public class StreamBasics1{

public static void main(String args[]){

List<String> names= Arrays.asList("ALice","Bob","Charlie");

names.stream()
.forEach(name-> System.out.println(name));


}
}


