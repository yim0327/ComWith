import java.util.Stack;

class createArray4 {
    public int[] solution(int[] arr) {
        Stack<Integer> stk = new Stack<>();
        int i = 0;  // i를 0으로 초기화

        // 배열의 모든 요소를 처리
        while (i < arr.length) {
            if (stk.isEmpty()) {
                stk.add(arr[i]);
                i += 1;
            } else {
                if (stk.peek() < arr[i]) {
                    stk.add(arr[i]);
                    i += 1;
                } else {
                    stk.pop();
                }
            }
        }

        // 스택을 배열로 변환
        return stk.stream().mapToInt(Integer::intValue).toArray();
    }
}