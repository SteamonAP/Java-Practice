import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Week5Q3 {
    public static void printEvenNumbers(List<Integer> numbers) {
        System.out.println("Even numbers in the list:");
        for (int num : numbers) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numberList = new ArrayList<>();
        System.out.println("Enter a list of numbers:");
        while (true) {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            if (num == 0) {
                break;
            }
            numberList.add(num);
        }
        printEvenNumbers(numberList);
        scanner.close();
    }
}
