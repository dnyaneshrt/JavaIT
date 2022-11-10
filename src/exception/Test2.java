package exception;

//thorws is used to declare an exception
public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        for(int i=1;i<=10;i++)
        {
           Thread.sleep(500);
            System.out.println(i);
        }

    }
}
