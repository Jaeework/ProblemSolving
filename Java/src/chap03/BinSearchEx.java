package chap03;
import java.util.Scanner;
// 이진 검색의 과정을 자세히 출력하는 프로그램을 작성.

public class BinSearchEx {
	
	static int binSearch(int[] a, int n, int key) {
		int idx = 0;
		
		System.out.printf("%4s", "|");
		
		for(int i = 0; i < n; i++)
			System.out.printf("%4d", i);
		
		System.out.print("\n---+");
		
		for(int i =0; i < n; i++)
			System.out.printf("%4s", "---");
		
		System.out.println();
		
		int pl = 0;			// 검색 범위 맨 앞의 index
		int pr = n - 1;		// 검색 범위 맨 뒤의 index
			
		do {
			int pc = (pl + pr) / 2;
			System.out.print("   |");
			if(pl != pc)
				System.out.printf(String.format("%%%ds<-%%%ds+", (pl * 4) + 1, (pc - pl) * 4), "", "" );
			
			
		} while(pl <= pr);
		
		
		return -1;		// 검색 실패
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "]");
			x[i] = sc.nextInt();
		}
		
		System.out.print("찾을 값 : ");
		int ky = sc.nextInt();
		
		int idx = binSearch(x, num, ky);
		
		System.out.println(ky + "은/는 x[" + idx + "]에 있습니다.");
	}
	
}
