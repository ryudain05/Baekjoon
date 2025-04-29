import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
    	my_string = my_string.replaceAll("[a-z]", ""); 
        
        String[] result = my_string.split("");
        int[] sortResult = new int[result.length];
        
        for(int i = 0; i<result.length; i++) {
            sortResult[i] = Integer.parseInt(result[i]);
        }
        
        Arrays.sort(sortResult);
        return sortResult;
    }
}