package chap03;
import java.util.Scanner;
// 선형 검색(보초법)

public class SeqSearchSenFor {
	
	static int seqSearchSen(int[] a, int n, int key) {
		int i;
		a[n] = key;
		
		/*
		for(i = 0; i <= n; i++) {
			if(a[i] == key)
				break;
		}
		*/
		for(i = 0; a[i] != key; i++)
			;
		
		return i == n? -1 : i;
	}
	
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1];			// 요솟수 num + 1;
		
		for (int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값 : ");		// 키 값을 입력
		int ky = stdIn.nextInt();
		
		int idx = seqSearchSen(x, num, ky);	// 배열 x에서 값이 ky인 요소를 검색
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
	}

}
