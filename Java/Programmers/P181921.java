// Programmers 181921 : Array

import java.util.ArrayList;

class Solution {
    public int[] solution(int l, int r) {
        int[] answer = {};
        ArrayList<Integer> li = new ArrayList<Integer>();
        
        
        for(int i = l; i < r+1; i++) {
            String tmp = String.valueOf(i);
            boolean isFalse = false;
            for(int j = 0; j < tmp.length(); j++) {
                if(tmp.charAt(j) == '0' || tmp.charAt(j) == '5') continue;
                isFalse = true;
            }
            
            if(!isFalse) li.add(i);
        }

        if(li.size() == 0) return new int[]{-1};
        answer = new int[li.size()];
        for(int i = 0; i < li.size(); i++) {
            answer[i] = li.get(i);
        }
        
        return answer;
    }
}
