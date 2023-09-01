import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    static int[][] arr;
    static boolean[] visited;

    static int N, M;
    static int count = 0;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        //노드와 간선입력
        N = Integer.parseInt(br.readLine());
        M = Integer.parseInt(br.readLine());

        //노드의 개수만큼 배열 & 방문배열 선언
        arr = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        //네트워크 수 만큼 반복해서 입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            //만약 입력이 1 2와 2 1일때 결국 둘은 같기 때문에 arr[a][b] = arr[b][a] = 1이다. (양방향)
            arr[a][b] = arr[b][a] = 1;
        }

        //감염된 1번 bfs부터 시작
        System.out.println(bfs(1));
    }


    //BFS를 이용하여 탐색
    static int bfs(int i) {

        //큐 선언
        Queue<Integer> queue = new LinkedList<>();

        //1부터 queue에 넣어서 확인
        queue.offer(i);

        //1부터 방문
        visited[i] = true;


        //큐가 비어있지 않으면 반복
        while (!queue.isEmpty()) {
            //큐에 저장 된 값 data에 저장
            int data = queue.poll();

            for (int j = 1; j <= N; j++) {
                if (arr[data][j] == 1 && visited[j] == false) {
                    queue.offer(j);
                    visited[j] = true;
                    count++;
                }
            }
        }
        return count;
    }
}