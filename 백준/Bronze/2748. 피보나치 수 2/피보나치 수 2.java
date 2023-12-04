import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    static Long[] memo;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        memo = new Long[N + 1];
        memo[0] = 0L;
        memo[1] = 1L;

        System.out.println(fibonacci(N));
    }

    static long fibonacci(int n) {
        if(memo[n] == null) {
            memo[n] = fibonacci(n - 1) + fibonacci(n - 2);
        }
        return memo[n];
    }
}

