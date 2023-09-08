import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //입력받을 개수
        int N = Integer.parseInt(br.readLine());
        int input;


        //내림차순으로 정렬
        PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            //N만큼 값 입력받기
            input = Integer.parseInt(br.readLine());

            //큐가 비어있을 때 0이 들어오면 0 출력, 그게 아니라면 q에 있는 최상위 값 출력, 0외의 숫자는 큐에 저장
            if (input == 0) {
                if (q.isEmpty()) System.out.println(0);
                else System.out.println(q.poll());
            } else q.offer(input);
        }
    }
}