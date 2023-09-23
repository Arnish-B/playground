public class maximum_toys {
    public static void main(String[] args) {
        int[] toys = {1,4,5,3,2,1,6};
        int budget = 6;
        int sum = 0, count = 0, fin  = 0;
        for(int i=0;i<toys.length;i++){
            sum = 0;
            count = 0;
            for(int j=i;j<toys.length;j++){
                if(sum + toys[j] <= budget){
                    sum+= toys[j];
                    count+=1;
                    fin = Math.max(fin, count);
                }
                else{
                    count = 0;
                    sum = 0;
                    break;
                }
            }
        }
        System.out.println(fin);
    }
}
