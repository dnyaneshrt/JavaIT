package mutlithreading;

public class ThreadDemo7 {
    public static void main(String[] args) {
       new Thread(()-> {
            for(int i=1;i<=10;i++)
            {
                System.out.println("Java");
                try { Thread.sleep(1000);  } catch (InterruptedException e) { throw new RuntimeException(e);}
            }
        }).start();
        try { Thread.sleep(50);  } catch (InterruptedException e) { throw new RuntimeException(e);}
        new Thread(()->{
            for(int i=1;i<=10;i++)
            {
                System.out.println("Android");
                try { Thread.sleep(1000);  } catch (InterruptedException e) { throw new RuntimeException(e);}
            }
        }).start();


    }
}
