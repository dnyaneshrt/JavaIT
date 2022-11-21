package mutlithreading;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Calendar;

class Counter
{
    int count;
   //at a time only one thread can access this method
    public synchronized void increment()
    {
        count++;//count=count+1
    }
}
public class ThreadDemo9 {
    public static void main(String[] args) throws InterruptedException {
        Counter c1=new Counter();

        Thread t1=new Thread(()->{
            for(int i=1;i<=5000;i++)
            {
                c1.increment();
            }
        });
        Thread t2=new Thread(()->{
            for(int i=1;i<=5000;i++)
            {
                c1.increment();
            }
        });
        Thread t3=new Thread(()->{
            for(int i=1;i<=5000;i++)
            {
                c1.increment();
            }
        });

        t1.start();
        t2.start();
        t3.start();

//        System.out.println(t1.isAlive());
        t1.join();
        t2.join();
        t3.join();
//        System.out.println(t1.isAlive());

        System.out.println("count: "+c1.count);
    }
}
