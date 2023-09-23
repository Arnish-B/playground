import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.List;

class Element {
    int value;
    int diff;
    public Element(int v, int d) {
        this.value = v;
        this.diff = d;
    }
}

public class K_closest {
    public List<Integer> kClosestElements(int[][] matrix, int target, int k) {
        PriorityQueue<Element> maxHeap = new PriorityQueue<>((n1, n2) -> { //max heap
            if(n1.diff == n2.diff){
                return n2.value - n1.value; //when diff is same, max value first
            }
            return n2.diff - n1.diff; //otherwise, min difference first
        });

        int m = matrix[0].length;
        int n = matrix.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                maxHeap.add(new Element(matrix[i][j], Math.abs(target - matrix[i][j])));
                if(maxHeap.size() > k)
                    maxHeap.poll();
            }
        }

        List<Integer> result = new ArrayList<>();
        while(!maxHeap.isEmpty())
            result.add(maxHeap.poll().value);

        return result;
    }

    public static void main(String[] args){
        int[][] matrix = {{1, 5, 9}, {14, 20, 21}, {30, 34, 43}};
        int target = 4;
        int k = 4;
        K_closest kc = new K_closest();
        List<Integer> result = kc.kClosestElements(matrix, target, k);
        Collections.sort(result);
        System.out.println(result);
    }
}
