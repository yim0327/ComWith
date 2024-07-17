class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length + 1];
        int last = 0;
        int idx = num_list.length;

        if (num_list[idx - 2] < num_list[idx - 1]) {
            last = num_list[idx - 1] - num_list[idx - 2];
        } else {
            last = num_list[idx - 1] * 2;
        }

        for (int i = 0; i < idx; i++) {
            answer[i] = num_list[i];
        }
        answer[idx] = last;

        return answer;
    }
}