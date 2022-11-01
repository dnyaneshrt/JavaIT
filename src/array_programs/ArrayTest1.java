package array_programs;


import java.util.Scanner;

//array is collection of same type of data elements.
//array stores in contiguos memory location.
//array index always starts with 0, ends with arraysize-1.
//just after declaring an array it initializes with default values of that type of array.

public class ArrayTest1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please enter size of array:");
        int size=sc.nextInt();

        String[] names=new String[size];//array declaration

        names[4]="vaibhav";//intialize
        names[2]="pooja";

        System.out.println("the array elements are as follows:");

        for(int i=0;i<names.length;i++)
        {
            System.out.println(names[i]);//0,1,2,3,4
        }
        System.out.println("size of above array is :"+names.length);


        System.out.println("value at index number 4 is :"+names[4]);
        System.out.println("value at index number 2 is :"+names[2]);

        System.out.println("below array elemets using for each loop ");
        for(String name:names)
        {
            System.out.println(name);
        }


    }
}
