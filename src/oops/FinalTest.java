package oops;
/*
final variables we cannot re-assign
final methods cannot be overridden
final classes cannot have child classes
*/
 class FinalMethodTest
{
    public final void methodTest()
    {
        System.out.println("i am from FinalMethodTest class");
    }
}

public class FinalTest extends FinalMethodTest{

  /*we cannot override final methods.
    public void methodTest()
    {
        System.out.println("i am from FinalMethodTest class");
    }
*/
    public static void main(String[] args) {
       varTest();
    }

    private static void varTest() {
        final int num=10;
        //  num=15; we cannot modify the final variables value.
        System.out.println(num);
    }
}
