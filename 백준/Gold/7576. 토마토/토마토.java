import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    static int[][] arr;

    //크기
    static int N, M;

    //x, y 좌표 이동을 위한 델타 배열 [상, 하, 좌, 우]
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};


    //visited의 역할 1이 하고 있기 때문에, 해당좌표의 day를 저장하는 내부클래스를 정의하여 사용
    static class Dot {
        int x;
        int y;
        int day;

        public Dot(int x, int y, int day) {
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //입력 N이 행이고, M이 열이다.
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());


        //M이 행이고 N이 열
        arr = new int[M + 1][N + 1];

        //" "기준으로 숫자입력
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //함수호출
        bfs();

    }


    //BFS를 이용하여 탐색
    static void bfs() {

        //큐 선언 Dot 클래스사용
        Queue<Dot> queue = new LinkedList<>();
        int day = 0;

        //for문을 돌면서 익은 토마토가 있다면 큐에 넣어준다. 이때 day는 0 -> 처음부터 익어있는 상자인 지 확인 가능
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 1) {
                    queue.offer(new Dot(i, j, 0));
                }
            }
        }


        //큐가 비어있지 않으면 반복
        while (!queue.isEmpty()) {

            //큐의 가장 앞에 담긴 것을 꺼내온다.
            Dot dot = queue.poll();
            day = dot.day;

            //현재 좌표에서 상하좌우로 이동하며 탐색
            for (int i = 0; i < 4; i++) {
                //다음 이동할 좌표 계산, 위에 선언한 상하좌우
                int nx = dot.x + dx[i], ny = dot.y + dy[i];

                //범위 내에 없으면 건너뛴다.
                if (nx < 0 || ny < 0 || nx >= M || ny >= N) {
                    continue;
                }

                //익지않은 토마토가 있으면 1로 바꿔준 후 큐에 다시 넣는다. 이때 day를 +1 해주어서 토마토가 익는 날짜를 계산한다.
                if (arr[nx][ny] == 0) {
                    arr[nx][ny] = 1;
                    queue.offer(new Dot(nx, ny, day + 1));
                }
            }
        }

        //토마토가 익지않은 것이 있는 지 체크
        if(CheckTomato())
            //토마토가 전부 익었다면 토마토가 익은 날짜 출력
            System.out.println(day);
        else
            //그 외는 토마토가 전부 익지 않았기에 -1 출력
            System.out.println(-1);
    }

    //for문으로 돌아가면서 익지 않은 토마토가 있는 지 찾아낸다. 하나라도 0이 있으며 false를 반환
    static boolean CheckTomato() {
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                if (arr[i][j] == 0)
                    return false;
            }
        }
        return true;
    }
}