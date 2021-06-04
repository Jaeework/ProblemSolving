package chap01;
import java.util.Scanner;


public class Min3 {

	static int min3(int a, int b, int c) {
		int min = a;
		if(b < min) min = b;
		if(c < min) min = c;
		
		return min;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		
		System.out.println("세 정수의 최솟값을 구합니다.");
		System.out.print("a : ");
		a = sc.nextInt();
		System.out.print("b : ");
		b = sc.nextInt();
		System.out.print("c : ");
		c = sc.nextInt();
		
		int min = min3(a, b, c);
		
		System.out.println("최솟값 : " + min);
		
	}
	
}
