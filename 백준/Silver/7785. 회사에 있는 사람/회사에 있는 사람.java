import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        HashMap<String, String> map = new HashMap<>();


        for(int i=0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String enter = st.nextToken();

            if(map.containsKey(name)) {
                map.remove(name);
            } else map.put(name, enter);
        }

        List<String> list = new ArrayList<>(map.keySet());
        Collections.sort(list, Comparator.reverseOrder());

        for(String s : list) {
            System.out.println(s);
        }
    }
}
