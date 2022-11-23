package mutlithreading;

class Test
{
    int num;
    public void put(int num)
    {
        this.num=num;
        System.out.println("put: "+this.num);
    }
    public void get(int num)
    {
        this.num=num;
        System.out.println("get: "+this.num);
    }
}

class Producer
{
    Test test;

    public Producer(Test test) {
        this.test = test;
        producer();
    }

    public synchronized void producer()
    {
        Thread t1=new Thread(()->{
            for(int i=1;i<=50;i++) {
                test.put(i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                try {
                    Thread.currentThread().wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
//            notify();
        });
        t1.start();
    }

}

class Consumer
{
    Test test;
    public Consumer(Test test) {
        this.test = test;
        consumer();
    }
    public synchronized void consumer() {
        Thread t2=new Thread(()->{
            for(int i=1;i<=50;i++) {
                test.get(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                try {
                    Thread.currentThread().wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
//            notify();
        });
        t2.start();
    }

}
public class ThreadDemo12 {
    public static void main(String[] args) {
    new Producer(new Test());
        try {
            Thread.sleep(20);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        new Consumer(new Test());

    }
}
