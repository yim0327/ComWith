import java.util.Queue;
import java.util.LinkedList;

public class iHateSameNumbers {
    public int[] solution(int[] arr) {
        Queue<Integer> answer = new LinkedList<>();
        answer.add(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1] == arr[i]) {
                continue;
            } else {
                answer.add(arr[i]);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}