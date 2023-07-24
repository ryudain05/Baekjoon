import java.io.*;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //문자열 수 입력
        int N = Integer.parseInt(br.readLine());
        String[] num = new String[N];
        
        //문자열 입력
        for (int i = 0; i < N; i++) {
            num[i] = br.readLine();
        }

        Arrays.sort(num, new Comparator<String>() {
            @Override
            //compare 메소드 타입은 3가지로 리턴 양의 정수, 0, 음의 정수
            // 양의 정수면 위치를 바꾸고, 0과 음의 정수면 위치를 바꾸지 않음.
            public int compare(String o1, String o2) {
                //길이가 서로 같다면 사전순으로 정렬
                if(o1.length()==o2.length()) {
                    return o1.compareTo(o2);
                    //그 외는 길이순으로 정렬 
                } else return o1.length() - o2.length();
            }
        });

        //문자열 합치기 
        StringBuilder sb = new StringBuilder();

        //0번째 문자열부터 합치기
        sb.append(num[0]).append("\n");

        //num[i]가 num[i-1]과 같지 않을때만 문자열에 추가. 중복제거
        for(int i =1; i< N; i++) {
            if(!num[i].equals(num[i-1])) {
                sb.append(num[i]).append("\n");
            }
        }

        //결과값 출력
        System.out.println(sb);

    }
}