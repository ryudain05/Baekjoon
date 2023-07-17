import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        //입력
        int N = Integer.parseInt(br.readLine());

        //동전들
        int coin[] = {500, 100, 50, 10, 5, 1};

        //결과값 변수
        int num = 1000 - N;
        int res = 0;

        //큰 동전부터 검사해서 최솟값 출력
        for(int i = 0; i <= coin.length-1; i++) {
                //num를 나눠서 몫을 저장
                res += num/coin[i];
                //나머지를 num로 저장한 후 배열 전체 돌려보기
                num %= coin[i];
            }
        //결과값 출력
        System.out.println(res);

    }
}