import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int cnt = 1, temp = 0;

        if (N != 1) {
            while (true) {
                if (temp == 1) {
                    System.out.println(cnt);
                    break;
                }
                if (N % 2 == 0) {
                    temp = N / 2;
                } else {
                    temp = (3 * N) + 1;
                }
                cnt++;
                N = temp;
            }

        } else System.out.println(N);
    }
}
