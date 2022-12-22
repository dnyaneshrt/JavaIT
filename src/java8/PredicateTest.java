package java8;

import java.util.function.Predicate;

//write a Predicate to check whether entered number is prime or not?
public class PredicateTest {
    public static void main(String[] args) {

      /*  Predicate<Integer> p2=new Predicate<Integer>() {
            @Override
            public boolean test(Integer num) {
                int count = 0;
                for (int i = 1; i <= num; i++) {
                    if (num % i == 0) {
                        count++;
                    }
                }
                if (count == 2)
                    return true;
                else
                    return false;
            }
        };*/
        Predicate<Integer> p2=num->num>10;


        Predicate<Integer> p1 = num -> {
            int count = 0;
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            if (count == 2)
                return true;
            else
                return false;
        };
        System.out.println(p1.test(7));//true
        System.out.println(p1.test(6));//false
        System.out.println(p1.test(11));//true
        System.out.println(p1.test(14));//false
        System.out.println(p1.test(36));//false
        System.out.println(p1.test(37));//true
        System.out.println(
                p2.and(p1).test(5)
        );
        System.out.println(
                p2.and(p1).test(11)
        );

        System.out.println(
                p2.or(p1).test(5)
        );

    }
}