package chap01;
import java.util.Scanner;
//양의 정수값의 자릿수를 구합니다.

public class DigitsNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("양의 정수의 자릿수를 구합니다.");
		int n;
		do{
			System.out.print("정수의 값 : ");
			n = sc.nextInt();
		}while(n <= 0);
		
		int cnt = 0;
		while(n > 0) {
			cnt++;
			n /= 10;
		}
		System.out.println("그 수는 " + cnt + "자리입니다.");
	}
	
}
