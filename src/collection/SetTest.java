package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {

        //Set does not allow duplicates.
        //Set does not maintain insertion order.
//        Set set=new HashSet();
        //TreeSet will Sort Set
        TreeSet set=new TreeSet();
        set.add(10);
        set.add(20);
        set.add(15);
        set.add(17);
        set.add(80);
        set.add(90);
        set.add(10);
        set.add(15);

        System.out.println("total elements are there in set: "+ set.size());

        System.out.println("below set values using iterator:");

        Iterator it= set.iterator();
        int i=1;
        while(it.hasNext())
        {
            System.out.println(it.next()+" "+i++);
        }

        System.out.println("below set values using for each:");
        for(Object s:set)
        {
            System.out.println(s);
        }


    }
}
