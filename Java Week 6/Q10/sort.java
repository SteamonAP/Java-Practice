package Q10;
import java.util.Arrays;
import Q10.bubblesort.Bubble;
import q10.selectionsort.Selection;

public class sort {
    public static void main(String[] args) {
        int[] arr1 = {5, 2, 9, 1, 5, 6};
        int[] arr2 = {5, 2, 9, 1, 5, 6};
       

        Bubble.sort(arr1);

        Selection.sort(arr2);

        System.out.println("Sorted array using Bubble Sort: " +Arrays.toString(arr1));
        System.out.println("Sorted array using Selection Sort: " +Arrays.toString(arr2));
    }    
}


