import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Long N = Long.parseLong(br.readLine());

        Long sum = 0L;
        int cnt = 0;

        for (int i = 1; ; i++) {
            if (sum > N) break;
            sum += i;
            cnt++;
        }
        System.out.println(cnt - 1);
    }
}