package string;

import java.util.Arrays;
import java.util.Scanner;

public class UpperLowerTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("please enter any String:");
        String name=sc.nextLine();

        char[] chars=name.toCharArray();
        String temp="";
        for(int i=0;i<chars.length;i++)
        {
            if(i%2==0)
            {
               temp=temp+Character.toUpperCase(chars[i]);
            }else {
               temp=temp+Character.toLowerCase(chars[i]);
            }
        }
        System.out.println(temp);
    }
}
