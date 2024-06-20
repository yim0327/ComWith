import java.util.HashSet;
import java.util.Arrays;

public class monthlyCodeChallenge1 {
    public static int[] solution(int[] numbers) {
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0; i < numbers.length -1; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }
        return set.stream().sorted().mapToInt(i -> i).toArray();
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 1, 3, 4, 1};
        int[] result = solution(numbers);

        System.out.println(Arrays.toString(result));
    }
}
