import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] sorted = new int[N];
        int[] origin = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());;
        for (int i = 0; i < N; i++) {
            sorted[i] = origin[i] = Integer.parseInt(st.nextToken());
        }

        Map<Integer, Integer> map = new HashMap<>();

        Arrays.sort(sorted);

        int rank = 0;
        for(int sor: sorted) {

            if(!map.containsKey(sor)) {
                map.put(sor, rank);
                rank++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int key: origin) {
            int ranking = map.get(key);
            sb.append(ranking).append(" ");
        }

        System.out.println(sb);

    }
}
