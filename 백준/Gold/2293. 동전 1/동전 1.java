import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int arr[] = new int[N];
        int dp[] = new int[M + 1];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }


        dp[0] = 1;
        for (int i = 0; i < N; i++) {
            for(int j=1; j <= M; j++) {
                if(j >= arr[i])
                    dp[j] += dp[j - arr[i]];
            }
        }

        System.out.println(dp[M]);

    }
}