// Baekjoon 1931 : Sorting, Greedy

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Meeting {
    int start;
    int end;

    public Meeting(int x, int y) {
        start = x;
        end = y;
    }

    public int getStart() {
        return this.start;
    }

    public int getEnd() {
        return this.end;
    }
}

class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Meeting[] arr = new Meeting[n];
        StringTokenizer st;
        for(int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            arr[i] = new Meeting(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(arr, (a, b) -> {
            if(a.getEnd() == b.getEnd()) {
                return a.getStart() - b.getStart();
            }
            return a.getEnd() - b.getEnd();
        });

        int cnt = 1;
        Meeting currMeeting = arr[0];
        for(int i = 1; i < n; i++) {
            if(arr[i].getStart() >= currMeeting.getEnd()) {
                currMeeting = arr[i];
                cnt++;
            }
        }

        System.out.println(cnt);
        br.close();

    }
    
}
