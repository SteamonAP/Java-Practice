import java.util.*;

public class TargetLinear {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 4, 4, 8, 9 };
        int target = 4;
        // System.out.println(checkTarget(arr,target));
        // ArrayList<Integer> list  = new ArrayList<>();
        // serachlist(arr,target,0,list);
        // System.out.println(list);
        ArrayList<Integer> withoutParam = searchWithoutparaList(arr,target,0);
        System.out.println(withoutParam);
    }

    static int checkTarget(int[] arr,int target) {
        return helper(arr, target, 0);
    }

    static int helper(int[] arr,int target, int idx) {
        if(idx == arr.length){
            return -1;
        }
        if (arr[idx] == target){
            return idx;
        }
        return helper(arr, target, idx + 1);
    }
    static ArrayList<Integer> serachlist(int[] arr,int target, int idx, ArrayList<Integer> list) {
        if(idx == arr.length){
            return list;
        }
        if (arr[idx] == target){
            list.add(idx);
        }
        return serachlist(arr, target, idx + 1,list);
    }


    //Return list without an argument ***
    static ArrayList<Integer> searchWithoutparaList(int[] arr, int target, int idx){
        ArrayList<Integer> list = new ArrayList<>();
        if(idx == arr.length){
            return list;
        }
        if(arr[idx] == target){
            list.add(idx);
        }
        ArrayList<Integer> answersFromBelow = searchWithoutparaList(arr, target, idx + 1);
        list.addAll(answersFromBelow);
        return list;
    }

}
