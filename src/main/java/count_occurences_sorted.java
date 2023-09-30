public class count_occurences_sorted {
    public static int firstOccurence(int[] arr, int l, int r, int tar){
        int m = 0;
        int res = -1;
        while(l <= r){
            m = (l+r)/2;
            if(arr[m] == tar){
                res = m;
                r = m-1;
                continue;
            }
            else if(arr[m] > tar){
                r = m-1;
                continue;
            }
            else{
                l = m+1;
                continue;
            }
        }
        return res;
    }
    public static int lastOccurence(int[] arr, int l, int r, int tar){
        int m = 0;
        int res = -1;
        while(l <= r){
            m = (l+r)/2;
            if(arr[m] == tar){
                res = m;
                l = m+1;
                continue;
            }
            else if(arr[m] > tar){
                r = m-1;
                continue;
            }
            else{
                l = m+1;
                continue;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,2,2,2,2,2,2,2,3,3,3,3,3,4,5,5,5,5,6,6,7,7,7,8,8,8,8,8,9,9,10};
        int n = arr.length - 1;
        int tar = 3;
        System.out.println(firstOccurence(arr,0,n-1,tar));
        System.out.println(lastOccurence(arr,0,n-1,tar));
        System.out.println(lastOccurence(arr,0,n-1,tar) - firstOccurence(arr,0,n-1,tar) + 1);
    }
}
