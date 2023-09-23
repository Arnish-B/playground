import java.util.Scanner;

public class weird_terminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int count = 0, ctr = 0;
        for(int i=0;i<str.length();i++){
            if(i > 0 && i < str.length()-1){
                if(str.charAt(i) == ' ' && str.charAt(i-1) != ' ' && str.charAt(i+1) != ' '){
                    count+=1;
                    if(count%2==0){
                        ctr+=1;
                    }
                }
            }
        }
        System.out.println(ctr);
    }
}
