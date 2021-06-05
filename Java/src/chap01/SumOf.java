package chap01;
import java.util.Scanner;
//a부터 b까지의 합


public class SumOf {

	static int sumof(int a, int b) {
		
		int sum = (a + b) * ((b - a + 1) / 2) + ((b - a + 1) % 2 == 1?(b - a + 2) / 2 :0);
		
		return sum;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a부터 b까지의 합을 구합니다.");
		System.out.print("a의 값 : ");
		int a = sc.nextInt();
		System.out.print("b의 값 : ");
		int b = sc.nextInt();
		
		System.out.println(a + "부터 " + b + "까지의 합 : " + sumof(a,b));
	}
	
}
