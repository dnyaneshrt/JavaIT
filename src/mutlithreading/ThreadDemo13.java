package mutlithreading;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;

class GoodMorning
{ /*    public static boolean isMorning(Calendar time) {
        if (time == null) {
            return false;
        }
        int hour = time.get(Calendar.HOUR_OF_DAY);
        return hour >= 6 && hour <= 10;
    }*/
    public synchronized void sayGoodMorning() throws InterruptedException {
        int i=1;
        while(i<=50)
        {
         if(i%2!=0)
         {
                 System.out.println("Good Morning Thread");
                 Thread.sleep(300);
                    wait();
          }
            notify();
            i++;

        }
    }
    public synchronized void sayGoodEvening() throws InterruptedException {
        int i=1;
        while(i<=50)
        {
            if(i%2==0)
            {
                System.out.println("Good Evening Thread \n");
                Thread.sleep(3000);
                wait();
            }
            notify();
            i++;
        }
    }
}



public class ThreadDemo13 {
    public static void main(String[] args) throws InterruptedException {
        GoodMorning gm_obj=new GoodMorning();
        Thread gm=new Thread(()->{
            try {
                gm_obj.sayGoodMorning();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread ge=new Thread(()->{
            try {
                gm_obj.sayGoodEvening();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        gm.start();

        Thread.sleep(20);

        ge.start();


    }
}
