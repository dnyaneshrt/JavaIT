package array_programs;

import java.util.Scanner;

public class ArrayTest2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        float[] marks=new float[5];
        System.out.println("please enter marks for 5 students");
           for(int i=0;i< marks.length;i++)
           {
               marks[i]=sc.nextFloat();
           }
        System.out.println("marks are as follow: ");
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
    }
}
