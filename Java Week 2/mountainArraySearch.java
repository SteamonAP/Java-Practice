/**
 * Reference Template — Find in Mountain Array
 * 
 * Pattern:
 * 1) Find peak in a mountain array
 * 2) Binary search on left (ascending)
 * 3) Binary search on right (descending)
 *
 * Time: O(log n)
 * Space: O(1)
 */

interface MountainArray {
    int get(int index);

    int length();
}

public class mountainArraySearch {

    public int findInMountainArray(int target, MountainArray arr) {
        int peak = findPeak(arr);

        int leftResult = binarySearchAsc(arr, 0, peak, target);
        if (leftResult != -1) {
            return leftResult;
        }
        return binarySearchDesc(arr, peak + 1, arr.length() - 1, target);
    }

    private int findPeak(MountainArray arr) {
        int left = 0;
        int right = arr.length() - 1;

        while (left < right) {

            int mid = left + (right - left) / 2;
            if (arr.get(mid) < arr.get(mid + 1)) {
                left = mid + 1;
            } else {
                right = mid;
            }

        }
        return left;
    }

    private int binarySearchAsc(MountainArray arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int val = arr.get(mid);
            if (target < val) {
                right = mid - 1;
            } else if (target > val) {
                left = mid + 1;
            } else {
                return mid;
            }

        }
        return -1;
    }

    private int binarySearchDesc(MountainArray arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int val = arr.get(mid);
            if (target < val) {
                left = mid + 1;
            } else if (target > val) {
                right = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;
    }
}