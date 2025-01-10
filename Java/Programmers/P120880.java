// Programmers 120880 : Sort
class Solution {
    public int[] solution(int[] numlist, int n) {

        for(int i = 0; i < numlist.length; i++) {
            int minIdx = i;
            for(int j = i+1; j < numlist.length; j++) {
                int diffMin = Math.abs(numlist[minIdx] - n);
                int diffCurr = Math.abs(numlist[j] - n);
                if(diffMin > diffCurr || (diffMin == diffCurr && numlist[minIdx] < numlist[j])) {
                    minIdx = j;
                }
            }
            
            if(minIdx != i) {
                int tmp = numlist[minIdx];
                numlist[minIdx] = numlist[i];
                numlist[i] = tmp;
            }
        }
            
        return numlist;
    }
}
