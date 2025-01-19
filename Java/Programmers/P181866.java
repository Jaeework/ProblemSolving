// Programmers 181866 : Sorting, String
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(String myString) {
        String[] answer = myString.split("x");
        List<String> li = new ArrayList<>();
        
        for(String s : answer) {
            if(!s.equals("")) {
                li.add(s);
            }
        }
        answer = li.toArray(new String[0]);
        
        Arrays.sort(answer);
        return answer;
    }
}
