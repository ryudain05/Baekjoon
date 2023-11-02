import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();

        StringBuilder sb = new StringBuilder(s);
        sb.reverse();

        int res = 1;
        for (int i = 0; i < s.length()/2; i++) {
            if(s.charAt(i) != sb.charAt(i)) {
                res = 0;
            }
        }

        System.out.println(res);

    }
}