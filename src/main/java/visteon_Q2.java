public class visteon_Q2 {
    public static void main(String[] args) {
        int[][] a = {{0, 1}, {1, 0}, {1, 1}, {2, 2}, {1, 2}, {2, 4}, {3, 6}, {0, 0}};
        int res = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i][0] == 0 && a[i][1] == 0) {
                res += a.length - i - 1;
                continue;
            }
            for (int j = i + 1; j < a.length; j++) {
                if (a[i][0] * a[j][1] == a[i][1] * a[j][0]) {
                    res++;
                }
            }
        }
        System.out.println(res);
    }
}
