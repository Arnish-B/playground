import java.util.Arrays;

public class move_zeros_to_right {
    public static void move_zeros(int[] arr, int n){
        int count = 0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[count++] = arr[i];
            }
        }
        while(count < n){
            arr[count++] = 0;
        }
        System.out.println("Array after moving zeros to the right: ");
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0, 9};
        int n = arr.length;
        move_zeros(arr, n);
    }
}
