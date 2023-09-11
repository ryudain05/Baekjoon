import java.io.*;
import java.util.StringTokenizer;
import java.util.TreeMap;


public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;


        //테스트 케이스 개수 입력받기
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            TreeMap<Integer, Integer> map = new TreeMap<>();
            //한번의 테스트 케이스는 N개의 숫자를 가짐
            int N = Integer.parseInt(br.readLine());

            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());

                char ch = st.nextToken().charAt(0);
                int Q = Integer.parseInt(st.nextToken());

                //I입력이라면
                if (ch == 'I') {
                    //Q삽입 찾는 키가 없다면 0 반환. 있다면 key에 매핑된 값을 반환하고 +1증가
                    map.put(Q, map.getOrDefault(Q, 0) + 1);
                }
                //D이면서 TreeMap이 비어있을땐 그냥 건너뜀
                else if (map.size() == 0) {
                    continue;
                } else {
                    //D입력이면서 Q값이 1이면 가장 큰키를 key변수에 할당, 아니라면 작은 키를 할당
                    int key = Q == 1 ? map.lastKey() : map.firstKey();
                    //이전 단계에서 지정한 키값을 가져옴
                    int cnt = map.get(key);

                    //cnt가 1인 경우엔 해당 키를 제거, cnt가 1보다 크다면 키값 1만큼 감소(중복값 제거)
                    if (cnt == 1) map.remove(key);
                    else map.put(key, cnt - 1);
                }
            }
            //treemap이 비어져있다면 EMPTY반환, 아니면 최대값과 최소값을 문자열로 출력
            if (map.size() == 0) sb.append("EMPTY\n");
            else sb.append(map.lastKey()).append(" ").append(map.firstKey()).append("\n");
        }

        System.out.println(sb.toString());
    }
}