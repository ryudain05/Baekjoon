import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] s = new int[N];

        for (int i = 0; i < N; i++) {
            s[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(s);

        for(int arr: s) {
            System.out.println(arr);
        }

    }
}
