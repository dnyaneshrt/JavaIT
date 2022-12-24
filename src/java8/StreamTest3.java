package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//stream is used to process collection objects.. stream is not data straucture.
//stream concepts gives up method called stream()
//filter(Predicate)
public class StreamTest3 {

    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        for(int i=1;i<=50;i++)
        {
            numbers.add(i);
        }
    /*    long count_of_even_numbers=numbers.stream().filter(i->i%2==0).count();
        System.out.println(count_of_even_numbers);
*/
     System.out.println("even numbers using stream as follows");
//     List<Integer> list=numbers.stream().filter(i->i%2==0).collect(Collectors.toList());
        List<Integer> list= numbers.stream().filter(i->i%2==0).collect(Collectors.toList());
     for(Integer i:list)
     {
         System.out.println(i);
     }


    }
}
