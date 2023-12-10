import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static int dx[] = {0, 0, -1, 1};
    static int dy[] = {-1, 1, 0, 0};
    static int map[][];
    static boolean visit[][];
    static int M, N, K, T, nowX, nowY, count;

    static class Node {
        int x;
        int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            K = Integer.parseInt(st.nextToken());

            map = new int[N][M];
            visit = new boolean[N][M];

            for (int j = 0; j < K; j++) {
                st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                map[y][x] = 1;
            }

            count = 0;
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < M; k++) {
                    if (visit[j][k] == false && map[j][k] == 1) {
                        count++;
                        bfs(k, j);
                    }
                }
            }
            StringBuilder sb = new StringBuilder();

            sb.append(count).append("\n");
            System.out.print(sb);
        }
    }


    static void bfs(int x, int y) {
        Queue<Node> queue = new LinkedList<>();

        queue.offer(new Node(x, y));
        visit[y][x] = true;

        while (!queue.isEmpty()) {
            Node node = queue.poll();

            for (int i = 0; i < 4; i++) {
                nowX = node.x + dx[i];
                nowY = node.y + dy[i];

                if (nowX < 0 || nowX >= M || nowY < 0 || nowY >= N) continue;

                if (visit[nowY][nowX] == false && map[nowY][nowX] == 1) {
                    queue.offer(new Node(nowX, nowY));
                    visit[nowY][nowX] = true;
                }


            }
        }
    }
}