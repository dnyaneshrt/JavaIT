package array_programs;

//toString() method java.

import java.util.Arrays;

public class ArrayTest6 {

    @Override
    public String toString() {
        return "this is my object";
    }

    public static void main(String[] args) {
        String[] names=new String[]{"Aniket","vaibhav","raghuveer","dhanshree1","dhanashree2","dnyaneshwar","priyanka","deepak"};
        System.out.println(Arrays.toString(names));

        ArrayTest6 at6=new ArrayTest6();
        System.out.println(at6);//internally toString() method calls always
    }
}
