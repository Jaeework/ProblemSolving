package chap01;
import java.util.Scanner;
//직각 이등변 삼각형을 출력하는 함수

public class Triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("몇 단 삼각형 입니까? : ");
		int n;
		do {
			n = sc.nextInt();
		} while(n <= 0);
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력");
		triangleLB(n);
		
		System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력");
		triangleLU(n);
		
		System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력");
		triangleRU(n);
		
		System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력");
		triangleRB(n);
	}

	static void triangleRB(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n-i-1; j++) {
				System.out.print(' ');
			}
			for(int k = 0; k <= i; k++) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	static void triangleRU(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print(' ');
			}
			for(int k = n; k > i; k--) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	static void triangleLU(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = n; j > i; j--) {
				System.out.print('*');
			}
			System.out.println();
		}
	}

	static void triangleLB(int n) {
		for(int i = 0; i < n; i++) { 
			for(int j = 0; j <= i; j++) {
				System.out.print('*');
			}
		System.out.println();
		}
	}
}
