import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.HashSet;

// Baekjoon 28445 : Sorting
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<String> set = new HashSet<>();

        for(int i = 0; i < 2; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            set.add(st.nextToken());
            set.add(st.nextToken());
        }

        String[] parents = set.toArray(new String[set.size()]);
        Arrays.sort(parents);

        for(int i = 0; i < parents.length; i++) {
            for(int j = 0; j < parents.length; j++) {
                bw.write(parents[i] + " " + parents[j] + "\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

}