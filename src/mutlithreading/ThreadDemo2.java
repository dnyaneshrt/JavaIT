package mutlithreading;
/*class Java extends Thread
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
class Android extends Thread
{
    public void run()
    {
      printTenTimes();
    }

    private void printTenTimes() {
        for(int i=1;i<=10;i++)
        {
            System.out.println("Android");
            try { Thread.sleep(1000);  } catch (InterruptedException e) { throw new RuntimeException(e);}

        }
    }
}*/
public class ThreadDemo2 {
    public static void main(String[] args) {
     /*  Thread thread1=new Java();//upcasting.
       Thread thread2=new Android();//upcasting.*/
/*
        thread1.start();//to start the thread
        try { Thread.sleep(50);  } catch (InterruptedException e) { throw new RuntimeException(e);}
        thread2.start();//start method internally calls run() method*/

    }
}
