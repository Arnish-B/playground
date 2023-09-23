import java.util.Scanner;
import java.util.Arrays;
public class devrev_Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();
        Arrays.sort(arr);
        int[] result = new int[n];
        int left = 0, right = n - 1;
        for (int i = n - 1; i >= 0; i--) {
            if (i % 2 == 0) {
                result[right--] = arr[i];
            }
            else {
                result[left++] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(result[i] + " ");
        }
    }
}

