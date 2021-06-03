package chap01;
import java.util.Scanner;

public class Max4 {
	
	static int max4(int a, int b, int c, int d) {
		int max = a;
		
		if(b > max) max = b;
		if(c > max) max = c;
		if(d > max) max = d;
		
		return max;		
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("네 정수의 최댓값을 구합니다.");
		System.out.print("a : "); int a = stdIn.nextInt();
		System.out.print("b : "); int b = stdIn.nextInt();
		System.out.print("c : "); int c = stdIn.nextInt();
		System.out.print("d : "); int d = stdIn.nextInt();
		
		System.out.println("최댓값 : " + max4(a,b,c,d));
	}
	
}
