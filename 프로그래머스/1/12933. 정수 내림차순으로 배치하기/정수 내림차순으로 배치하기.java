import java.util.*;

class Solution {
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr);
        
        StringBuilder sb = new StringBuilder();
        
        for(String a: arr) {
            sb.append(a);
        }
        
        return Long.parseLong(sb.reverse().toString());
    }
}