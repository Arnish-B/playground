import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class expedia_1 {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{8,10},{15,18},{16,17}};
        System.out.println(arr.length);
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0],b[0]));
        int st = arr[0][0];
        int end = arr[0][1];
        List<List<Integer>> li = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(st);
        li.add(new ArrayList(temp));
        for(int i=1;i<arr.length;i++){
            if(arr[i][0] <= end){
                end = Math.max(end, arr[i][1]);
//                temp.add(end);
            }
            else{
                li.get(li.size()-1).add(end);
//                temp.add(end);
                temp = new ArrayList<>();
                temp.add(arr[i][0]);
                li.add(new ArrayList(temp));
                end = arr[i][1];
            }
        }
        li.get(li.size()-1).add(end);
        System.out.println(li);
    }
}
