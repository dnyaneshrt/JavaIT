package mutlithreading;

public class ThreadDemo10 {
    public static void main(String[] args) {
        Thread t1=new Thread(()->
        {
            for(int i=1;i<=50;i++)
            {
                if(i%2!=0)
                {
                    System.out.println(Thread.currentThread().getName()+":"+i);
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        },"odd");
        Thread t2=new Thread(()->
        {
            for(int i=1;i<=50;i++)
            {
                if(i%2==0)
                {
                    System.out.println(Thread.currentThread().getName()+":"+i);
                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        },"even");
        t1.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        t2.start();
    }
}
