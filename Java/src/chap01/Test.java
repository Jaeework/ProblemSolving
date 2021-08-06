package chap01;

import java.util.Scanner;

// 재귀함수 - 팩토리얼
public class Test {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		do {
			System.out.print("양의 정수 n 입력 : ");
			n = sc.nextInt();
		} while(n <= 0);
		
		System.out.println(facto(n));
	}
	
	static int facto(int n) {
		
		if(n == 1) {
			return 1;
		} else {
			return n * facto(n - 1);
		}
	}
}
