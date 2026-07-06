import java.util.*;

class BookAllocation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] arr = new int[n];
        
        String arrLine = sc.nextLine().trim();
        arrLine = arrLine.replaceAll("[\\[\\]{}()]","");
        String[] vals = arrLine.split("[\\s,]+");
        
        for(int i = 0 ; i < n; i++){
            arr[i] = Integer.parseInt(vals[i]);
        }
        int m = Integer.parseInt(sc.nextLine().trim());

        
        
        int maxPage = arr[0];
        for (int i = 1; i < n; i++){
            if(arr[i] > maxPage){
                maxPage = arr[i];
            }
        }
        
        int sumationPage = 0;
        for(int i = 0; i < n;i++){
            sumationPage += arr[i];
        }
        //Brute Force
        // for (int pages = maxPage; pages <= sumationPage; pages++){
        //     int cntS = countStudent(arr,pages);
        //     if (cntS == m){
        //         System.out.print(pages);
        //         break;
        //     }
        // }

        while (maxPage <= sumationPage){
            int mid = (maxPage + sumationPage) / 2;
            int cntStudents = countStudent(arr, mid);
            if (cntStudents > m){
                maxPage = mid + 1;
            }else {
                sumationPage = mid - 1;
            }
        }
        System.out.print(maxPage);
    }
    
    public static int countStudent(int[] arr, int pages){
        int cntStudents = 1;
        int pageStudent = 0;
        int n = arr.length;
        for (int i = 0; i < n;i++){
            if(pageStudent + arr[i] <= pages){
                pageStudent += arr[i];
            } else {
                cntStudents++;
                pageStudent = arr[i];
            }
        }
        return cntStudents;
    }
}