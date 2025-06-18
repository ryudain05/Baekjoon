import java.util.*;
import java.lang.*;

class Solution {
    public int solution(int num, int k) {
        String s = String.valueOf(num);
        int answer = 0;
        
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) - '0' == k) {
                answer = i + 1;
                break;
            }
        }
        
        return (answer > 0) ? answer : -1;
    }
}