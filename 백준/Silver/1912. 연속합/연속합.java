import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        int[] memo = new int[N];


        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        memo[0] = arr[0];
        int max = arr[0];

        for (int i = 1; i < N; i++) {
            memo[i] = Math.max(memo[i - 1] + arr[i], arr[i]);
            max = Math.max(max, memo[i]);
        }

        System.out.println(max);


    }
}