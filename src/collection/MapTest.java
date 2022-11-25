package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
//        Map<Integer,String> students=new TreeMap<>();
        //keys must be unique
        Map<Integer,String> students=new HashMap<>();

        students.put(30,"aniket");
        students.put(40,"dipak");
        students.put(10,"priyanka");
        students.put(20,"dhanashree");
        students.put(20,"dhanashree");
        students.put(25,"dhanashree");

        System.out.println(students);

        Set<Map.Entry<Integer, String>> set=students.entrySet();
        for(Map.Entry<Integer, String> value:set)
        {
            System.out.println(value.getKey()+10+" :   "+value.getValue());
        }
        if(students.containsKey(25))
            System.out.println("present");
        else
            System.out.println("absent");

        if(students.containsKey(125))
            System.out.println("present");
        else
            System.out.println("absent");

    }
}
