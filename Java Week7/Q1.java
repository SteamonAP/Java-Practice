import java.util.Random;

class RandomNumberGenerator implements Runnable {
    @Override
    public void run() {
        Random random = new Random();
        while (true) {
            int randomNumber = random.nextInt(100); // Generates a random integer between 0 and 99
                                                    // System.out.println("Generated: " + randomNumber);

            if (randomNumber % 2 == 0) {
                SecondThread.square(randomNumber);
            } else {
                ThirdThread.cube(randomNumber);
            }

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class SecondThread {
    public static synchronized void square(int number) {

        int square = number * number;
        System.out.println("Square: " + square);

    }

}

class ThirdThread {
    public static synchronized void cube(int number) {
        int cube = number * number * number;
        System.out.println("Cube: " + cube);
    }
}

public class Q1 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new RandomNumberGenerator());

        t1.start();
    }
}