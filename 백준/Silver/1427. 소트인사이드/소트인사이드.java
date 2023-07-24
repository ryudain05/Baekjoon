import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //입력을 문자로 쪼개서 배열에 넣기
        char[] arr = br.readLine().toCharArray();

        //오름차순 정렬
        Arrays.sort(arr);

        //내림차순 출력
        for(int i = arr.length-1; i >= 0; i--){
            System.out.print(arr[i]);
        }

    }
}