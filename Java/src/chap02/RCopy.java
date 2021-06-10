package chap02;
import java.util.Scanner;
// 배열 b의 모든 요소를 역순으로 복사합니다.

public class RCopy {

	static void reverse(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void swap(int[] a) {
		for(int i = 0; i < a.length/2; i++)
			reverse(a, i , a.length - i - 1);
	}
	
	static void rcopy(int[] a, int[] b) {
		swap(b);
		int n = a.length >= b.length?b.length:a.length;
		for(int i = 0; i < n; i++)
			a[i] = b[i];
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

		System.out.println("배열 b를 배열 a에 역순으로 복사합니다.");
		rcopy(a, b);
		
		System.out.print("배열 a : ");
		print(a);
		System.out.print("배열 b : ");
		print(b);
		
	}
	
}
