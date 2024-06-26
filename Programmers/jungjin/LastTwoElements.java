class Solution {
    public int[] solution(int[] num_list) {
        int lastElement = num_list[num_list.length - 1];
        int secondLastElement = num_list[num_list.length - 2];
        int newElement;

        if (lastElement > secondLastElement) {
            newElement = lastElement - secondLastElement;
        } else {
            newElement = lastElement * 2;
        }

        int[] answer = new int[num_list.length + 1];
        for (int i = 0; i < num_list.length; i++) {
            answer[i] = num_list[i];
        }
        answer[num_list.length] = newElement;

        return answer;
    }
}
