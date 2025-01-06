public class Week4Q1 {
    public static void main(String[] args) {
        System.out.println("Numbers between 1000 and 2000 that are divisible by 8 and multiple of 5:\n");

        for (int number = 1000; number <= 2000; number++) {
            if (number % 8 == 0 && number % 5 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}
