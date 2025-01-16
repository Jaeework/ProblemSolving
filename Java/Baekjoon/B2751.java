// Baekjoon 2751 : Sorting

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        //Arrays.sort(arr);
        mergeSort(arr, 0, n-1);

        for(int i : arr) {
            bw.write(i + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
        
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if(left >= right) return;

        int mid = left + (right - left) / 2;

        mergeSort(arr, left, mid);
        mergeSort(arr, mid + 1, right);
        merge(arr, left, mid, right);
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int[] leftArr = Arrays.copyOfRange(arr, left, mid+1);
        int[] rightArr = Arrays.copyOfRange(arr, mid+1, right+1);

        int l = 0; int r = 0; int k = left;
        while(l < leftArr.length && r < rightArr.length) {
            if(leftArr[l] <= rightArr[r]) {
                arr[k++] = leftArr[l++];
            } else {
                arr[k++] = rightArr[r++];
            }
        }

        while(l < leftArr.length) {
            arr[k++] = leftArr[l++];
        }
        
        while(r < rightArr.length) {
            arr[k++] = rightArr[r++];
        }

    }
    
}
