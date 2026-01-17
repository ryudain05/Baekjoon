import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        List<String> list = new ArrayList<String>();
        for (int i =0; i < my_str.length(); i = i+n) {
            if (i+n < my_str.length()) {
                list.add(my_str.substring(i, i+n));
            } else {
                list.add(my_str.substring(i));
            }
        }
        return list.toArray(new String[0]);
    }
}