import java.util.*;

class ClosestDessert {

    static int closest = Integer.MAX_VALUE;
    static int result = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 🔹 INPUT LINE
        String line = sc.nextLine().trim();

        // 🔹 Split into 3 parts using comma
        String[] parts = line.split(",");

        // 🔹 Bread array
        String[] breadVals = parts[0].trim().split("[\\s]+");
        int[] bread = new int[breadVals.length];
        for(int i = 0; i < breadVals.length; i++){
            bread[i] = Integer.parseInt(breadVals[i]);
        }

        // 🔹 Filling array
        String[] fillVals = parts[1].trim().split("[\\s]+");
        int[] filling = new int[fillVals.length];
        for(int i = 0; i < fillVals.length; i++){
            filling[i] = Integer.parseInt(fillVals[i]);
        }

        // 🔹 Target
        int target = Integer.parseInt(parts[2].trim());

        // 🔹 Try each bread
        for(int b : bread){
            dfs(filling, 0, b, target);
        }

        // 🔹 Output result
        System.out.println(result);
    }

    // 🔁 DFS FUNCTION
    static void dfs(int[] filling, int index, int cost, int target){

        // update closest
        if(Math.abs(target - cost) < closest){
            closest = Math.abs(target - cost);
            result = cost;
        }

        // stop condition
        if(index == filling.length) return;

        // 0 times
        dfs(filling, index + 1, cost, target);

        // 1 time
        dfs(filling, index + 1, cost + filling[index], target);

        // 2 times
        dfs(filling, index + 1, cost + 2 * filling[index], target);
    }
}