import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> result = new ArrayList<>();
      
        for (int num : arr) {
            if (num % divisor == 0) {
                result.add(num);
            }
        }
      
        if (result.isEmpty()) {
            return new int[]{-1};
        }
        
        result.sort(null);
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}
