class MyThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Thread name after sleep: " + this.getName());
    }
}

public class Q3 {
    public static void main(String[] args) {

        MyThread myThread = new MyThread();
        myThread.start();
    }
}
