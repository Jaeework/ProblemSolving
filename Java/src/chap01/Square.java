package chap01;
import java.util.Scanner;
//입력한 정수를 한 변으로 하는 정사각형을 출력합니다.

public class Square {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("사각형을 출력합니다.");
		int n;
		do {
			System.out.print("단 수 : ");
			n = sc.nextInt();
		}while(n <= 0);
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
