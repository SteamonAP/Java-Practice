import java.util.*;

public class Expenses {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int income = Integer.parseInt(sc.nextLine().trim());
        
        // Map<String,Integer> map = new HashMap<>();
        Map<String,Integer> map = new LinkedHashMap(); // because Input order matters
        
        int totalExpenses = 0;
        
        while(true){
            String category = sc.nextLine().trim();
            
            if(category.toLowerCase().equals("done")){
                break;
            }
            int expenses = Integer.parseInt(sc.nextLine().trim());
            totalExpenses += expenses;
            
            map.put(category, map.getOrDefault(category ,0) + expenses);
        }
        
        int saving = income - totalExpenses;
        System.out.println("Total Income: " + income);
        System.out.println("Total Expenses: " + totalExpenses);
        System.out.println("Total Savings: " + saving);
        
        System.out.println("Expenses Breakdown:");
        
        for(String key : map.keySet()){
            System.out.println(key +  ": " + map.get(key));
        }
    }
}