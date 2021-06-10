package chap02;
import java.util.Scanner;

public class ReverseArrayEx {

	static void swap(int[] a, int idx1, int idx2) {
		int tmp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = tmp;
		System.out.println("a[" + idx1 + "]과(와) a[" + idx2 + "]를 교환합니다.");
	}
	
	static void reverse(int[]a) {
		for(int i = 0; i < a.length / 2; i++) {
			swap(a, i, a.length - i - 1);
			for(int j = 0; j < a.length; j++)
				System.out.print(a[j] + " ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int n = sc.nextInt();
		
		int[] x = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = sc.nextInt();
		}
		reverse(x);
		
		System.out.println("역순 정렬을 마쳤습니다.");
	}
	
}
