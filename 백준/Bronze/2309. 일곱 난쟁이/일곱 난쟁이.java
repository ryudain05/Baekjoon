import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class Main {

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        int fake1 = 0, fake2 = 0, sum = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    fake1 = arr[i];
                    fake2 = arr[j];
                }
            }
        }

        Arrays.sort(arr);

        for (int i : arr) {
            if (i == fake1 || i == fake2) {
                continue;
            }
            System.out.println(i);
        }
    }
}