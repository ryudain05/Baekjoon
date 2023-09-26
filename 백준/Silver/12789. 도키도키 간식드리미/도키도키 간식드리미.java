import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = (Integer.parseInt(st.nextToken()));
        }

        System.out.println(sorted(arr));

    }

    static String sorted(int[] arr) {

        Stack<Integer> stack = new Stack<>();

        int start = 1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != start) {
                if (!stack.isEmpty() && stack.peek() == start) {
                    stack.pop();
                    i--;
                    start++;
                } else stack.push(arr[i]);
            } else start++;
        }

        boolean res = true;

        while (!stack.isEmpty()) {
            int tmp = stack.pop();

            if (tmp == start) {
                start++;
            } else {
                res = false;
                break;
            }
        }

        return res ? "Nice" : "Sad";

    }
}


