// Baekjoon 2470 두 용액 : Sorting, Two Pointer

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(nums);

        // Math.abs
        int min = Integer.MAX_VALUE;
        int left = 0;
        int right = n - 1;

        int a = 0;
        int b = 0;

        while(left < right) {
            int sum = nums[left] + nums[right];

            if(min > Math.abs(sum)) {
                min = Math.abs(sum);
                a = nums[left];
                b = nums[right];

                if(sum == 0) break;
            }

            if(sum > 0) right--;
            else if(sum < 0) left++;
        }

        System.out.println(a + " " + b);
        br.close();
    }

}
