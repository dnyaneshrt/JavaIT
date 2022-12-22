package java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;

public class ConsumerTest {
    public static void main(String[] args) {
      /*  Consumer<Integer> c=n-> System.out.println(n*n);
        c.accept(50);*/

        List<String> names=new ArrayList<>();
        names.add("vaibhav");
        names.add("dipak");
        names.add("priya");
        names.add("raghu");
        names.add("dhansharee");
       Consumer<List<String>> c= list->{

            for(int i=0;i<list.size();i++)
            {
                if(list.get(i).length()==5)
                {
                    System.out.println(list.get(i));
                }
            }
        };
       c.accept(names);
    }
}
