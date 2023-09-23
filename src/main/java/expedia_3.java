import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class expedia_3 {
    public static void main(String[] args) {
        int[] arr = {2,3,5,3,7,9,5,3,7};
        Map<Integer, Integer> map = new HashMap<>();
        for(int i: arr){
            map.put(i, map.getOrDefault(i, 0)+1);
        }
        // sort the hash map by values
    }
}
