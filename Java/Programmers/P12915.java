// Programmers 12915 : Sorting, String
import java.util.Arrays;

class Solution {
    public String[] solution(String[] strings, int n) {
        
        // Arrays.sort(strings);
        
        // Arrays.sort(strings, (a, b) -> {
        //     return a.charAt(n) - b.charAt(n); 
        // });

        Arrays.sort(strings, (a, b) -> {
            if(a.charAt(n) == b.charAt(n)) {
                return a.compareTo(b);
            }
            return a.charAt(n) - b.charAt(n); 
        });

        // mergeSort(strings, 0, strings.length - 1, n);
        
        return strings;
    }


    private static void mergeSort(String[] strings, int left, int right, int n) {
        if(left >= right) return;
        
        int mid = left + (right - left) / 2;
        
        mergeSort(strings, left, mid, n);
        mergeSort(strings, mid+1, right, n);
        
        merge(strings, left, mid, right, n);
    }
    
    private static void merge(String[] strings, int left, int mid, int right, int n) {
        int leftSize = mid - left + 1;
        int rightSize = right - mid;
        
        String[] leftArray = new String[leftSize];
        String[] rightArray = new String[rightSize];
        
        for(int i = 0; i < leftSize; i++) {
            leftArray[i] = strings[left + i];
        }
        
        for(int i = 0; i < rightSize; i++) {
            rightArray[i] = strings[mid + 1 + i];
        }
        
        int li = 0; int ri = 0; int k = left;
        while(li < leftSize && ri < rightSize) {
            char a = leftArray[li].charAt(n);
            char b = rightArray[ri].charAt(n);
            
            if(a < b || (a == b && leftArray[li].compareTo(rightArray[ri]) <= 0)) {
                strings[k++] = leftArray[li++];
            } else {
                strings[k++] = rightArray[ri++];
            }
        }
        
         while (li < leftSize) {
            strings[k++] = leftArray[li++];
        }
        while (ri < rightSize) {
            strings[k++] = rightArray[ri++];
        }
    }

}
