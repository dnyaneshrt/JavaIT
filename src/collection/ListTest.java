package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//List maintain insertion order
//List allows duplicates
public class ListTest {
    public static void seeMyList(List list)
    {
        System.out.println("inside seeMyList method:");
        for(Object name:list)
        {
            System.out.println(name);
        }

        if(list.isEmpty())
            System.out.println("list is empty");
        else
            System.out.println("list is not emppty");

        int size_before=list.size();
        System.out.println("size of above list is before clear :"+size_before);
        list.clear(); //clear method will delete all elements from list
        int size_after=list.size();
        System.out.println("size of above list is after clear:"+size_after);

        if(list.isEmpty())
            System.out.println("list is empty");
        else
            System.out.println("list is not emppty");


    }

    public static void main(String[] args) {
        List names=new ArrayList(); //list object creation
      /*  names.add(10);
        names.add(10.5f);*/
        names.add("raghuveer");
        names.add("raghuveer");
        names.add("raghuveer");
        names.add("dipak");
        names.add("dhansharee");
        names.add("aniket");
        names.add("vaibhav");
        names.add("priyanka");
//        names.add('A');
        Collections.sort(names);

        System.out.println("after sorting:  "+names);
        names.sort(Comparator.reverseOrder());

        System.out.println("after sorting in reverse order:  "+names);
        names.add(3,"Android");
        names.remove(0);
        System.out.println(names);

        System.out.println("list iterate using for each loop");
        for(Object name:names)
        {
            System.out.println(name);
        }
        System.out.println(names.contains("dipak"));
        if(names.contains("dipak"))
            System.out.println("dipak is available in list");
        else
            System.out.println("dipak is not avaialable in list");

        System.out.println(names.contains("sachin"));
        if(names.contains("sachin"))
            System.out.println("sachin is available in list");
        else
            System.out.println("sachin is not avaialable in list");

        int size=names.size();
        System.out.println("size of above list is :"+size);

//        seeMyList(names);//passing list to method
    }
}
