import java.io.*;
import java.util.Stack;

/**
 * 결과
 * - 입력받은 문자가 홀수면 바로 return -> 좋은 단어가 아님
 * - 첫번째 문자를 스택에 push함으로서 하나씩 문자들을 비교
 * 1. 스택이 비어있지 않으면서, 스택의 최상위 문자와 현재 문자가 같으면 "좋은 단어"임, 스택을 비움.
 * 2. 그 외는 스택에 push함으로서 스택이 비게되면 좋은 단어, 그렇지 않으면 좋은 단어가 아님
 * 3. 스택이 빌때만 count++ -> count 반환
 */
public class Main {
    static int count;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            String s = br.readLine();
            result(s);
        }
        //결과 출력
        System.out.println(count);
    }


    public static void result(String s) {
        //입력받은 문자의 개수가 홀수면 좋은 단어가 아니게됨, 바로 return
        if(s.length() % 2 ==1) return;
        //stack 생성
        Stack<Character> stack = new Stack<>();

        //최상위문자를 기준으로 비교하기 위해 처음 문자를 stack에 push하고 시작
        stack.push(s.charAt(0));

        //입력받은 문자의 개수만큼 for문
        for(int i = 1; i < s.length(); i++) {
            //stack이 비어있지 않으면서, 최상위문자와 같으면 stack을 비워줌
            if(stack.size() > 0 && stack.peek() == s.charAt(i)) {
                stack.pop();
            }
            //그 외에 문자들은 push함
            else {
                stack.push(s.charAt(i));
            }
        }
        //stack이 비워지게 된다면 좋은 단어가 됨. 비워졌던 개수 count
        if(stack.isEmpty())
            count++;
    }
}