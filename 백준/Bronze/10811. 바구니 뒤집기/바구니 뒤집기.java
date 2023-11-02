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

        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }


        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int K = Integer.parseInt(st.nextToken());
            int Q = Integer.parseInt(st.nextToken());

            for (int j = K; j <= Q; j++, Q--) {
                int temp = arr[j-1];
                arr[j-1] = arr[Q-1];
                arr[Q-1] = temp;
            }
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}