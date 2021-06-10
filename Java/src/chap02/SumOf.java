package chap02;
import java.util.Random;

public class SumOf {

	static int sumOf(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {
		Random rd = new Random();
		
		int n = rd.nextInt(10) + 1;
		
		int[] x = new int[n];
		for(int i = 0; i < n; i++) {
			x[i] = rd.nextInt();
		}
		
		for(int i = 0; i < x.length; i++)
			System.out.print(x[i] + " ");
		
		System.out.println("\n배열 x의 요소들의 총 합은 " + sumOf(x) + "입니다.");
	}
	
}
