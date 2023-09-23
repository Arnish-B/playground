import java.util.HashMap;
import java.util.Map;

public class teacher_probability {
    public static void main(String[] args) {
        int[] cards1 = {1,1,1};
        System.out.println(calculateProbability(cards1));
        int[] cards2 = {1,2,2};
        System.out.println(calculateProbability(cards2));
    }

    public static double calculateProbability(int[] cards) {
        Map<Integer, Integer> count = new HashMap<>();
        for (int card : cards) {
            count.put(card, count.getOrDefault(card, 0) + 1);
        }

        double probability = 0;
        for (int cardCount : count.values()) {
            probability += (double) cardCount / cards.length * ((double) cardCount - 1) / (cards.length - 1);
        }
        return probability;
    }
}
