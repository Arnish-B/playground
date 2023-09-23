import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class device_name_system {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        String[] device_names = {"switch","tv","switch","tv","switch","tv","switch","tv","home" , "myfirst" ,"downloads", "myfirst", "myfirst"};
        String[] fin = new String[device_names.length];
        for(int i=0;i<device_names.length;i++){
            if(map.containsKey(device_names[i])){
                map.put(device_names[i], map.get(device_names[i])+1);
                int num = map.get(device_names[i])-1;
                fin[i]  = device_names[i] + num;
            }
            else{
                map.put(device_names[i], 1);
                fin[i] = device_names[i];
            }
        }
        System.out.println(Arrays.toString(fin));
    }
}
