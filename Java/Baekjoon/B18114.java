// Baekjoon 18114 블랙 프라이데이 : 정렬, 탐색, 투포인터
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int answer = 0;

        for(int i = 0; i < n; i++) {
            if(arr[i] == c) {
                answer = 1;
                break;
            }
            
            int target = c - arr[i];

            int left = i + 1;
            int right = n - 1;

            while(left < right) {
                int sum = arr[left] + arr[right];

                if(sum == target || arr[left] == target || arr[right] == target) {
                    answer = 1;
                    break;
                } else if(sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        
        System.out.println(answer);

        br.close();
    }
    
}
