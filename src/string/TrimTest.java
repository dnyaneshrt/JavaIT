package string;

import java.util.Scanner;

public class TrimTest {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("enter usename:");
        String username=sc.nextLine();

        System.out.println("enter password:");
        String password=sc.nextLine();

      System.out.println("length od username :"+username.length());
      System.out.println("length od password :"+password.length());

        if(username.trim().equalsIgnoreCase("java")&&password.trim().equals("abc123"))
        {
            System.out.println("welcome");
        }else {
            System.out.println("invalid user!!! try again.");
        }
        System.out.println("length od username :"+username.trim().length());
        System.out.println("length od password :"+password.trim().length());

    }
}
