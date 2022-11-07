package string;

public class StringTest2 {
    public static void main(String[] args) {
        String testString="In Java, the String equals() method compares the two given strings based on the data/content of the string. If all the contents of both the strings are the same, it returns true. If all characters are not matched, then it returns false. ";
        System.out.println("length of above String is= "+  testString.length());

        //split() method

       String[] words= testString.split(" ");
       System.out.println("total number of words are there in above String = "+words.length);
       int i=0;
       for(String word:words)
       {
           i++;
           System.out.println(i+":"+word);
       }

    /*    String[] ws= testString.split("t");
        System.out.println(ws.length);*/

        if(testString.contains("method"))
            System.out.println("String is avaiable");
        else
            System.out.println("String is not available");

        if(testString.contains("methodZZ"))
            System.out.println("String is avaiable");
        else
            System.out.println("String is not available");

        System.out.println(testString.toLowerCase());
        System.out.println(testString.toUpperCase());

        System.out.println("the char at index no. 3 : "+testString.charAt(3));
        System.out.println("the char at index no. 2 : "+testString.charAt(2));
        System.out.println("the char at index no. 4 : "+testString.charAt(4));


        System.out.println("index of char 'J' is: "+testString.indexOf('J'));
        System.out.println("index of char 'a' is: "+testString.indexOf('a'));

        System.out.println("String after substring:");
        System.out.println(testString.substring(15));
        System.out.println(testString.substring(5,15));

        System.out.println(testString.isEmpty());
        String test="";
        System.out.println(test.isEmpty());


    }
}
