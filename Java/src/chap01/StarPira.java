package chap01;
import java.util.Scanner;
// n단의 피라미드를 출력

public class StarPira {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("n단의 피라미드를 출력합니다.");
		int n;

		do {
			System.out.print("n의 값 : ");
			n = sc.nextInt();
		} while(n <= 0);
		
		spira(n);
	}
	
	static void spira(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = n; j > i; j-- ) {
				System.out.print(" ");
			}
			for(int k = 0; k < (2*i + 1); k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
