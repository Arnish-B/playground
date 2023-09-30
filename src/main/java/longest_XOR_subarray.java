public class longest_XOR_subarray {
    static int maxSubarrayXOR(int arr[], int n)
    {
        int ans = Integer.MIN_VALUE;


        for (int i=0; i<n; i++)
        {

            int curr_xor = 0;


            for (int j=i; j<n; j++)
            {
                curr_xor = curr_xor ^ arr[j];
                ans = Math.max(ans, curr_xor);
            }
        }
        return ans;
    }


    public static void main(String args[])
    {
        int arr[] = {1, 3, 8, 48, 10};
        int n = arr.length;
        System.out.println("Max subarray XOR is " +
                maxSubarrayXOR(arr, n));
    }
}
