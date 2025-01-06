import java.util.Scanner;

class Q8 {
    private String k;
    private char c;

    public Q8(String k, char c) {
        this.k = k;
        this.c = c;
    }

    public void display() {
        System.out.println("Thread " + Thread.currentThread().getName() + ": k = " + k + ", c = " + c);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String k = scanner.nextLine();
        System.out.print("Enter a Character: ");
        char c = scanner.next().charAt(0);
        Q8 q8obj = new Q8(k, c);

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                q8obj.display();
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                q8obj.display();
            }
        });

        thread1.setName("ThreadA");
        thread2.setName("ThreadB");

        thread1.start();
        thread2.start();

        scanner.close();
    }
}
