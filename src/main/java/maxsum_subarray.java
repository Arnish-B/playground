public class maxsum_subarray {
    public static void main(String[] args) {
//        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
        int max_so_far = Integer.MIN_VALUE;
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        int max_ending_here = arr[0];
        for(int i=1;i<arr.length;i++){
            max_ending_here += arr[i];
            max_so_far = Math.max(max_so_far,max_ending_here);
            if(max_ending_here<0){
                max_ending_here = 0;
            }
        }
        System.out.println(max_so_far);
    }
}
