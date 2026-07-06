import java.util.*;

class mathParking{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try{
            int n = Integer.parseInt(sc.nextLine().trim());
    
        
            int answer = 0;
            
           if (n <= 2){
               answer = n * 100;
           }else if (n <= 5){
               answer = (2 * 100) + (n-2) * 50;
           }else {
               answer = (2 * 100) + (3 * 50) + (n-5) * 20;
           }
            System.out.print(answer);
        } catch (Exception e){
            System.out.println("error");
            return;
        }
        sc.close();
        
    }
}


// import java.util.*;

// class mathParking{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         try{
//             int n = Integer.parseInt(sc.nextLine().trim());
    
        
//             int answer = 0;
            
//            answer += Math.min(n,3) * 120;
//            if (n > 3){
//                answer += Math.min(n-3,4)* 60;
//            }
//            if (n > 7){
//                answer += (n-7) * 20;
//            }
//            System.out.print(answer);
//         } catch (Exception e){
//             System.out.println("error");
//             return;
//         }
//         sc.close();
        
//     }
// }


