// import java.util.*;
//Time Complexity : O(n*log(log n))
// public class PrimesinRange {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = Integer.parseInt(sc.nextLine().trim());

//         if (n < 2) {
//             System.out.println("No primes");
//             System.out.println("Count: 0");
//             return;
//         }


//         boolean[] isPrime = new boolean[n+1];

//         for(int i = 2; i < n; i++){
//             isPrime[i] = true;
//         }

//         for (int i = 2; i * i <= n; i++){
//             if (isPrime[i] == true) {
//                 for (int j = i * i; j <= n; j+= i){
//                     isPrime[j] = false;
//                 }
//             }
//         }

//         int sum = 0;
//         int count = 0;
//         for (int i = 2 ; i < n;i++) {
//             if (isPrime[i] == true){
//                 System.out.println(i + " ");
//                 count++;
//                 sum += i;
//             }
//         }
//         System.out.println("Count = " + count);
//         System.out.println("Sum = " + sum);


//     }
// }


// // import java.util.*;

// // class Main {
// //     public static boolean isPrime(int n){
// //         if (n < 2) {
// //             return false;
// //         }
// //         for (int i = 2; i * i <= n ; i++) {
// //             if (n % i == 0) {
// //                 return false;
// //             }
// //         }
        
// //         return true;
// //     }
    
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
        
// //         int n = Integer.parseInt(sc.nextLine().trim());
        
// //         int count = 0;
// //         int sum = 0;
// //         int idx = 2;
// //         while (count < n){
// //             if (isPrime(idx)){
                
// //                 sum += idx;
// //                 count++;
// //             }
// //             idx++;
// //         }
        
// //         System.out.print("Sum :" + sum);
// //     }
// // }


// //Primes in Range

// // import java.util.*;

// // class Main {
// //     public static void main(String[] args){
// //         Scanner sc = new Scanner(System.in);
        
// //         int start = Integer.parseInt(sc.nextLine().trim());
// //         int end = Integer.parseInt(sc.nextLine().trim());
        
// //         if (end < 2 || start > end){
// //             System.out.println("No Primes");
// //             System.out.println("Count = 0");
// //             System.out.println("SUm = 0");
// //             return;
// //         }
        
// //         if (start < 2){
// //             start = 2;
// //         }
        
// //         int count = 0;
// //         int sum = 0;
        
// //         for (int i = start ; i <= end; i++){
// //             boolean isPrime = true;
// //             for (int j = 2; j * j <= i; j++){
// //                 if (i%j == 0){
// //                     isPrime = false;
// //                     break;
// //                 }
// //             }
// //             if (isPrime){
// //                 System.out.print(i + " ");
// //                 count++;
// //                 sum +=i;
// //             }
// //         }
        
// //         System.out.println();
// //         System.out.println("Count = " + count);
// //         System.out.println("Sum = " + sum);
// //     }
// // }


import java.util.*;

class PrimesinRange {
    
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++){
            if (n % i == 0){
                return false;
            }
        }
        
        return true;
    }
    
    public static int ntPrime(int n) {
        int count = 0;
        int num = 1;
        
        while (count < n){
            if (isPrime(num)){
                count++;
            }
            num++;
        }
        
        return num - 1;
    }
    
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        String firstLine = sc.nextLine().trim();
        String[] parts = firstLine.split("\\s+");
        int n = Integer.parseInt(parts[0]);
        int m = Integer.parseInt(parts[1]);
        
        int n1 = ntPrime(n);
        int m1 = ntPrime(m);
        System.out.println(n1);
        System.out.println(m1);
        
        int answer = (n1 * m1) - 1;
        
        System.out.print(answer);
        
        
        
    }
}