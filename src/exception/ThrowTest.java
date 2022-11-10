package exception;

import java.util.Scanner;

public class ThrowTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter usename:");
        String username = sc.nextLine();

        System.out.println("enter password:");
        String password = sc.nextLine();


        if (username.trim().equalsIgnoreCase("java") && password.trim().equals("abc123")) {
            System.out.println("welcome");
        } else {
            try {
                throw new InvalidCredentialsException();
            } catch (InvalidCredentialsException e) {
                throw new RuntimeException(e);
            }
        }

    }
    }
