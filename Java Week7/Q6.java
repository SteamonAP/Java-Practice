import java.util.concurrent.Semaphore;

class Printer {
    private Semaphore semaphore = new Semaphore(1);

    public void printJob(String job) {
        try {
            semaphore.acquire();
            System.out.println("Printing: " + job);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }
}

class PrintJobThread extends Thread {
    private Printer printer;
    private String job;

    public PrintJobThread(Printer printer, String job) {
        this.printer = printer;
        this.job = job;
    }

    @Override
    public void run() {
        printer.printJob(job);
    }
}

public class Q6 {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread job1 = new PrintJobThread(printer, "Job 1");
        Thread job2 = new PrintJobThread(printer, "Job 2");
        Thread job3 = new PrintJobThread(printer, "Job 3");
        job1.start();
        job2.start();
        job3.start();
    }
}
