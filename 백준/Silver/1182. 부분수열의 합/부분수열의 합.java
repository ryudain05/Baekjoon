import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static int N, M, count;

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N + 1];


        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        backtracking(0,0);

        //공집합일 경우를 체크
        System.out.println(M == 0 ? count - 1 : count);
    }

    static void backtracking(int index, int sum) {
        if(index == N) {
            if(sum == M) {
                count++;
            }
            return;
        }

        //원소가 선택되었을 때 더한 값과 원소가 선택되지 않을 때 결과값
        backtracking(index + 1, sum + arr[index]);
        backtracking(index + 1, sum);
    }
}