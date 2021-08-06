package chap01;
import java.util.Scanner;

public class Test {
	
	static void triangleRB(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = n; j > i; j-- ) {
				System.out.print(" ");
			}
			for(int k = 0; k < (2*i + 1); k++) {
				System.out.print(i+1);
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = 0;
		do {
			System.out.println("a : ");
			a = stdIn.nextInt();
		}while(a <= 0);
		
		//triangleLB(a);
		//triangleLU(a);
		//triangleRU(a);
		triangleRB(a);
	}
}
