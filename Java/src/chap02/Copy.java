package chap02;
import java.util.Scanner;
// 배열 b의 모든 요소를 배열 a에 복사합니다.

public class Copy {
	
	static void copy(int[] a, int[] b) {
		int n = a.length <= b.length?a.length:b.length;
		for(int i = 0; i < n; i++) {
			a[i] = b[i];
		}
	}
	
	static void print(int[] a) {
		for(int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a의 요솟수 : ");
		int na = sc.nextInt();
		
		int[] a = new int[na];
		for(int i = 0; i < na; i++) {
			System.out.print("a[" + i + "] : ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("b의 요솟수 : ");
		int nb = sc.nextInt();
		int[] b = new int[nb];
		
		for(int i = 0; i < nb; i++) {
			System.out.print("b[" + i + "] : ");
			b[i] = sc.nextInt();
		}
		
		copy(a, b);
		
		System.out.print("배열 a : ");
		print(a);
		System.out.print("배열 b : ");
		print(b);
		
	}

}
