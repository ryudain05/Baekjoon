import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {
    static int N, M, I, count = 1;
    static boolean[] visit;
    static int[] result;
    static List<List<Integer>> list = new ArrayList<>();

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        I = Integer.parseInt(st.nextToken());

        result = new int[N + 1];
        visit = new boolean[N + 1];

        for (int i = 0; i <= N; i++) {
            list.add(new ArrayList<>());
        }

        for (int j = 0; j < M; j++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.get(a).add(b);
            list.get(b).add(a);
        }

        DFS(I);

        for (int s = 1; s <= N; s++) {
            System.out.print(result[s] + "\n");
        }
    }

    public static void DFS(int start) {
        visit[start] = true;
        result[start] = count++;
        Collections.sort(list.get(start), Collections.reverseOrder());

        for (Integer n : list.get(start)) {
            if (!visit[n])
                DFS(n);
        }
    }
}
