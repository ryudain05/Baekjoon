import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    static int N, M;
    static List<List<Integer>> list;
    static int[] indegree;
    static StringBuilder sb;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        indegree = new int[N + 1];
        list = new ArrayList<List<Integer>>();


        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<Integer>());
        }


        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            list.get(n).add(m);
            indegree[m]++;
        }

        topologicalSort();

        System.out.println(sb);

    }

    static void topologicalSort() {
        Queue<Integer> queue = new LinkedList<Integer>();

        for (int i = 1; i <= N; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            while (!queue.isEmpty()) {
                int node = queue.poll();

                sb.append(node).append(" ");

                for (int j = 0; j < list.get(node).size(); j++) {
                    indegree[list.get(node).get(j)]--;

                    if (indegree[list.get(node).get(j)] == 0) {
                        queue.offer(list.get(node).get(j));
                    }
                }
            }
        }
    }
}