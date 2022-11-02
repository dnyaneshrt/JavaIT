package array_programs;

import java.util.Scanner;

public class ArrayTest4 {
    public static void main(String[] args) {
        int[] nums=new int[10];
        System.out.println("please enter array values");
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=new Scanner(System.in).nextInt();

        }
        //print array values at only even index locations

        System.out.println("even numbers from my array is:");
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]%2==0)
            System.out.println(nums[i]);

        }
    }
}
