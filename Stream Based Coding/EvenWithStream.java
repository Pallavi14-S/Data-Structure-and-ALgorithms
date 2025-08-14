import java.util.List;
import java.util.Arrays;


class EvenWithStream{



public static void main(String args[]){


List<Integer> intList=Arrays.asList(1,2,3,4,5);

intList.stream().
filter(i->i%2==0).
forEach(i->System.out.println(i));



}

}