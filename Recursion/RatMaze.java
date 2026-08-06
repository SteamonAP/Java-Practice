import java.util.*;

public class RatMaze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] maze = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        ArrayList<String> ans = findPath(maze, n);

        for (String path : ans) {
            System.out.println(path);
        }

        sc.close();
    }

    public static ArrayList<String> findPath(int[][] maze, int n) {
        ArrayList<String> ans = new ArrayList<>();
        int[][] vis = new int[n][n];
        if (maze[0][0] == 1) {
            solve(0, 0, maze, n, ans, "", vis);
        }

        return ans;
    }

    private static void solve(int i, int j, int[][] maze, int n, ArrayList<String> ans, String move, int[][] vis) {
        if (i == n - 1 && j == n - 1) {
            ans.add(move);
            return;
        }

        //DLRU is the lexicographical order;

        // DOWN
        if (i + 1 < n && vis[i + 1][j] == 0 && maze[i + 1][j] == 1) {
            vis[i][j] = 1;
            solve(i + 1, j, maze, n, ans, move + "D", vis);
            vis[i][j] = 0;
        }

        // LEFT
        if (j - 1 >= 0 && vis[i][j - 1] == 0 && maze[i][j - 1] == 1) {
            vis[i][j] = 1;
            solve(i, j - 1, maze, n, ans, move + "L", vis);
            vis[i][j] = 0;
        }

        // RIGHT
        if (j + 1 < n && vis[i][j + 1] == 0 && maze[i][j + 1] == 1) {
            vis[i][j] = 1;
            solve(i, j + 1, maze, n, ans, move + "R", vis);
            vis[i][j] = 0;
        }

        // UP
        if (i - 1 >= 0 && vis[i - 1][j] == 0 && maze[i - 1][j] == 1) {
            vis[i][j] = 1;
            solve(i - 1, j, maze, n, ans, move + "U", vis);
            vis[i][j] = 0;
        }
    }

}
