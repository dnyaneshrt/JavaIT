package oops;

//final,overriding.
class Parent
{
    public void property()
    {
        System.out.println("car,money,bank balance");
    }
   final public void marriage()
    {
        System.out.println("pushpanjali/geetanjali/patanjali");
    }
}
class Deepak extends Parent
{
   /* public void marriage()
    {
        System.out.println("harshali/aishwayra");
    }*/
}

public class MethodOverridingTest {

    public static void main(String[] args) {
        Deepak d=new Deepak();
        d.property();
        d.marriage();
    }

}
