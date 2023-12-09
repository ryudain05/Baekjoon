import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {

    static int N;  // 찾고자 하는 문자열의 길이
    static String result;  // 최종 결과를 저장할 변수

    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());  // 문자열의 길이를 입력받음

        result = "";  // 결과 초기화
        backtracking("");  // 백트래킹 시작

        System.out.println(result);  // 결과 출력
    }

    // 백트래킹을 위한 함수
    public static void backtracking(String temp) {
        if (result != "") return;  // 결과가 이미 나왔다면 더 이상 진행하지 않음

        if (temp.length() == N) {  // temp의 길이가 N과 같다면(즉, 원하는 길이의 문자열을 만들었다면)
            result = temp;  // 결과에 temp를 저장하고
            return;  // 함수 종료
        }

        for (int i = 1; i <= 3; i++) {  // 1부터 3까지의 숫자를 temp에 추가
            if (check(temp + i)) {  // 만약 추가된 숫자가 조건을 만족한다면(즉, 부분 문자열이 반복되지 않는다면)
                backtracking(temp + i);  // 백트래킹 계속 진행
            }
        }
    }

    // 조건 검사를 위한 함수
    public static boolean check(String s) {
        for (int i = 1; i <= s.length() / 2; i++) {  // 1부터 문자열 길이의 절반까지
            for (int j = 0; j <= s.length() - i * 2; j++) {  // 문자열 내에서 가능한 모든 부분 문자열에 대해
                if (s.substring(j, j + i).equals(s.substring(j + i, j + i * 2))) {  // 만약 부분 문자열이 반복된다면
                    return false;  // false 반환
                }
            }
        }
        return true;  // 반복되는 부분 문자열이 없다면 true 반환
    }
}