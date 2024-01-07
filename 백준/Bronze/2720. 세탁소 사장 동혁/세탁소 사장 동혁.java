import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        while (N-- > 0) {
            StringBuilder sb = new StringBuilder();
            int M = Integer.parseInt(br.readLine());

            int q = M / 25;
            M %= 25;
            sb.append(q).append(" ");

            int d = M / 10;
            M %= 10;
            sb.append(d).append(" ");

            int n = M / 5;
            M %= 5;
            sb.append(n).append(" ");

            int p = M / 1;
            M %= 1;
            sb.append(p).append(" ");

            System.out.println(sb);
        }
    }
}