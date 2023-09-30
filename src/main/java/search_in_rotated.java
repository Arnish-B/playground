public class search_in_rotated {
    public static int bin_search(int l, int r, int tar, int[] arr){
        if(tar < arr[l] || tar > arr[r]){
            return 0;
        }
        else{
            int m =0;
            while(l <= r){
                m = (l+r)/2;
                if(arr[m] == tar){
//                    System.out.println("M: " + m);
                    return m;
                }
                else if(arr[m] < tar){
                    l = m+1;
                    continue;
                }
                else{
                    r = m-1;
                    continue;
                }
            }
            return m+1;
        }
    }
    public static void main(String[] args) {
        int[] arr = {8, 9, 10, 2, 5, 6};
        int rot = -1;
        int tar = 2;
        int n = arr.length;
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]>arr[i+1]){
                rot = i+1;
                break;
            }
        }
        if(rot!=-1){
            System.out.println(bin_search(0,rot-1,tar, arr));
            System.out.println(bin_search(rot,n-1,tar, arr));
        }
        else{
            System.out.println(bin_search(0,n-1,tar,arr));
        }
    }
}
