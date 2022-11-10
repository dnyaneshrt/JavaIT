package exception;

import java.util.Arrays;

public class ArrayTest1 {
    public static void main(String[] args) {

        try {
            int[] nums = new int[5];

            nums[0] = 100;
            nums[4] = 500;
            nums[5] = 800;
            System.out.println(Arrays.toString(nums));
        }catch(Exception e)
        {
            e.printStackTrace();
        }
         /*   finally
            {
                System.out.println("i am from finally block");
            }*/
        System.out.println("imp code");


    }
}
