package array_programs;

import java.util.Scanner;

public class BubbleSortTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("please enter the size of array");
        int size=sc.nextInt();

        int[] nums=new int[size];

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
//         BubbleSortTest.sortAsc(nums);//calling method by passing array
        sortAsc(nums);

        System.out.println("array values after sorting in descending order");
        sortDesc(nums);
    }

    private static void sortDesc(int[] nums) {

        for(int i=0;i< nums.length;i++)
        {
            for(int j=0;j< nums.length-1-i;j++)
            {
                int temp;
                if(nums[j]<nums[j+1])
                {
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;

                }
            }
        }
        for(int i=0;i< nums.length;i++)
        {
            System.out.println(nums[i]);
        }

    }

    private static void sortAsc(int[] nums) {

        for(int i=0;i< nums.length;i++)
        {
            for(int j=0;j< nums.length-1;j++)
            {
                int temp;
                if(nums[j]>nums[j+1])
                {
                    temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;

                }
            }
        }
        for(int i=0;i< nums.length;i++)
        {
            System.out.println(nums[i]);
        }

    }
}
