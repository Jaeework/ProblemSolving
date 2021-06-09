package chap02;
import java.util.Random;
// 배열의 요소의 최댓값을 출력 (요솟수와 값을 난수로 생성)

public class MaxOfArrayRand2 {
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i = 1; i < a.length; i++) 
			if(a[i] > max)
				max = a[i];
		return max;
	}
	
	public static void main(String[] args) {
		Random rd = new Random();
		
		System.out.println("키의 최댓값을 구합니다.");
		
		int n = rd.nextInt(10) + 1;
		System.out.println("사람 수는 " + n + "명 입니다.");
		
		int[] height = new int[n];
		System.out.println("키 값은 아래와 값습니다.");
		
		for(int i = 0; i < n; i++) {
			height[i] = rd.nextInt(99) + 100;
			System.out.print(height[i] + " ");
		}
		
		System.out.println("\n최댓값은 " + maxOf(height) + "입니다.");
	}
}
