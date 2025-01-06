class UserThread extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("User thread is running");
    }
}

public class Q5 {
    public static void main(String[] args) {
        UserThread userThread = new UserThread();
        userThread.start();

        Thread mainThread = Thread.currentThread();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread is running");

        try {
            userThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}