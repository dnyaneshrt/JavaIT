package java8;


import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

//sort Integer using Stream
public class StreamTest5 {



    public static void main(String[] args) {

        int number = 4214;
        sortNumber(number);
        System.out.println();
        reverseNumber(number);

    }

    private static void reverseNumber(int number) {
        int sum=0;
        List<Integer> numbers = new LinkedList<>();
        for (int i = number; i > 0; i /= 10)
            sum=(sum*10)+(i % 10);

        System.out.println(sum);
    }

    private static void sortNumber(int number) {

        List<Integer> numbers = new LinkedList<>(); // a LinkedList is not backed by an array
        for (int i = number; i > 0; i /= 10)
            numbers.add(i % 10);

        numbers.stream().sorted().forEach(System.out::print); // or for you forEach(IO::println)


    }
}
