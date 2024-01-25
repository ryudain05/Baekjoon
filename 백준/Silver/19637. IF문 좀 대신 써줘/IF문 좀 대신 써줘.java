import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String[][] arr = new String[N][2];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        while (M-- > 0) {
            int num = Integer.parseInt(br.readLine());

            int left = 0;
            int right = N - 1;
            int mid = (left + right) / 2;

            while (left <= right) {
                mid = (left + right) / 2;
                int check = Integer.parseInt(arr[mid][1]);

                if (check < num) {
                    left = mid + 1;
                } else right = mid - 1;
            }
            sb.append(arr[left][0]).append("\n");
        }

        System.out.println(sb);
    }
}