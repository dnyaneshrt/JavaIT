package oops;


interface AnimalEat
{
    void eat();
}
interface AnimalRun
{
    void eat();
    void run();

}
//multiple inheritance
class Animal implements AnimalEat,AnimalRun
{

    @Override
    public void eat() {
        System.out.println("animal eats");
    }

    @Override
    public void run() {
        System.out.println("animal runs");
    }
}
public class MultipleInHeritanceTest {
    public static void main(String[] args) {
       Animal tiger=new Animal();
       tiger.eat();
       tiger.run();
    }
}
