import java.io.*;
import java.util.StringTokenizer;
import java.util.Stack;

public class stack2 {
    static Stack<Integer> stack = new Stack<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());

        while(N --> 0) {
            st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            if (command.equals("1")) {
                stack.push(Integer.parseInt(st.nextToken()));
            } else if (command.equals("2")) {
                sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
            } else if (command.equals("3")) {
                sb.append(stack.size()).append("\n");
            } else if (command.equals("4")) {
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            } else if (command.equals("5")) {
                sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
            }
        }
        br.close();
        System.out.println(sb);
    }
}