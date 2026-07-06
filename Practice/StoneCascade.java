import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StoneCascade {


    public static int solve(List<Integer> stones) {
        int n = stones.size();

        if (n == 0|| n == 1){
            return n;
        }

        Set<Integer> unstable = new HashSet<>();

        for (int i = 0; i < n; i++){
            unstable.add(i);
        }

        int interactions = 0;

        while (!unstable.isEmpty()){
            interactions++;

            int currentIdx = -1;
            for (int i = 0; i < n;i++){
                if (unstable.contains(i)){
                    currentIdx = i;
                    break;
                }
            }

            unstable.remove(currentIdx);

            int currentValue = stones.get(currentIdx);

            int position = currentIdx + 1;
            int impact = currentValue / ((position%n) + 2);

            Set<Integer> toRemove = new HashSet<>();

            for (int j : unstable) {
                int valueDiff = Math.abs(stones.get(j) - currentValue);

                if (valueDiff > impact){
                    toRemove.add(j);
                }
            }

            unstable.removeAll(toRemove);
        }

        return interactions;
    }



    public static int solveWithTrace(List<Integer> stones) {
        int N = stones.size();
        Set<Integer> unstable = new HashSet<>();
        for (int i = 0; i < N; i++) {
            unstable.add(i);
        }
        
        int iterations = 0;
        
        System.out.println("Initial stones: " + stones);
        System.out.println("All indices unstable: " + unstable);
        System.out.println("═══════════════════════════════════════\n");
        
        while (!unstable.isEmpty()) {
            iterations++;
            System.out.println("╔═══ ITERATION " + iterations + " ═══╗");
            
            // Find first unstable
            int currentIdx = -1;
            for (int i = 0; i < N; i++) {
                if (unstable.contains(i)) {
                    currentIdx = i;
                    break;
                }
            }
            
            unstable.remove(currentIdx);
            
            int currentValue = stones.get(currentIdx);
            int position = currentIdx + 1;
            int impact = currentValue / ((position % N) + 2);
            
            System.out.println("Processing: Index " + currentIdx + " (value = " + currentValue + ")");
            System.out.println("Formula: impact = " + currentValue + " / ((" + position + " % " + N + ") + 2)");
            System.out.println("Impact = " + currentValue + " / " + ((position % N) + 2) + " = " + impact);
            System.out.println("\nChecking other unstable stones:");
            
            Set<Integer> toRemove = new HashSet<>();
            for (int j : unstable) {
                int valueDiff = Math.abs(stones.get(j) - currentValue);
                System.out.printf("  Index %d (value=%d): |%d - %d| = %d ", 
                                j, stones.get(j), stones.get(j), currentValue, valueDiff);
                
                if (valueDiff > impact) {
                    System.out.println("> " + impact + " → STABLE ✓");
                    toRemove.add(j);
                } else {
                    System.out.println("≤ " + impact + " → UNSTABLE ✗");
                }
            }
            
            unstable.removeAll(toRemove);
            
            System.out.println("\nRemaining unstable indices: " + unstable);
            System.out.println("╚" + "═".repeat(30) + "╝\n");
        }
        
        System.out.println("✓ All stones stable!");
        System.out.println("Total iterations: " + iterations);
        
        return iterations;
    }
    
    // ==================== TEST CASES ====================
    
    public static void main(String[] args) {
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║     STONE CASCADE PROBLEM - TESTS     ║");
        System.out.println("╚════════════════════════════════════════╝\n");
        
        // Test Case 1
        System.out.println("TEST CASE 1:");
        List<Integer> test1 = Arrays.asList(10, 5, 8, 3, 12);
        int result1 = solveWithTrace(test1);
        System.out.println("\n→ Expected: 2, Got: " + result1);
        System.out.println((result1 == 2 ? "✓ PASS" : "✗ FAIL") + "\n");
        System.out.println("═".repeat(50) + "\n");
        
        // Test Case 2
        System.out.println("TEST CASE 2:");
        List<Integer> test2 = Arrays.asList(100, 1, 2, 3);
        int result2 = solveWithTrace(test2);
        System.out.println("\n→ Expected: 1, Got: " + result2);
        System.out.println((result2 == 1 ? "✓ PASS" : "✗ FAIL") + "\n");
        System.out.println("═".repeat(50) + "\n");
        
        // Test Case 3
        System.out.println("TEST CASE 3:");
        List<Integer> test3 = Arrays.asList(5, 5, 5, 5);
        int result3 = solveWithTrace(test3);
        System.out.println("\n→ Expected: 4, Got: " + result3);
        System.out.println((result3 == 4 ? "✓ PASS" : "✗ FAIL") + "\n");
        System.out.println("═".repeat(50) + "\n");
        
        // Test Case 4 - Edge case
        System.out.println("TEST CASE 4 (Edge - Single element):");
        List<Integer> test4 = Arrays.asList(42);
        int result4 = solve(test4);
        System.out.println("Input: [42]");
        System.out.println("Result: " + result4);
        System.out.println((result4 == 1 ? "✓ PASS" : "✗ FAIL") + "\n");
        System.out.println("═".repeat(50) + "\n");
        
        // Test Case 5 - Large differences
        System.out.println("TEST CASE 5:");
        List<Integer> test5 = Arrays.asList(1000, 10, 20, 15, 5);
        int result5 = solveWithTrace(test5);
        System.out.println("\n→ Result: " + result5 + "\n");
        System.out.println("═".repeat(50) + "\n");
        
        // Additional quick tests
        System.out.println("QUICK TESTS:");
        runQuickTest(Arrays.asList(1, 2, 3, 4, 5));
        runQuickTest(Arrays.asList(50, 50, 50));
        runQuickTest(Arrays.asList(100, 50, 25, 12, 6));
        runQuickTest(Arrays.asList(7, 3, 9, 1, 5));
    }
    
    public static void runQuickTest(List<Integer> stones) {
        int result = solve(stones);
        System.out.println("Input: " + stones + " → Iterations: " + result);
    }
}
