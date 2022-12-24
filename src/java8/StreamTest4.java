package java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest4 {
    public static void main(String[] args) {
        ArrayList<String> names=new ArrayList<>();
       names.add("vaibhav");
        names.add("aniket");
        names.add("dhansharree");
        names.add("priyanka");


      //use filter to find names whose length is less tha 6 characters
      List<String> list=  names.stream().filter(s->s.length()<=8).collect(Collectors.toList());
      System.out.println(list);

      //convert all names toUpperaCase
        List<String> list2=names.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(list2);

        //list all names in acsenind order
        List<String> list3=names.stream().sorted().collect(Collectors.toList());
        System.out.println(list3);

        //list all names in descdeing order

        List<String> list4=names.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(list4);

        //count total names in list
       Long count= names.stream().count();
       System.out.println(count);

       names.stream().forEach(s-> System.out.println(s+"##"));
       names.stream().forEach(name-> System.out.println(name.replace('a','*')));




    }
}
