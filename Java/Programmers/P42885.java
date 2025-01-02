import java.util.Arrays;
// Programmers 42885 : Greedy, Two Pointer
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        int right = people.length - 1;
        int left = 0;
        
        while(left <= right) {
            if(people[right] + people[left] <= limit) {
                right--;
                left++;
            } else {
                right--;
            }
                answer++;
        }
        
        return answer;
    }
}
