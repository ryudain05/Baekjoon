import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();
        while (N-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String M = st.nextToken();
            if (M.equals("1")) {
                int K = Integer.parseInt(st.nextToken());
                stack.push(K);
            }
            if (M.equals("2")) {
                if (stack.isEmpty()) sb.append(-1).append("\n");
                else sb.append(stack.pop()).append("\n");
            }
            if (M.equals("3")) {
                sb.append(stack.size()).append("\n");
            }
            if (M.equals("4")) {
                if (stack.isEmpty()) sb.append(1).append("\n");
                else sb.append(0).append("\n");
            }
            if (M.equals("5")) {
                if (!stack.isEmpty()) sb.append(stack.peek()).append("\n");
                else sb.append(-1).append("\n");
            }
        }
        System.out.println(sb);
    }
}
