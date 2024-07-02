import java.io.*;
import java.util.Stack;

public class goodWord {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int answer = 0;
        for (int i = 0; i < count; i++) {
            Stack<Character> stack = new Stack<>();
            String input = br.readLine();

            for (int j = 0; j < input.length(); j++) {
                char alphabet = input.charAt(j);
                if (stack.isEmpty()) {
                    stack.push(alphabet);
                } else {
                    if (stack.peek() == alphabet) {
                        stack.pop();
                    } else {
                        stack.push(alphabet);
                    }
                }
            }
            if (stack.isEmpty()) {
                answer += 1;
            }
        }
        System.out.println(answer);
    }
}