import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    static int[][] arr;
    //방문 여부를 저장하기 위한 배열
    static boolean[][] visited;

    //x, y 좌표 이동을 위한 델타 배열 [위, 아래, 왼쪽, 오른쪽]
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};

    //크기
    static int N, M;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());


        arr = new int[N + 1][M + 1];
        //한 글자씩 배열에 저장
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = s.charAt(j) - '0';
            }
        }


        //방문여부 초기화
        visited = new boolean[N + 1][M + 1];
        //0,0 부터 방문
        visited[0][0] = true;
        bfs(0, 0);

        //결과 출력, 0,0부터 시작했기 때문에 N-1, M-1의 좌표값을 출력
        System.out.println(arr[N - 1][M - 1]);
    }


    //BFS를 이용하여 탐색
    static void bfs(int x, int y) {
        //큐 선언
        Queue<int[]> queue = new LinkedList<>();

        //시작 좌표를 큐에 추가
        queue.offer(new int[]{x, y});

        //큐가 비어있지 않으면 반복
        while (!queue.isEmpty()) {
            //큐에서 좌표 추출
            int data[] = queue.poll();
            //추출한 좌표의 x, y 값 저장
            int curx = data[0], cury = data[1];

            //현재 좌표에서 상하좌우로 이동하며 탐색
            for (int i = 0; i < 4; i++) {
                //다음 이동할 좌표 계산, 위에 선언한 상하좌우
                int netx = curx + dx[i], nety = cury + dy[i];

                //범위 내에 있는 지 확인
                if (netx < 0 || nety < 0 || netx >= N || nety >= M) {
                    continue;
                }

                //방문한 적이 있거나 0일경우 무시
                if (arr[netx][nety] == 0 || visited[netx][nety]) {
                    continue;
                }

                //다음 좌표를 큐에 저장
                queue.offer(new int[]{netx, nety});
                //현재 좌표에 +1 값을 더해줌
                arr[netx][nety] = arr[curx][cury] + 1;
                //방문 표시
                visited[netx][nety] = true;
            }
        }
    }
}