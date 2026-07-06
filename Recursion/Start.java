import java.util.*;

public class Start {
    public static void main(String[] args) {
        // write a fn that prints hllow wrld
        print(5);
        // nums(5);
    }

    static void print(int n) {
        if(n == 0){
            return;
        }
        print(n-1);
        System.out.println(n);
    }
    

    // public static void nums(int num) {
        
    //     for (int i = 1; i <= num; i++) {
    //         System.out.print(i + ",");
    //     }
    // }
    
}
