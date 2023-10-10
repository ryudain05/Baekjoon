import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        String s;

        while (true) {
            s = br.readLine();
            if (s == null || s.isEmpty()) {
                break;
            }

            sb = new StringBuilder();
            int upper = 0, lower = 0, num = 0, line = 0;
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (ch >= 'a' && ch <= 'z')
                    lower++;
                else if (ch >= 'A' && ch <= 'Z')
                    upper++;
                else if (ch >= '0' && ch <= '9')
                    num++;
                else if (ch == ' ') line++;
            }

            sb.append(lower).append(" ").append(upper).append(" ").append(num).append(" ").append(line);

            System.out.println(sb);
        }
    }
}
