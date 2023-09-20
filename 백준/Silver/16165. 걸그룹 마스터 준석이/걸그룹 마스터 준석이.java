import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String team = br.readLine();

            int num = Integer.parseInt(br.readLine());

            StringBuilder value = new StringBuilder();

            for (int j = 0; j < num; j++) {
                value.append(br.readLine()).append(" ");
            }

            map.put(team, value.toString().trim());
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {

            String s = br.readLine();
            int k = Integer.parseInt(br.readLine());

            if (k == 1) {
                for (Map.Entry<String, String> m : map.entrySet())
                    if (m.getValue().contains(s)) sb.append(m.getKey()).append("\n");
            } else {
                String[] result = map.get(s).split(" ");
                Arrays.sort(result);
                for (String member : result) {
                    sb.append(member).append("\n");
                }
            }
        }

        System.out.println(sb.toString());

    }
}
