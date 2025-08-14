import java.util.*;
import java.util.stream.Collectors;

class FilterNullEmptyStrings{
public static void main(String args[]){



List<String>names=Arrays.asList("Amit","","Anuja",null,"Pallavi");

List<String> clean=names.stream().
filter(s->s!=null &&!s.isEmpty())
.collect(Collectors.toList());


System.out.println(clean);

}


}
