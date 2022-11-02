package array_programs;

import java.util.Scanner;

public class ArrayTest5 {
    public static void main(String[] args) {

        boolean flag=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter size of array");
        int size=sc.nextInt();

        String names[]=new String[size];
        System.out.println("enter student names");
        for(int i=0;i< names.length;i++)
        {
            names[i]=sc.next();
        }
        System.out.println("check pooja is avaiable in above array");
        for(int i=0;i< names.length;i++)
        {
            if(names[i].equals("pooja"))
            {
              flag=true;
            }

        }
       if(flag)
           System.out.println("present");
       else
           System.out.println("it's absent");
    }
}
