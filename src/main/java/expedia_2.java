public class expedia_2 {
    public static void main(String[] args) {
        String input = "the sky is blue";
        String[] split = input.split(" ");
        for(int i=split.length-1;i>=0;i--){
            System.out.print(split[i]+" ");
        }
    }
}
