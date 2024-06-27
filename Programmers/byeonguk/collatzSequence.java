import java.util.ArrayList;

class collatzSequence {
    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();

        while (n != 1) {
            answer.add(n);
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }

        answer.add(1);
        return answer.stream().mapToInt(i -> i).toArray();
    }
}