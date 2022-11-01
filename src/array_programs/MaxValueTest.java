package array_programs;

import java.util.Scanner;

public class MaxValueTest {
    public static void main(String[] args) {
        int[] nums=new int[5];
        System.out.println("please enter array values");
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=new Scanner(System.in).nextInt();

        }
        int max=nums[0];
        for(int i=0;i<nums.length;i++)
        {
          if(max<nums[i])
          {
              max=nums[i];
          }

        }
        System.out.println("max value from above array is: "+max);
    }
}
