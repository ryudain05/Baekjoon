import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    static Integer[] memo;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        memo = new Integer[11];

        //일단 정수 3까진 4번 (최대한 쪼개서 작은 문제로 구해진 문제를 메모제이션 저장)
        memo[0] = 0;
        memo[1] = 1;
        memo[2] = 2;
        memo[3] = 4;

        while (N-- > 0) {
            int n = Integer.parseInt(br.readLine());
            for (int i = 4; i <= n; i++) {
                memo[i] = memo[i - 1] + memo[i - 2] + memo[i - 3];
            }

            System.out.println(memo[n]);
        }
    }
}

