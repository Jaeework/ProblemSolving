package chap01;
import java.util.Scanner;
//b - a의 값을 구합니다(b > a).

public class Difference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("b - a의 값을 구합니다.");
		do {
			System.out.print("a의 값 : ");
			a = sc.nextInt();
			System.out.print("b의 값 : ");
			b = sc.nextInt();
		} while(a >= b);
		
		System.out.println("b - a 의 값은 " + (b - a) + " 입니다.");
	}
	
}
