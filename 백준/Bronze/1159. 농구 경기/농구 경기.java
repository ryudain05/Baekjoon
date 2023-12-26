import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];

        int N = Integer.parseInt(br.readLine());  //선수의 수
        boolean possible = false;  //다섯 명을 선발할 수 있는지

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            char ch = name.charAt(0);  //첫 글자
            arr[ch - 97]++;  //아스키 코드 이용
            if (arr[ch - 97] == 5) possible = true;  //5명이 되면 5명을 선발할 수 있다
        }
        if (possible) {
            for (int i = 0; i < 26; i++) {
                if (arr[i] >= 5) System.out.print((char) (i + 97));
            }
        } else {
            System.out.print("PREDAJA");
        }
    }
}