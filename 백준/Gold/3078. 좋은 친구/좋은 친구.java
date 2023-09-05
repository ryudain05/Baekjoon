import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main {

    static int N, K;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //친구의 수와 등차 입력
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        friend[] friends = new friend[N];


        for (int i = 0; i < N; i++) {
            //클래스에 순서대로 저장
            friends[i] = new friend(i, br.readLine().length());
        }

        long answer = 0;

        //오름차순으로 정리
        Arrays.sort(friends);

        //큐 선언
        Queue<friend> q = new LinkedList<friend>();

        for(int i = 0; i< N; i++) {
            //큐가 비어있다면 넣어줌
            if(q.isEmpty()) {
                q.add(friends[i]);
            }
            //큐에 담긴 이름의 길이와 현재 클래스의 담겨있는 이름의 길이가 같으면서 현재 클래스의 랭크 - 큐에 담겨있는 랭크가 K보다 작거나 같을 때
            //큐의 size를 answer에 추가(A와 B가 좋은 친구이고, B와 C가 좋은 친구라면 A와 C는 무조건 좋은 친구이기 때문에)
            else if (q.peek().name==friends[i].name && friends[i].rank-q.peek().rank <= K) {
                answer += q.size();
                //큐에 현재 클래스 값들 추가
                q.offer(friends[i]);
            }
            else {
                //그 외는 값을 삭제하고 다시 검사해보기
                q.poll();
                i--;
            }
        }
        //결과값 출력
        System.out.println(answer);
    }


    //이름 길이순과 등수순으로 정리
    static class friend implements Comparable<friend>{
            int rank;
            int name;

        public friend(int rank, int name) {
            this.rank = rank;
            this.name = name;
        }

        //이름의 길이가 같다면 등수순으로 정렬, 아니면 이름순을 정렬 -> 이름 길이 순으로 우선정렬
        @Override
        public int compareTo(friend fd) {
            if(Integer.compare(this.name, fd.name) == 0) {
                return Integer.compare(this.rank, fd.rank);
            }
            return Integer.compare(this.name, fd.name);
        }
    }
}