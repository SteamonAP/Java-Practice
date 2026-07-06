import java.util.*;

public class AvgWaitingTime {
    public static double avgWait(int[] arr) {
        Arrays.sort(arr);
        
        int currTime = 0;
        int waitTime = 0;

        for (int burst : arr) {
            waitTime += currTime;
            currTime += burst;
        }

        return (double) waitTime / arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {4,3,7,1,2};
        System.out.println(avgWait(arr));
    }
}
