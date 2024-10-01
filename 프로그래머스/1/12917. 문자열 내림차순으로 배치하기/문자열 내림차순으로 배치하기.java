import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        
        StringBuilder sb = new StringBuilder();
        answer = sb.append(ch).reverse().toString();
        
        return answer;
    }
}