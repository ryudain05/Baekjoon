import java.io.*;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++) {
            //각 문자를 StringBuilder로 합침
            sb.append(result(br.readLine())).append("\n");
        }
        //결과 출력
        System.out.println(sb);
    }


    public static String result(String s) {
        //stack 생성
        Stack<Character> stack = new Stack<>();

        //입력받은 문자의 개수만큼 for문
        for(int i = 0; i < s.length(); i++) {

            /**
             * 각 라인의 한 문자별로 검사
             * s.charAt(i) == '(' 일땐 stack에 push
             * s.charAt(i) == ')' 일땐 stack에 pop
             * 결과
             * 1. stack에 문자를 넣는 도중에 스택이 비워지면 올바른 괄호X
             * 2. stack에 입력이 모두 끝났을 때 stack이 깨끗하다면 올바른 괄호
             * 3. stack에 입력이 모두 끝났을 때 stack에 문자가 남아있으면 올바른 괄호X
             */

            //문자가 '('면 stack에 push
            if(s.charAt(i) == '(') {
                stack.push(s.charAt(i));
            }
            //중간에 stack이 비워지면 NO를 반환
            else if (stack.empty()){
                return "NO";
            }
            //그 외는 모두 pop
            else
                stack.pop();
        }

        //stack에 문자를 넣는 것이 끝나고 스택이 비워있으면 YES를 반환, 그 외는 NO를 반환
        if (stack.empty()) {
            return "YES";
        } else return "NO";
    }
}