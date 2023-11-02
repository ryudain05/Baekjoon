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

        StringBuilder sb = new StringBuilder();
        while (N != 0) {
            if (N % M >= 10) sb.append((char) ((N % M) + 55));
            else sb.append(N % M);
            N /= M;
        }

        System.out.println(sb.reverse().toString());

    }
}