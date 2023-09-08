import java.io.*;
import java.util.PriorityQueue;


public class Main {

    //오름차순으로 정렬
    static PriorityQueue<Integer> q = new PriorityQueue<>();
    static int N;
    static int res = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int input;

        //입력받음
        for (int i = 0; i < N; i++) {
            input = Integer.parseInt(br.readLine());
            q.offer(input);
        }

        add();
    }

    static void add() {

        //q에 원소가 2개이상 들어있을때만 비교해야한다.
        while (q.size() > 1) {
            //두가지 원소를 더하고, 나온 결과값을 res에 저장. 큐에는 두가지 원소를 더하는 sum을 저장
            int sum = q.poll() + q.poll();
            res += sum;
            q.offer(sum);
        }

        //결과값 출력
        System.out.println(res);
    }
}
