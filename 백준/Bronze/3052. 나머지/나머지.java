import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            int N = Integer.parseInt(br.readLine()) % 42;
            set.add(N);
        }

        System.out.println(set.size());
    }
}