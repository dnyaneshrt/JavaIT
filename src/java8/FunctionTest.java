package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

//write a Function to find Square of given number
//write to function to convert String in uppercase
//find list of names which has 5 length
public class FunctionTest {
    public static void main(String[] args) {
        /*Function<Integer, Integer> f1 = n->n*n;
        System.out.println(f1.apply(25));*/

      /*  Function<String,String> f1=s->s.toUpperCase();
        System.out.println(f1.apply("java"));*/

        List<String> names=new ArrayList<>();
        names.add("vaibhav");
        names.add("dipak");
        names.add("priya");
        names.add("raghu");

        Function<List<String>,List<String>> f1=list->{
          List<String> n=new ArrayList<>();
            for(int i=0;i<list.size();i++)
            {
               if(list.get(i).length()==5)
               {
                n.add(list.get(i));
               }
            }
            return n;
        };

        List<String> list=f1.apply(names);
        System.out.println(list);

    }
}