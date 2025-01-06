import java.util.Scanner;

public class Week5Q10 {
    public static int countUniqueValues(int[] arr) {
        int count = 0;
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (!visited[i]) {
                count++;
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        visited[j] = true;
                    }
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[15];
        for (int i = 0; i < 15; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        int uniqueCount = countUniqueValues(arr);
        System.out.println("Number of unique values in the array: " + uniqueCount);
    }
}
