import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        // int salary = inp.nextInt();

        // if (salary > 10000) {
        //     salary += 2000;
        // } else if (salary > 20000) {
        //     salary += 3000;
        // } else {
        //     salary += 1000;
        // }
        // System.out.println(salary);

        // int n = inp.nextInt();

        // for (int i = 0; i<=n; i++) {
        //     System.out.print(i + " ");

        // }

      //  while (n <= 5) { //use while loop when you don't know hom many times look is going to run
        //     System.out.println(n);
        //     n++;
        // }

        int n = 1;
        //in do while, program exewcute atleast once before checking condition in while 
        do {
            System.out.println(n);
            n++;
        } while (n <= 5);



    }
}
