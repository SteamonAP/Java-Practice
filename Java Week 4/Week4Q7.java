public class Week4Q7 {
    public static void main(String[] args) {
        System.out.println("Numbers with all even digits between 100 and 400:");

        for (int i = 100; i <= 400; i++) {
            if (hasAllEvenDigits(i)) {
                System.out.print(i);
                if (i != 400) {
                    System.out.print(", ");
                }
            }
        }
    }

    public static boolean hasAllEvenDigits(int num) {
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 != 0) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
