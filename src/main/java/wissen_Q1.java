import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class wissen_Q1 {
    public static void findPairs(int[] array, int x) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if ((array[i] * array[j]) % x == 0) {
                    count+=1;
//                    System.out.println("(" + array[i] + ", " + array[j] + ")");
                }
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < 20; i++) {
            arr[i] = i + 1;
        }
        findPairs(arr, 6);
    }
}
