import java.util.Arrays;
import java.util.ArrayList;

class giveUpMath {
    public int[] solution(int[] answers) {
        int[][] userPattern = {
                {1, 2, 3, 4, 5},
                {2, 1, 2, 3, 2, 4, 2, 5},
                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}
        };

        int[] score = new int[3];  //  {0, 0, 0}

        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < userPattern.length; j++) {
                if (answers[i] == userPattern[j][i % userPattern[j].length]) {
                    score[j] += 1;
                } else {
                    continue;
                }
            }
        }
        int maxScore = Arrays.stream(score).max().getAsInt();

        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 0; i < score.length; i++) {
            if (score[i] == maxScore) {
                answer.add(i + 1);  //  사람 번호를 알아야 하므로 +1
            }
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}