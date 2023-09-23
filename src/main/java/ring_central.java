public class ring_central {
    public static void solve(int n, int[] keys, int q, int[][] queries){
        int[] fin = new int[q];
        for(int i =0;i<queries.length;i++){
            int temp = 0;
            for(int j=0;j<2;j++){
                for(int k =0;k<keys.length;k++){
                    if(keys[k]%queries[i][j] == 0){
//                        System.out.println(keys[k] + " " + queries[i][j]);
                        temp+=1;
                    }
                }
                temp = temp*temp;
                fin[i]+=temp;
                temp = 0;
//                System.out.println(temp);
            }
//            fin[i] += temp;
        }
        for(int i =0;i<q;i++){
            System.out.println(fin[i]);
        }
    }
    public static void main(String[] args){
        int n = 3;
        int q = 2;
        int keys[] = {1,2,3};
        int queries[][] = {{100,200},{1,1}};
        solve(n,keys,q,queries);
    }
}
