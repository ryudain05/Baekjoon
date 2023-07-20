import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int res = 0;

        //N이 0보다 클때
        while (true) {
            //N이 5로 나뉘어진다면 -2를 한 횟수 + 몫을 함으로서 결과값 반환
            if (N % 5 == 0) {
                res = N / 5 + res;
                System.out.println(res);
                break;
            } else { //N이 5로 나뉘어지지 않는다면 N을 -2만큼 계속 빼줌. 이때 res값은 +1씩 증가
                N -= 2;
                res++;
            }
            //-2를 계속 하였을 때 음수이면 나뉘어지지 않는 값이므로 -1을 반환
            if (N < 0) {
                System.out.println("-1");
                break;
            }
        }
        
    }
}