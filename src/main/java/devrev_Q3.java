import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class devrev_Q3 {
    public static ArrayList<Integer> solve(int n, char c, char[] s) {
        // Initialize the ArrayList for storing the indices of the operations
        ArrayList<Integer> operationIndices = new ArrayList<>();

        // Check each character from the end of the string
        for (int i = n - 1; i >= 0; i--) {
            // If the character is not 'c', perform an operation
            if (s[i] != c) {
                // Add the index (1-indexed) to the operation indices
                operationIndices.add(i + 1);
                // Change the character and all multiples of its index to 'c'
                for (int j = i; j >= 0; j -= (i + 1)) {
                    s[j] = c;
                }
            }
        }

        // Return the operation indices
        return operationIndices;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<List<Integer>> fin = new ArrayList<>();
        for(int i=0;i<t;i++){
            int temp = sc.nextInt();
            char ch = sc.next().charAt(0);
            String s = sc.next();
            List<Integer> li = solve(temp, ch, s.toCharArray());
            fin.add(new ArrayList<>(li));
        }

        System.out.println(fin);
    }
}
