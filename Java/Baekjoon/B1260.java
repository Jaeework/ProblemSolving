// Baekjoon 1260 : DBS/BFS
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Main {

    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] visitedDFS;
    static int[] visitedBFS;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        visitedDFS = new int[n+1];
        visitedBFS = new int[n+1];

        for(int i = 0; i < n+1; i++) {
            graph.add(new ArrayList<>());
        }


        for(int i = 0; i < m; i++ ) {
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }

        for(int i = 1; i < n+1; i++) {
            Collections.sort(graph.get(i));
        }

        dfs(v);
        System.out.println();
        bfs(v);
        br.close();

    }

    private static void bfs(int v) {
        Queue<Integer> q = new LinkedList<>();
        visitedBFS[v] = 1;
        q.offer(v);

        while(!q.isEmpty()) {
            int curr = q.poll();
            System.out.print(curr + " ");

            for(int i : graph.get(curr)) {
                if(visitedBFS[i] == 0) {
                    visitedBFS[i] = 1;
                    q.offer(i);
                }
                    
            }
        }

    }

    private static void dfs(int v) {
        visitedDFS[v] = 1;
        System.out.print(v + " ");
        
        for(int i : graph.get(v)) {
            if(visitedDFS[i] == 0) dfs(i);
        }            

    }


}
