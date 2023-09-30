public class find_first_missing_sorted {
    public static void main(String[] args) {
        int[] arr = {0, 1, 2, 6, 9, 11, 15};
        int l = 0;
        int r = arr.length - 1;
        int m = r+1;
        while(l <= r){
            m = (l+r)/2;
            if(arr[m] == m){
                l = m+1;
                continue;
            }
            else{
                r = m-1;
                continue;
            }
        }
        System.out.println(m == arr.length-1?arr.length:m);
    }
}
