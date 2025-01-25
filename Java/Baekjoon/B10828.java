// Baekjoon 10828 스택 : Stack

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Stack {
    private int[] stack;
    private int top;

    public Stack(int n) {
        this.top = -1;
        stack = new int[n];
    }

    public void push(int x) {
        top++;
        stack[top] = x;
    }

    public int pop() {
        if(top == -1) return -1;
        
        int pop = stack[top--];
        return pop;
    }

    public int size() {

        return top + 1;
    }

    public int empty() {
        if(top == -1) return 1;

        return 0;
    }

    public int top() {
        if(top == -1) return -1;

        return stack[top];
    }

}

class Solution {

    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        Stack stack = new Stack(n);
        for(int i = 0; i < n; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            
            switch (st.nextToken()) {
                case "push":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "pop":
                    System.out.println(stack.pop());
                    break;
                case "top":
                    System.out.println(stack.top());
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    System.out.println(stack.empty());
                    break;
                default:
                    break;
            }

        }

        br.close();

        
    }
    
}
