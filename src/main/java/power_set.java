import java.util.*;

public class power_set {
    public static void solve(int[] arr, int i, int n, List<List<Integer>> fin, List<Integer> temp){
        if(i>=n){
            fin.add(new ArrayList<>(temp));
            return;
        }
        temp.add(arr[i]);
        solve(arr,i+1,n,fin,temp);
        temp.remove(temp.size()-1);
        solve(arr,i+1,n,fin,temp);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = 3;
        int[] arr = {1,2,3};
        List<List<Integer>> fin = new ArrayList<>();
        solve(arr,0,n,fin,new ArrayList<>());
//        Collections.sort(fin);
        System.out.println(fin);
    }
}
