package java8;


interface  LTest
{
//    int addNumbers(int a, int b, int c);
//    int findSquare(int num);
//    int findLength(String name);
    void findMaxNumFromArray(int[] arr);
}
public class LamdaTest2{
    public static void main(String[] args) {

      /*  LTest l=(a,b)->{
            System.out.println("addtion of above two numbers are:"+(a+b));
        };*/

    /*    LTest l=(a,b,c)-> a+b+c;

        System.out.println( l.addNumbers(50,65,5));*/

     /*   LTest l1=(s)->s*s;
        System.out.println(l1.findSquare(5));*/
        /*LTest l1=(s)->s.length();*/

        //LISP is first language supported functional programming.

   /*     LTest l1=s->s.length();
        System.out.println(l1.findLength("dhanshree"));*/

        LTest l1=arr->{
            int max=arr[0];
            for(int i=0;i< arr.length;i++)
            {
                if(max<arr[i])
                {
                    max=arr[i];
                }
            }
            System.out.println("Max number from given array is "+max);
        };
        int[] arr={78,45,26,79,111,35};
        l1.findMaxNumFromArray(arr);
    }
}