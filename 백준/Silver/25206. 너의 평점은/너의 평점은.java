import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = 20;
        double avg = 0, sum = 0;

        while (N-- > 0) {
            st = new StringTokenizer(br.readLine());

            String s = st.nextToken();
            double M = Double.parseDouble(st.nextToken());
            String K = st.nextToken();

            if (K.equals("A+")) {
                avg += M * 4.5;
                sum += M;
            } else if (K.equals("A0")) {
                avg += M * 4.0;
                sum += M;
            } else if (K.equals("B+")) {
                avg += M * 3.5;
                sum += M;
            } else if (K.equals("B0")) {
                avg += M * 3.0;
                sum += M;
            } else if (K.equals("C+")) {
                avg += M * 2.5;
                sum += M;
            } else if (K.equals("C0")) {
                avg += M * 2.0;
                sum += M;
            } else if (K.equals("D+")) {
                avg += M * 1.5;
                sum += M;
            } else if (K.equals("D0")) {
                avg += M * 1.0;
                sum += M;
            } else if (K.equals("F")) {
                avg += M * 0.0;
                sum += M;
            }
        }
        System.out.printf("%.6f", avg / sum);
    }

}