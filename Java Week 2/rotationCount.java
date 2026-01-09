public class rotationCount {
    public static void main(String[] args) {
        int arr[] = { 12 ,15, 18, 2, 3, 6 };
        int ans = findKRotation(arr);

        System.out.println("Number of rotations : " + ans);
    }

    static int findKRotation(int[] arr) {
        if (arr == null || arr.length == 0) return -1;
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[end]) {
                start = mid + 1;
            } else if (arr[mid] < arr[end]) {
                end = mid;
            } else {
                end--;
            }
            
        }
        return start;
    }
}
