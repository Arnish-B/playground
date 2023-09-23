import java.util.Scanner;

public class Q_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int testCase = 0; testCase < t; testCase++) {
            int n = scanner.nextInt();
            int maxQuality = -1;
            int winner = -1;

            for (int i = 0; i < n; i++) {
                int ai = scanner.nextInt();
                int bi = scanner.nextInt();

                if (ai <= 10 && bi > maxQuality) {
                    maxQuality = bi;
                    winner = i + 1;
                }
            }

            System.out.println(winner);
        }

        scanner.close();
    }
}