public class count_rotated_array {
    public static void main(String[] args) {
        int arr[] = {8,9,10,2,5,6};
        for(int i=0;i<arr.length-2;i++){
            if(arr[i]>arr[i+1]){
                System.out.println(i+1);
                break;
            }
        }
    }
}
