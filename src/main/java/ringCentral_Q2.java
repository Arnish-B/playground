import java.util.*;

public class ringCentral_Q2 {
    public static List<Integer> getMaxArray(int[] arr) {
        List<Integer> result = new ArrayList<>();
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((a, b) -> b[0] - a[0]);
        for (int i = arr.length - 1; i >= 0; i--) {
            maxHeap.offer(new int[]{arr[i], i});
            while (maxHeap.peek()[1] > i) {
                maxHeap.poll();
            }
            result.add(maxHeap.peek()[0] + 1);
        }
        Collections.reverse(result);
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 1, 0};
        System.out.println(getMaxArray(arr));
    }
}