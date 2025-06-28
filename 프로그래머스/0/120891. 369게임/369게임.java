import java.util.*;

class Solution {
    public int solution(int order) {
        int answer = 0;
        String[] str = Integer.toString(order).split("");
        
        for (int i = 0; i < str.length; i++) {
            if(str[i].equals("3") || str[i].equals("6") || str[i].equals("9")) {
                answer++;
            }
        }
        return answer;
    }
}