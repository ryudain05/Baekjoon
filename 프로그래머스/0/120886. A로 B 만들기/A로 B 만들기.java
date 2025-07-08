import java.util.*;

class Solution {
    public int solution(String before, String after) {
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        
        Arrays.sort(a);
        Arrays.sort(b);
        
        String str1 = new String(a);
        String str2 = new String(b);
        
        return str1.equals(str2) ? 1 : 0;
    }
}