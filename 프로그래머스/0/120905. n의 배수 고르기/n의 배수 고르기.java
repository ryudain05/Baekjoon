import java.util.*;

class Solution {
    public int[] solution(int n, int[] numlist) {
        List<Integer> answer = new ArrayList<>();
        for(int list: numlist) {
            if(list % n == 0) 
            answer.add(list);
        }
        
        int[] arr = answer.stream().mapToInt(i -> i).toArray();
        return arr;
    }
}