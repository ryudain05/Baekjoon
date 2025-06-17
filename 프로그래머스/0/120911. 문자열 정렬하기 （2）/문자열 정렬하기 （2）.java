import java.util.*;

class Solution {
    public String solution(String my_string) {
        char[] str = my_string.toLowerCase().toCharArray();
        String result = "";
        
        Arrays.sort(str);
        
        for(char c: str) {
            result += c;
        }
        
        return result;
    }
}