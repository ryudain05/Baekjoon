import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        
        if(arr.length <= 1 ) {
            int[] answer = {-1};
            return answer;
        }
            
        int[] answer = new int[arr.length-1];
        
        int min = arr[0];
        
        for(int i: arr) {
            min = Math.min(min, i);
        }
        
        int index = 0;
        for(int i: arr) {
            if(i==min) continue;
            answer[index++] += i;
        }
        
        return answer;
    }
}