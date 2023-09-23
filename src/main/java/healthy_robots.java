import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class healthy_robots {

    public static int[][] solve(int[][] arr, int n){
        int[] robots = new int[n];
        for(int i=0;i<n;i++){
            if(arr[i][1] == 0){
                robots[i] = arr[i][0]*-1;
            }
            else{
                robots[i] = arr[i][0];
            }
        }
        Stack<Integer> st = new Stack<>();
        for(int i =0;i<robots.length;i++){
//            System.out.println(st);
            if(st.isEmpty()){
                st.push(robots[i]);
                continue;
            }
            if(st.peek() > 0 && robots[i] < 0){
                while(!st.isEmpty() && st.peek() > 0){
                    if(st.peek() > Math.abs(robots[i])){
                        int temp = st.peek();
                        st.pop();
                        st.add(Math.abs(temp) - Math.abs(robots[i]));
                        robots[i] = 0;
                        break;
                    }
                    if(Math.abs(st.peek()) < Math.abs(robots[i])){
                        if(robots[i] < 0){
                            int temp = Math.abs(robots[i]);
                            temp-= Math.abs(st.peek());
                            robots[i] = temp*-1;
                        }
                        else{
                            robots[i] = Math.abs(robots[i]) - Math.abs(st.peek());
                        }
                        st.pop();
                        if(i > 0){
                            i--;
                            continue;
                        }
                        continue;
                    }
                    if(Math.abs(st.peek()) == Math.abs(robots[i])){
                        robots[i] = 0;
                        st.pop();
                        break;
                    }
                }
                if(robots[i] != 0){
                    st.push(robots[i]);
                    continue;
                }
                else{
                    continue;
                }
            }
            st.push(robots[i]);
        }
        int[][] ans = new int[st.size()+1][2];
        System.out.println(st.size());
        for(int i=0;i<=st.size();i++){
            System.out.println(st.peek());
            if(st.peek() < 0){
                ans[i][0] = Math.abs(st.peek());
                st.pop();
                ans[i][1] = 0;


            }
            else{
                ans[i][0] = st.peek();
                st.pop();
                ans[i][1] = 1;

            }
        }
        for(int i=0;i<st.size();i++){
            System.out.println(Arrays.toString(ans[i]));
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i =0;i<n;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        int[][] fin = solve(arr, n);
//        solve(arr,n);
//        System.out.println(Arrays.toString(fin));
    }
}




//4
//        39 1
//        20 0
//        21 0
//        12 0
