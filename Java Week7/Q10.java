class Process extends Thread {
    private int processNumber;

    public Process(int processNumber) {
        this.processNumber = processNumber;
    }

    @Override
    public void run() {
        System.out.println("Process " + processNumber + " is running");
    }
}

public class Q10 {
    public static void main(String[] args) {
        Process process1 = new Process(1);
        Process process2 = new Process(2);
        Process process3 = new Process(3);
        Process process4 = new Process(4);
        Process process5 = new Process(5);

        process1.setPriority(Thread.MIN_PRIORITY);
        process2.setPriority(Thread.NORM_PRIORITY);
        process3.setPriority(Thread.NORM_PRIORITY);
        process4.setPriority(Thread.NORM_PRIORITY);
        process5.setPriority(Thread.MAX_PRIORITY);

        process1.start();
        process2.start();
        process3.start();
        process4.start();
        process5.start();
    }
}