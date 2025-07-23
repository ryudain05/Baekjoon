import java.util.*;

class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        
        for (int num = i; num<=j; num++) {
            String n = String.valueOf(num);
            for(int idx = 0; idx < n.length(); idx++) {
                if(String.valueOf(n.charAt(idx)).equals(String.valueOf(k))) {
                    answer++;
                }   
            }
        }
        return answer;
    }
}