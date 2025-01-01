class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        int[] occupation = new int[n + 1];
        
        for(int l : lost) {
            occupation[l] -= 1;
        }
        
        for(int r : reserve) {
            occupation[r] += 1;
        }
        
        for(int i = 1; i <= n; i++) {
            if(occupation[i] >= 0) {
                answer++;
                continue;
            }
            if(occupation[i] == -1) {
                if(i - 1 > 0 && occupation[i - 1] == 1) {
                    occupation[i - 1] -= 1;
                    occupation[i] += 1;
                    answer++;
                    continue;
                }
                if(i+1 < n+1 && occupation[i + 1] == 1) {
                    occupation[i + 1] -= 1;
                    occupation[i] += 1;
                    answer++;
                    continue;
                }
            }
        }
        
        return answer;
    }
}
