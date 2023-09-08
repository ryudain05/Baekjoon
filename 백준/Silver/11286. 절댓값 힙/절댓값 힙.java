import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //입력받을 개수
        int N = Integer.parseInt(br.readLine());
        int input;

        
        PriorityQueue<Integer> q = new PriorityQueue<>((o1, o2) -> {
            //절대값 구하기
            int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);

            //절대값이 같으면 입력값과 비교 o1이 o2보다 크다면 오름차순, 아니라면 내림차순
            if(abs1 == abs2) return o1 > o2 ? 1 : -1;
            //abs - abs2 의 결과값이 양수면 오름차순, 음수면 내림차순
            return abs1 - abs2;
        });

        for (int i = 0; i < N; i++) {
            //N만큼 값 입력받기
            input = Integer.parseInt(br.readLine());

            //큐가 비어있을 때 0이 들어오면 0 출력, 그게 아니라면 q에 있는 최상위 값 출력, 0외의 숫자는 큐에 저장
            if (input == 0) {
                if (q.isEmpty()) System.out.println(0);
                else System.out.println(q.poll());
            } else  q.offer(input);
        }
    }
}