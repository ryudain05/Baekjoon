class Solution {
    boolean solution(String s) {
        int count = 0;
        
        for(int i= 0; i<s.length(); i++){
            char ch = s.charAt(i);
            
            if(ch == 'p' || ch =='P') count++;
            else if(ch=='y'||ch=='Y') count --;
        }
        
        
        return count == 0;
    }
}