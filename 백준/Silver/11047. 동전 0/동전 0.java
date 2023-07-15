import java.io.*;
import java.util.StringTokenizer;

public class Main {
    //에러 처리를 위한 상수 선언
    static final int err = -1;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        //입력
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        //입력 동전들
        int coin[] = new int[N];
        //결과값 변수
        int res = 0;

        //변수에 값들 동전들 입력받기
        for (int i = 0; i < N; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }

        //큰 동전부터 검사해서 최솟값 출력
        for(int i = N-1; i >= 0; i--) {
            //N(준규가 가지고 있는 동전)보다 K(동전 가치의 합)이 더 작아야 성립됨
            if(coin[i]<=K) {
                //K를 나눠서 몫을 저장
                res += K/coin[i];
                //나머지를 K로 저장한 후 N을 전부 돌려보기
                K %= coin[i];
            }
        }
        //결과값 출력
        System.out.println(res);

    }
}