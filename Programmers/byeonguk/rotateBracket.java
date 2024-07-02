import java.util.Queue;
import java.util.LinkedList;
import java.util.ArrayDeque;

class rotateBracket {
    // 괄호 짝 맞추기 확인 함수
    private boolean areBracketsBalanced(Queue<Character> q) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (char c : q) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char open = stack.pop();
                if ((c == ')' && open != '(') || (c == '}' && open != '{') || (c == ']' && open != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public int solution(String s) {
        Queue<Character> queue = new LinkedList<>();
        char[] array = s.toCharArray();
        int count = 0;

        // 문자열의 문자를 큐에 추가
        for (char c : array) {
            queue.add(c);
        }

        // 큐를 회전하면서 괄호 짝 확인
        for (int i = 0; i < s.length(); i++) {
            if (areBracketsBalanced(queue)) {
                count++;
            }
            char rotateCharacter = queue.poll();
            queue.add(rotateCharacter);
        }

        return count;
    }
}