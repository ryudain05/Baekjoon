import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.*;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        String str;
        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str);

            String s = st.nextToken();
            String n = st.nextToken();

            boolean check = false;
            int x = 0;

            for (int i = 0; i < n.length(); i++) {
                if (s.charAt(x) == n.charAt(i)) x++;
                if (s.length() == x) {
                    check = true;
                    break;
                }
            }

            System.out.println(check ? "Yes" : "No");
        }
    }
}
