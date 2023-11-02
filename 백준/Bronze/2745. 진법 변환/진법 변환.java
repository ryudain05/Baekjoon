import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String s = st.nextToken();
        int N = Integer.parseInt(st.nextToken());

        int sum = 0;
        int tmp = 1;
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                sum += (c - 'A' + 10) * tmp;
            } else sum += (c - '0') * tmp;

            tmp *= N;
        }

        System.out.println(sum);

    }
}