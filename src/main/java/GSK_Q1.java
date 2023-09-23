public class GSK_Q1 {
    public static long maxOR(long arr[], int k)
    {
        int n = arr.length;
        int x = 2;
        long preSum[] = new long[n + 1];
        long suffSum[] = new long[n + 1];
        long res = 0, pow = 1;

        for (int i = 0; i < k; i++)
            pow *= x;

        preSum[0] = 0;
        for (int i = 0; i < n; i++)
            preSum[i + 1] = preSum[i] | arr[i];

        suffSum[n] = 0;
        for (int i = n - 1; i >= 0; i--)
            suffSum[i] = suffSum[i + 1] | arr[i];

        res = 0;
        for (int i = 0; i < n; i++)
        {
            res = Math.max(res, preSum[i] | (arr[i] * pow) | suffSum[i + 1]);
        }
        return res;
    }
    public static void main(String[] args) {
        long arr[] = { 5, 8 };
        int n = 2;
        int k = 3;

        long ans = maxOR(arr, k);
        System.out.println(ans);
    }
}
