import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

// Programmers 2750 : Sorting
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        //heapSort(arr);

        Arrays.sort(arr);

        for(int i = 0; i < n; i++) {
            bw.write(arr[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

    private static void heapSort(int[] arr) {
        int n = arr.length;

        for(int i = n/2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }

        for(int i = n - 1; i > 0; i--) {
            int tmp = arr[0];
            arr[0] = arr[i];
            arr[i] = tmp;

            heapify(arr, i, 0);
        }

    }

    private static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * largest + 1;
        int right = 2 * largest + 2;

        if(left < n && arr[largest] < arr[left]) largest = left;
        if(right < n && arr[largest] < arr[right]) largest = right;

        if(largest != i) {
            int tmp = arr[largest];
            arr[largest] = arr[i];
            arr[i] = tmp;

            heapify(arr, n, largest);
        }
    }

}