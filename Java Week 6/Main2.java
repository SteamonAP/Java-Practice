interface Sortable {
    void sort(int[] arr);
}

class BubbleSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
}

class SelectionSort implements Sortable {
    @Override
    public void sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}

public class Main2 {
    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };

        Sortable bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);
        System.out.println("Sorted using Bubble Sort:");
        printArray(arr);

        // Reset the array
        arr = new int[] { 64, 25, 12, 22, 11 };

        Sortable selectionSort = new SelectionSort();
        selectionSort.sort(arr);
        System.out.println("Sorted using Selection Sort:");
        printArray(arr);
    }

    static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
