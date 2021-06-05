package chap01;
import java.util.Scanner;
//1부터 n까지의 합을 가우스 함수로 구합니다.

public class SumGauss {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = sc.nextInt();
		
		int sum = (1 + n) * (n / 2) + (n % 2 == 1?(n + 1) / 2 :0);
		System.out.println(sum);
	}
	
}
