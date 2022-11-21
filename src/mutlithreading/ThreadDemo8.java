package mutlithreading;

public class ThreadDemo8 {
    public static void main(String[] args) throws InterruptedException {
    /*    Thread thread1=new Thread(()-> {
            for(int i=1;i<=10;i++)
            {
                System.out.println("Java");
                try { Thread.sleep(500);  } catch (InterruptedException e) { throw new RuntimeException(e);}
            }
        });
        Thread thread2=new Thread(()->{
            for(int i=1;i<=10;i++)
            {
                System.out.println("Android");
                try { Thread.sleep(500);  } catch (InterruptedException e) { throw new RuntimeException(e);}
            }
        });*/
        Thread thread1=new Thread(()-> {
            for(int i=1;i<=10;i++)
            {
                System.out.println("Java");
                try { Thread.sleep(500);  } catch (InterruptedException e) { throw new RuntimeException(e);}
            }
        },"Java Thread");

        Thread thread2=new Thread(()->{
            for(int i=1;i<=10;i++)
            {
                System.out.println("Android");
                try { Thread.sleep(500);  } catch (InterruptedException e) { throw new RuntimeException(e);}
            }
        },"Android Thread");

    /*   thread1.setName("Java Thread");
        thread2.setName("Android Thread");*/
        System.out.println(thread1.getName());
        System.out.println(thread2.getName());

        System.out.println("Thread priorities:");
        System.out.println(thread1.getPriority());//normal priorities
        System.out.println(thread2.getPriority());

        thread1.setPriority(1);
        System.out.println("Java Thread Priority is "+thread1.getPriority());
        thread1.setPriority(Thread.MAX_PRIORITY);
        System.out.println("Java Thread Priority is MAX  "+thread1.getPriority());
        thread1.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Java Thread Priority is NORM  "+thread1.getPriority());
        thread1.setPriority(Thread.NORM_PRIORITY);

        thread1.start();//to start the thread
        try { Thread.sleep(50);  } catch (InterruptedException e) { throw new RuntimeException(e);}
        thread2.start();//start method internally calls run() method

        thread1.join();
        thread2.join();

        System.out.println("bye bye!!");
    }
}
