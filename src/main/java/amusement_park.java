import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class amusement_park {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        List<Integer> li = new ArrayList<Integer>();
        while(n!=0){
            li.add(n%10);
            n=n/10;
        }
        Collections.sort(li);
        int i = 0;
        while(li.get(i) == 0){
            li.remove(i);
            k--;
        }
        if(li.size() == 1){
            System.out.println(li.get(0));
            return;
        }
        System.out.println(li.get(li.size() - k-1));
    }
}
