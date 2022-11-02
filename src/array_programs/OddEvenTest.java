package array_programs;

import java.util.Scanner;

public class OddEvenTest {
    public static void main(String[] args) {
        System.out.println("please enter any number");
        int num=new Scanner(System.in).nextInt();

      /*  if(num%2==0)
            System.out.println("even");
        else
            System.out.println("odd");*/

//        System.out.println((num%2==0)?"even":"odd");

        System.out.println(((num&1)==0)?"even number":"odd number");

    }
}
