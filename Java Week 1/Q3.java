//occurance 

import java.util.Scanner;

public class Q3 {

    public static int count(int ocn){
        int num = 738318863;
        int count = 0;

        while (num > 0) {
            int rem = num % 10;
            if (rem == ocn){
                count++;
            }
            num = num / 10;
            
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int ocn = inp.nextInt();
        System.out.println("The Occurance of the inputed num in the list is: " + count(ocn));
    }
    
}
