import java.io.*;
import java.util.PriorityQueue;


public class Main {

    static PriorityQueue<Integer> q = new PriorityQueue<>();
    static int N;
    static int res = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int input;

        for (int i = 0; i < N; i++) {
            input = Integer.parseInt(br.readLine());

            q.offer(input);
        }

        add();
    }

    static void add() {

        while (q.size() > 1) {
            int sum = q.poll() + q.poll();
            res += sum;
            q.offer(sum);
        }

        System.out.println(res);
    }
}