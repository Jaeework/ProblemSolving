package chap01;
import java.util.Scanner;
// 1, 2, ..., n까지의 합을 구합니다.

public class SumForEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = sc.nextInt();
		
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			if (i < n)
				System.out.print(i + " + ");
			else
				System.out.print(i);
			sum += i;
		}
		
		System.out.println(" = " + sum);
		
	}
	
}
