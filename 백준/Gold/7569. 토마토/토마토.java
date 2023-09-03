import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    static int[][][] arr;

    static int N, M, H;

    //상하좌우위아래
    static int[] dx = {0, 0, -1, 1, 0, 0};
    static int[] dy = {-1, 1, 0, 0, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};

    //내부클래스 선언
    static class Dot {
        int x;
        int y;
        int z;

        int day;

        public Dot(int z, int x, int y, int day) {
            this.z = z;
            this.x = x;
            this.y = y;
            this.day = day;
        }
    }


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        ;

        //가로, 세로, 높이
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        //높이, 세로, 가로 만큼 배열 할당
        arr = new int[H + 1][N + 1][M + 1];

        //배열에 입력받음
        for (int k = 0; k < H; k++) {
            for (int i = 0; i < N; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < M; j++) {
                    arr[k][i][j] = Integer.parseInt(st.nextToken());
                }
            }
        }

        //bfs호출
        bfs();
    }


    //BFS를 이용하여 탐색
    static void bfs() {

        //큐 선언
        Queue<Dot> queue = new LinkedList<>();
        int day = 0;

        //토마토가 익은 게 있다면 큐에 넣기. day 초기값은 0
        for (int k = 0; k < H; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[k][i][j] == 1) {
                        queue.offer(new Dot(k, i, j, 0));
                    }
                }
            }
        }

        //큐가 비어있지 않으면 반복
        while (!queue.isEmpty()) {
            //큐에 저장 된 값을 클래스에 담기
            Dot dot = queue.poll();
            day = dot.day;

            //상하좌우위아래를 돌아보면서 확인하기
            for (int i = 0; i < 6; i++) {
                int nz = dot.z + dz[i], nx = dot.x + dx[i], ny = dot.y + dy[i];

                //범위내에 있는 지 확인. 범위를 벗어나면 무시함
                if (nz < 0 || nx < 0 || ny < 0 || nx >= N || ny >= M || nz >= H) {
                    continue;
                }

                //토마토가 익지 않은 게 있다면 익은 상태로 바꿔주고, day +1
                if (arr[nz][nx][ny] == 0) {
                    arr[nz][nx][ny] = 1;
                    queue.offer(new Dot(nz, nx, ny, day + 1));
                }
            }
        }

        //토마토가 익지 않은 게 있는 지 확인. 하나라도 익지 않았다면 -1 출력
        if (CheckTomato()) {
            System.out.println(day);
        } else System.out.println(-1);
    }


    //토마토 상자를 돌아보면서 익지않은 토마토가 있는 지 확인. 있으면 false, 모두 익었다면 true
    static boolean CheckTomato() {
        for (int k = 0; k < H; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    if (arr[k][i][j] == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}