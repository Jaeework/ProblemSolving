// Baekjoon 2548 대표 자연수 : 정렬, 탐색
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        String[] str = br.readLine().split(" ");

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        int answer = min;
        long minSum = Long.MAX_VALUE;

        for(int i = min; i <=max; i++) {
            long sum = 0;
            for(int j = 0; j < n; j++) {
                sum += Math.abs(i - arr[j]);
            }

            if(sum < minSum) {
                minSum = sum;
                answer = i;
            }
        }

        // Arrays.sort(arr);
        // int mid = arr[(n - 1) / 2];

        // System.out.println(mid);
        System.out.println(answer);


        br.close();
    }
    
}
