package chap01;
import java.util.Scanner;

public class Test {
	
	static int med3(int a, int b, int c) {
		if(a >= b)
			if(b >= c)
				return b;
			else if(a <= c)
				return a;
			else
				return c;
		else if(a > c)
			return a;
		else if(b > c)
			return c;
		else
			return b;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = 0;
		do {
			System.out.println("a : ");
			a = stdIn.nextInt();
		}while(a <= 0);
		
		for(int i = 0; i < a; i++) {
			for(int j = 0; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
