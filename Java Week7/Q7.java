class ThreadA extends Thread {
    private String k;
    private int dc;

    public ThreadA(String k) {
        this.k = k;
    }

    public void run() {
        dc = 0;
        for (char c : k.toCharArray()) {
            if (Character.isDigit(c)) {
                dc++;
            }
        }
        System.out.println("ThreadA:" + dc);
    }
}

class ThreadB extends Thread {

    private String k;
    private int cc;

    public ThreadB(String k) {
        this.k = k;
    }

    public void run() {
        cc = 0;
        for (char c : k.toCharArray()) {
            if (Character.isLetter(c)) {
                cc++;
            }
        }
        System.out.println("ThreadB:" + cc);
    }

}

public class Q7 {
    public static void main(String[] args) {
        String k = "Hello123World456";
        ThreadA threadA = new ThreadA(k);
        ThreadB threadB = new ThreadB(k);

        threadA.start();
        threadB.start();
    }
}