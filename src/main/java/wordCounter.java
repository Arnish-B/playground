import java.io.*;
import java.util.*;


public class wordCounter {

    static String[][] wordCountEngine(String sentence) {

        String[] words = sentence.split("\\W+");


        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            frequencyMap.put(word.toLowerCase(), frequencyMap.getOrDefault(word.toLowerCase(), 0) +1);
        }

        String[][] frequencyArray = new String[frequencyMap.size()][2];
        System.out.println(frequencyMap);
        int index = 0;
        for (Map.Entry<String, Integer> entry : frequencyMap.entrySet()) {
            frequencyArray[index][0] = entry.getKey();
            frequencyArray[index][1] = frequencyMap.get(entry.getKey()).toString();
            index++;
        }

        return frequencyArray;
    }

    public static void main(String[] args) {
        String document = "Practice makes perfect. you'll only get Perfect by practice. just practice!";
        String[][] fin = wordCountEngine(document);
        // sort the array fin, first compare the second element and sort in ascending order, in case of a tie, the first occurence of the word should be first
        // sort the array fin, incase of a tie, the first occurence of the word should be first
        Arrays.sort(fin, (a, b) -> Integer.compare(Integer.parseInt(b[1]),Integer.parseInt(a[1])));
//        Arrays.sort(fin, (a, b) -> String.compare(a[1],b[1]));
        for(int i=0;i<fin.length;i++){
            System.out.println(Arrays.toString(fin[0]) + " " + Arrays.toString(fin[1]));
        }
    }
}