import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    static Integer[] memo;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        memo = new Integer[N + 1];
        
        //0이랑 1은 이동 수가 0임
        memo[0] = memo[1] = 0;

        System.out.println(dp(N));
    }

    static int dp(int n) {

        if (memo[n] == null) {
            if (n % 6 == 0) {
                memo[n] = Math.min(dp(n - 1), Math.min(dp(n / 3), dp(n / 2))) + 1;

            } else if (n % 3 == 0) {
                memo[n] = Math.min(dp(n / 3), dp(n - 1)) + 1;

            } else if (n % 2 == 0) {
                memo[n] = Math.min(dp(n / 2), dp(n - 1)) + 1;

            } else memo[n] = dp(n - 1) + 1;
        }
        return memo[n];
    }
}

