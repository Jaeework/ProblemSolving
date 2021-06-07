package chap01;
import java.util.Scanner;
// n단의 숫자 피라미드를 출력

public class NumPira {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("n단의 숫자 피라미드를 출력합니다.");
		int n;
		do {
			System.out.print("n의 값 : ");
			n = sc.nextInt();
		}while(n <= 0);
		
		npira(n);
	}
	
	static void npira(int n) {
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= n-i; j++) {
				System.out.print(' ');
			}
			for(int j = 1; j <= (i-1)*2+1; j++) {
				System.out.print(i % 10);
			}
			System.out.println();
		}
	}
}
