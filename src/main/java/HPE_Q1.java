public class HPE_Q1 {
    public static void main(String[] args) {
        class3 c3 = new class3();
        System.out.println(c3.max(13,29));
    }
}

class class1{
    int max(int x, int y){
        if(x>y){
            return x;
        }
        else{
            return y;
        }
    }
}

class class2 extends class1{
    int max(int x, int y){
        return super.max(y,x) - 10;
    }
}
class class3 extends class2{
    int max(int x, int y){
        return super.max(x + 10,y + 10);
    }
}
