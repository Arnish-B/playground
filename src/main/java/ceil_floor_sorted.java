public class ceil_floor_sorted {
    public static void findCeilFloor(int l, int r, int tar, int arr[]){
        if(l > r){
            return;
        }
        if(tar < arr[l]){
            System.out.print("Ceil: " + arr[l]);
            System.out.print(" Floor: " + -1);
            System.out.println();
            return;
        }
        if(tar > arr[r]){
            System.out.print("Ceil: " + -1);
            System.out.print(" Floor: " + arr[r]);
            System.out.println();
            return;
        }
        int m = (l+r)/2;

        if(arr[m] == tar){
            System.out.print("Ceil: " + arr[m]);
            System.out.print(" Floor: " + arr[m]);
            System.out.println();
            return;
        }
        else if(arr[m] > tar){
            if(m!=0){
                if(arr[m-1]<tar){
                    System.out.print("Ceil: " + arr[m]);
                    System.out.print(" Floor: " + arr[m-1]);
                    System.out.println();
                    return;
                }
            }
            findCeilFloor(l,m-1,tar,arr);
        }
        else{
            if(m!=arr.length-1){
                if(arr[m+1] > tar){
                    System.out.print("Ceil: " + arr[m+1]);
                    System.out.print(" Floor: " + arr[m]);
                    System.out.println();
                    return;
                }
            }
            findCeilFloor(m+1,r,tar,arr);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 8, 9};
        int n = arr.length-1;
        for(int i =0;i<=10;i++){
            findCeilFloor(0,n,i,arr);
        }
    }
}
