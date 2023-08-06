import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int six = 1000;
        int num = 1000;
        int min = 0;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            six = Math.min(six, Integer.parseInt(st.nextToken()));
            num = Math.min(num, Integer.parseInt(st.nextToken()));
        }


        //가장 싼 팩으로만 할지 vs 가장 싼 낱개로만 할지 vs 가장 싼 팩 + 낱개
        min = Math.min(((N / 6) + 1) * six, N * num);
        min = Math.min(min, (N / 6) * six + (N % 6) * num);

        System.out.println(min);


    }
}