/*
package mutlithreading;

class Java implements Runnable
{

    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Java");
            try { Thread.sleep(1000);  } catch (InterruptedException e) { throw new RuntimeException(e);}
        }
    }

}

class Android implements Runnable
{
    public void run()
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Android");
            try { Thread.sleep(1000);  } catch (InterruptedException e) { throw new RuntimeException(e);}

        }
    }

}
public class ThreadDemo3 {
    public static void main(String[] args) {

       Runnable r1=new Java();//upcasting.
       Runnable r2=new Android();//upcasting.

        Thread thread1=new Thread(r1);
        Thread thread2=new Thread(r2);

        thread1.start();//to start the thread
        try { Thread.sleep(50);  } catch (InterruptedException e) { throw new RuntimeException(e);}
        thread2.start();//start method internally calls run() method
    }
}
*/
