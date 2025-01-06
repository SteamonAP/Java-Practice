class CustomThread extends Thread {
    private int sleepTime;

    public CustomThread(int sleepTime) {
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        try {
            System.out.println("Thread sleeping for " + sleepTime + " milliseconds.");
            Thread.sleep(sleepTime);
            System.out.println("Thread woke up.");
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
    }
}

public class Q9 {
    public static void main(String[] args) {
        int[] sleepTimes = { 10, 20, 50, 70, 100 };

        for (int time : sleepTimes) {

            CustomThread thread = new CustomThread(time);
            thread.start();
        }

    }

}