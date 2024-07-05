import java.util.ArrayList;

class addNonExistNumber {
    public int solution(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            if (list.contains(i)) {
                continue;
            } else {
                sum += i;
            }
        }
        return sum;
    }
}

/*
class Solution {
    public int solution(int[] numbers) {
        int sum = 45;
        for (int i : numbers) {
            sum -= i;
        }
        return sum;
  }
}
* */