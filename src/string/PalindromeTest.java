package string;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("please enter any String:");
        String name=sc.nextLine();

        String rev="";

        for(int i=name.length()-1;i>=0;i--)
        {
            rev=rev+name.charAt(i);
        }
        System.out.println("name after reversing : "+rev);

        if(rev.equals(name))
            System.out.println("palindrome string");
        else
            System.out.println("is's not palindrome String");
    }
}
