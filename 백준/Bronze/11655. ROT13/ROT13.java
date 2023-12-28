import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();
        String s = br.readLine();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (!Character.isLetter(ch)) {
                sb.append(ch);
                continue;
            }

            int n = (int) ch + 13;

            if (Character.isUpperCase(ch) && n > 90) {
                n -= 26;
            }
            if (Character.isLowerCase(ch) && n > 122) {
                n -= 26;
            }
            sb.append((char) n);
        }

        System.out.println(sb);

    }
}