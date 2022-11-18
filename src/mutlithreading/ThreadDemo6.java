package mutlithreading;

public class ThreadDemo6 {
        public static void main(String[] args) {
        Thread thread1=new Thread(()-> {
            for(int i=1;i<=10;i++)
            {
                System.out.println("Java");
                try { Thread.sleep(1000);  } catch (InterruptedException e) { throw new RuntimeException(e);}
            }
        });
        Thread thread2=new Thread(()->{
            for(int i=1;i<=10;i++)
            {
                System.out.println("Android");
                try { Thread.sleep(1000);  } catch (InterruptedException e) { throw new RuntimeException(e);}
            }
        });
        thread1.start();//to start the thread
        try { Thread.sleep(50);  } catch (InterruptedException e) { throw new RuntimeException(e);}
        thread2.start();//start method internally calls run() method
    }
    }

