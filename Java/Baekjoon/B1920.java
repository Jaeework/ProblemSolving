// Baekjoon 1920 : 이진 탐색

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

class Main {

    public static int[] arr;
 
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        arr = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0;i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int m = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0;i < m; i++) {
            int target = Integer.parseInt(st.nextToken());
            System.out.println(binarySearchIterative(target, 0, arr.length - 1));
        }

    }

    private static int binarySearch(int target, int left, int right) {
        if(left > right) return 0;
        int mid = left + (right - left) / 2;

        if(arr[mid] == target) return 1;
        else if(arr[mid] > target) return binarySearch(target, left, mid - 1);
        else return binarySearch(target, mid + 1, right);
    }

    private static int binarySearchIterative(int target, int left, int right) {

        while(left <= right) {

            int mid = left + (right - left) / 2;

            if(arr[mid] == target) return 1;
            else if(arr[mid] > target) right = mid - 1;
            else left = mid + 1;
        }

        return 0;
    }

}
