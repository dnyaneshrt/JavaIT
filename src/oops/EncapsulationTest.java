package oops;

import java.util.Scanner;

class Student
{

    private int age;
    private String name;
    private char gender;
    Scanner sc;

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if(age<0)
        {
            System.out.println("invalid age");
            sc=new Scanner(System.in);
            System.out.println("please enter valid age:");
            age=sc.nextInt();
        }
        {
            this.age = age;
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length()>15)
        {
            System.out.println("invalid length");
            sc=new Scanner(System.in);
            System.out.println("please enter valid name:");
            name=sc.next();
        }
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

}
public class EncapsulationTest {

    public static void main(String[] args) {
        Student vaibhav=new Student();
//      vaibhav.age=23;
//        vaibhav.age=-23;
//        vaibhav.name="asdddddddddddddddddddddddddddddddddddddddddddddddddddddddddd";
//        vaibhav.gender='A';
        vaibhav.setAge(20);
        System.out.println(vaibhav.getAge());
        vaibhav.setName("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA");
        System.out.println(vaibhav.getName());

        vaibhav.setGender('M');
        System.out.println(vaibhav.getGender());
    }
}
