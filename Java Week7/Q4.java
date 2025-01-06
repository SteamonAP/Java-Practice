class MyThread extends Thread {
    public MyThread(String name) {
        super(name);
    }

    public void run() {
        for (int i = 5; i >= 1; i--) {
            try {
                Thread.sleep(6000); // Sleep for 6 seconds
                System.out.println(getName() + " Count: " + i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Q4 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");

        MyThread thread3 = new MyThread("Thread 3");
        MyThread thread4 = new MyThread("Thread 4");
        MyThread thread5 = new MyThread("Thread 5");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }

}