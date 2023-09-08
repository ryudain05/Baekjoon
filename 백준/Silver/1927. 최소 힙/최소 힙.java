import java.io.*;
import java.util.PriorityQueue;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int input;

        //int형 priorityQueue 선언 (오름차순)
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            input = Integer.parseInt(br.readLine());

            //입력값이 0이면서 큐가 비어있으면 0반환, 그렇지 않으면 최소힙으로 정렬된 첫번째 값 반환
            if (input == 0) {
                if (q.isEmpty()) System.out.println(0);
                else System.out.println(q.poll());
            }
            //그 외 모든 입력값은 큐에 추가
            else q.offer(input);
        }
    }
}
