import java.util.Scanner;

public class cases {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // String fruit = in.next();

        // switch (fruit) {
        //     case "Mango":
        //         System.out.println("King of fruits");
        //         break;
        //     case "Apple":
        //         System.out.println("Keeps Doc away");
        //         break;
        //     case "Orange":
        //         System.out.println("Door hinge");
        //         break;
        //     case "cherry":
        //         System.out.println("Cherry on top");
        //         break;
        //     default:
        //         System.out.println("Pls mention a fruit");
        // }

        // int day = in.nextInt();

        // switch (day) {
        //     case 1, 2, 3, 4, 5 -> System.out.println("Weekday");
        //     case 6, 7 -> System.out.println("Weekend");
        // }


        int empId = in.nextInt();

        String department = in.next();

        switch (empId) {
            case 1:
                System.out.println("Amogh P");
                break;
            case 2:
                System.out.println("Steamon");
                break;
            case 3:
                System.out.println("You chose EmpID: 3");
                switch (department) {
                    case "IT":
                        System.out.println("Printing nested IT dep");
                        break;
                    case "Management":
                        System.out.println("management of the Consultant");
                        break;
                    default:
                        System.out.println("No dept entered");                                                
                }
                break;
            default:
                System.out.println("Enter valid EmpID");                                                
        }



    }
}
