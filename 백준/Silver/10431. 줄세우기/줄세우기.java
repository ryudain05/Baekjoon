import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());
            int T = Integer.parseInt(st.nextToken());
            int res = 0;

            int[] arr = new int[20];
            for (int i = 0; i < 20; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            for (int i = 1; i < 20; i++) {
                for (int j = i - 1; j >= 0; j--) {
                    if (arr[j] > arr[i]) {
                        res++;
                    }
                }
            }

            System.out.println(T + " " + res);
        }
    }

}