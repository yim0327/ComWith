import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        int sum = 0;

        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < K; i++) {
            int input = Integer.parseInt(br.readLine());
            if (input == 0) {
                stack.pop();
            } else {
                stack.push(input);
            }
        }
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}