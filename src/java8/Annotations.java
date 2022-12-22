package java8;


class Parent
{
  public void iAmFromParentClassmethod()
  {
      System.out.println("i am from parent class method");
  }
}
class Child extends Parent
{
    @Override
    public void iAmFromParentClassmethod()
    {
        System.out.println("i am from child class method");
    }
}
public class Annotations {
    public static void main(String[] args) {
        Child child=new Child();

        child.iAmFromParentClassmethod();


    }
}