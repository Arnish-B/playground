import java.util.Scanner;
import java.io.*;
import java.lang.*;
public class Q_1 {
    public static void main(String[] args){
        int testCases;
        Scanner sc = new Scanner(System.in);
        testCases = sc.nextInt();
        int fin[] = new int[testCases];
        for(int i =0;i<testCases;i++){
            int arr[] = new int[3];
            for(int j =0;j<3;j++){
                arr[j] = sc.nextInt();
            }
            if((arr[0]+arr[1] >= 10) || (arr[1]+arr[2] >= 10) || (arr[0]+arr[2] >= 10)){
                fin[i] = 1;
            }
            else {
                fin[i] = 0;
            }
        }
        for(int i =0;i<testCases;i++){
            if(fin[i] == 1){
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
