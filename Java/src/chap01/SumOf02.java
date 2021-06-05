package chap01;
import java.util.Scanner;

public class SumOf02 {

	static int sumof(int a, int b) {
		int min;
		int max;
		
		if(a > b) {
			min = b;
			max = a;
		}
		else {
			min = a;
			max = b;
		}
		
		int sum = 0;
		for(int i = a; i <= b; i++) {
			sum += i;
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a부터 b까지의 합을 구합니다.");
		System.out.print("a의 값 : ");
		int a = sc.nextInt();
		System.out.print("b의 값 : ");
		int b = sc.nextInt();
		
		System.out.println(a + "부터 " + b + "까지의 합 : " + sumof(a, b));
	}
	
}
