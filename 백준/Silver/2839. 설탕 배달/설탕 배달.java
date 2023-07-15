import java.io.*;

public class Main {
    //에러 처리를 위한 상수 선언
    static final int err = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //입력
        int N = Integer.parseInt(br.readLine());
        //결과값 담을 변수
        int res = 0;

        while (true) {
            //킬로그램이 5로 딱 나뉘어 질때
            if(N % 5 == 0) {
                //몫을 반환
                res += N / 5;
                System.out.println(res);
                break;
            }
            //5로 딱 나누어 지지 않을 때
            else {
                //입력 받은 킬로그램을 -3, -3이 된만큼 결과값 +1
                N -= 3;
                res++;
            }
            //-3을 계속 입력받았을 때 음수이면 나뉘어지지 않는 수이기 때문에 -1을 반환
            if(N<0) {
                System.out.println("-1");
                break;
            }
        }

    }
}