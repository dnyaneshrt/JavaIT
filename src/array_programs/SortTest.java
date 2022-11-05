package array_programs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortTest {
    public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);

            System.out.println("please enter the size of array");
            int size=sc.nextInt();

            Integer[] nums=new Integer[size];

            System.out.println("please enter array values");
            for(int i=0;i< nums.length;i++)
            {
                nums[i]=sc.nextInt();
            }

            System.out.println("array values before sorting");
            for(int i=0;i< nums.length;i++)
            {
                System.out.println(nums[i]);
            }
            System.out.println("array values after sorting in ascending order");
//            Arrays.sort(nums);//sorting array in asc
             Collections.sort(Arrays.asList(nums));
                for(int i=0;i< nums.length;i++)
                {
                    System.out.println(nums[i]);
                }


         Arrays.sort(nums,Collections.reverseOrder());//sorting arrray in desc
        System.out.println("array values after sorting in Descdeing order");

        for(int i=0;i< nums.length;i++)
        {
            System.out.println(nums[i]);
        }

    }
}
