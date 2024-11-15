import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {
    static char[][] arr;
    static boolean[][] visited;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int N;


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int result1 = 0, result2 = 0;


        arr = new char[N + 1][N + 1];

        for (int i = 0; i < N; i++) {
                arr[i] = br.readLine().toCharArray();
        }

        visited = new boolean[N + 1][N + 1];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    bfs(i, j, arr[i][j]);
                    result1++;
                }
                if (arr[i][j] == 'G') {
                    arr[i][j] = 'R';
                }
            }
        }

        visited = new boolean[N + 1][N + 1];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (!visited[i][j]) {
                    bfs(i, j, arr[i][j]);
                    result2++;
                }
            }
        }

        System.out.println(result1 + " " + result2);
    }


    static void bfs(int x, int y, char n) {
        //큐 선언
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});

        visited[x][y] = true;

        //큐가 비어있지 않으면
        while (!queue.isEmpty()) {

            int data[] = queue.poll();
            int curx = data[0], cury = data[1];

            for (int i = 0; i < 4; i++) {
                int netx = curx + dx[i], nety = cury + dy[i];

                if (netx >= 0 && nety >= 0 && netx < N && nety < N) {
                    if (arr[netx][nety] == n && !visited[netx][nety]) {
                        visited[netx][nety] = true;
                        queue.offer(new int[]{netx, nety});
                    }
                }
            }
        }
    }
}