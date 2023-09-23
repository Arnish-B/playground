import java.util.Arrays;

public class devrev_Q1 {
    static int[][][] dp, visited;
    static int[][] dir = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
    static char[][] grid;
    static int n, m;
    static int inf = (int) 1e9;

    public static void main(String[] args) {
        // Input
        int A = 1;
        int B = 4;
        String[] C = {"LLLL"};
        grid = new char[A][B];
        for (int i = 0; i < A; i++) {
            grid[i] = C[i].toCharArray();
        }
        n = A;
        m = B;
        dp = new int[n][m][n * m + 1];
        visited = new int[n][m][n * m + 1];
        for (int[][] rows : dp)
            for (int[] row : rows)
                Arrays.fill(row, inf);
        int ans = solve(0, 0, 0);
        System.out.println(ans >= inf ? -1 : ans);
    }

    public static int solve(int x, int y, int k) {
        if (x == n - 1 && y == m - 1)
            return dp[x][y][k] = 0;
        if (visited[x][y][k] == 1)
            return dp[x][y][k];
        visited[x][y][k] = 1;
        int ans = inf;
        for (int d = 0; d < 4; d++) {
            int nx = x + dir[d][0];
            int ny = y + dir[d][1];
            if (nx >= 0 && ny >= 0 && nx < n && ny < m) {
                if (grid[x][y] == 'U' && d == 0 || grid[x][y] == 'D' && d == 1 || grid[x][y] == 'L' && d == 2 || grid[x][y] == 'R' && d == 3)
                    ans = Math.min(ans, solve(nx, ny, k));
                else if (k + 1 <= n * m)
                    ans = Math.min(ans, solve(nx, ny, k + 1) + 1);
            }
        }
        return dp[x][y][k] = ans;
    }
}
