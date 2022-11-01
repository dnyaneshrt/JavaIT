package array_programs;

public class ArrayTest3 {
    public static void main(String args[]) {
        //Array initialiazation
        String names[]={"vaibhav","dhansharee","dnyanehswar","aniket","pooja"};

        for(String n:names)
        {
            System.out.println(n.toUpperCase());
        }
        System.out.println("total names in an arrray is :"+names.length);
    }
}
