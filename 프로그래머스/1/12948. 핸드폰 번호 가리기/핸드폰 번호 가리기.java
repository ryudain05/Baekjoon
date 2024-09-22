class Solution {
    public String solution(String phone_number) {
        
        String result = "";
        for(int i =0; i<phone_number.length(); i++) {
            if(i < phone_number.length() - 4) {
                result += "*";
            } else result += phone_number.charAt(i);
                
        }
        
        return result;
    }
}