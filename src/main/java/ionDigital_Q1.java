public class ionDigital_Q1 {
    public static void main(String[] args) {
//        int[] arr = {1,3,4,5,2,6};
        int threshold = 1;
        int[] arr = {2,1,2};
        System.out.println(minPartitionCost(arr, threshold));
    }

    public static int minPartitionCost(int[] arr, int threshold) {
        int n = arr.length;
        int[] dp = new int[n+1];
        dp[0] = 0;
        for (int i = 1; i <= n; i++) {
            dp[i] = Integer.MAX_VALUE;
        }

        for (int i = 1; i <= n; i++) {
            int maxElem = arr[i-1];
            for (int j = i; j > i - threshold && j > 0; j--) {
                maxElem = Math.max(maxElem, arr[j-1]);
                dp[i] = Math.min(dp[i], dp[j-1] + maxElem);
            }
        }

        return dp[n];
    }
}
