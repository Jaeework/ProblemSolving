package chap02;
// 구성 요소의 자료형이 int형인 배열 (구성 요솟수는 5 : new 에 의해 본체를 생성)

public class IntArray {
	public static void main(String[] args) {
		int[] a = new int[5];
		
		a[1] = 37;
		a[2] = 51;
		a[4] = a[1] * 2;
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
	}
}
