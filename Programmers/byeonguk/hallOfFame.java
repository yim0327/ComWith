import java.util.ArrayList;
import java.util.Collections;

class hallOfFame {
    public int[] solution(int k, int[] score) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = new int[score.length];

        for (int i = 0; i < score.length; i++) {
            if (list.size() < k) {
                list.add(score[i]);
                Collections.sort(list);
            } else if (score[i] > list.get(0)) {
                list.remove(0);
                list.add(score[i]);
                Collections.sort(list);
            }
            answer[i] = list.get(0);
        }

        return answer;
    }
}