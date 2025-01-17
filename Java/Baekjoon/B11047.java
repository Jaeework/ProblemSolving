// Baekjoon 11047 : Greedy

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");

        int n = Integer.parseInt(nums[0]);
        int k = Integer.parseInt(nums[1]);

        int[] coins = new int[n];
        for(int i = 0; i < n; i++) {
            coins[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(coins);

        int cnt = 0;
        int idx = n - 1;

        while(k > 0) {
            cnt += k / coins[idx];
            k %= coins[idx];
            idx--;
        }

        System.out.println(cnt);
        br.close();
    }
    
}
