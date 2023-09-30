//import java.util.Scanner;
//
//public class count_good_integers_in_array{
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        long[] array = new long[n];
//        for (int i = 0; i < n; i++) {
//            array[i] = scanner.nextLong();
//        }
//        scanner.close();
//
//        int goodIntegers = 0;
//        for (long num : array) {
//            if (isGood(num)) {
//                goodIntegers++;
//            }
//        }
//
//        System.out.println(goodIntegers);
//    }
//
//    private static boolean isGood(long num) {
//        for (long x = 1; x < num; x++) {
//            for (long y = x + 1; y < num; y++) {
//                if ((x ^ y) == num && (x & y) == 0) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//}

import java.util.Scanner;

import java.util.Scanner;

public class count_good_integers_in_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextLong();
        }
        scanner.close();

        int goodIntegersCount = 0;
        for (int i = 0; i < n; i++) {
            if (isGoodInteger(arr[i])) {
                System.out.print(arr[i] + " ");
                goodIntegersCount++;
            }
        }

        System.out.println(goodIntegersCount);
    }

    private static boolean isGoodInteger(long z) {
        for (long x = 1; x < z; x++) {
            for (long y = 1; y < x; y++) {
                if ((x ^ y) == z && (x & y) == 0) {
                    System.out.println(x + " " + y);
                    return true;
                }
            }
        }
        return false;
    }
}



// 10
// 295 8 678 725 418 377 675 271 747 307
// 2
