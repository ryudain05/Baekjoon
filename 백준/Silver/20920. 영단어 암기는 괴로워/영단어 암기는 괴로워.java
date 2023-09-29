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

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            if (s.length() < M) continue;
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        List<String> word = new ArrayList<>(map.keySet());

        word.sort(((o1, o2) -> {
            int c1 = map.get(o1);
            int c2 = map.get(o2);

            if (c1 == c2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                } else return o2.length() - o1.length();
            }
            return c2 - c1;
        }));

        StringBuilder sb = new StringBuilder();


        for(String s : word) {
            sb.append(s).append("\n");
        }

        System.out.println(sb);


    }
}
