import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        String s = br.readLine();
        int N = Integer.parseInt(br.readLine());
        int q = s.length();

        int[][] sum = new int[q + 1][26];
        sum[1][s.charAt(0) - 'a']++;

        for(int i =1; i<=q; i++) {
            int idx = s.charAt(i - 1) - 'a';

            for(int j=0; j<26; j++) {
                int before = sum[i - 1][j];
                sum[i][j] = j == idx ? before + 1 : before;
            }
        }

        for(int i =0; i<N; i++) {
            st = new StringTokenizer(br.readLine());
            int idx = st.nextToken().charAt(0) - 'a';
            int start = Integer.parseInt(st.nextToken())+1;
            int end = Integer.parseInt(st.nextToken()) + 1;
            sb.append((sum[end][idx] - sum[start - 1][idx]) + "\n");
        }
        System.out.println(sb);
    }
}
