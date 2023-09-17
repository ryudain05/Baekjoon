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

        List<String> list = new ArrayList<>();

        HashSet<String> set = new HashSet<>();

        for(int i =0; i < N; i++) {
            set.add(br.readLine());
        }

        for(int i =0; i<M; i++) {
            String input = br.readLine();

            if(set.contains(input)) {
                list.add(input);
            }
        }

        Collections.sort(list);

        System.out.println(list.size());
        for(String s : list) {
            System.out.println(s);
        }
    }
}
