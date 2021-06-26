package chap03;
import java.util.Scanner;

public class SeqSearchEx {
	
	static int seqSearch(int[] a, int n, int key) {
		System.out.print("   |");
		for(int i = 0; i < n; i++) {
			System.out.printf("%4d", i);
		}
		System.out.print("\n---+");
		for(int i = 0; i < n; i++) {
			System.out.printf("%4s", "----");
		}
		System.out.println();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("%4s", "|");
			System.out.printf(String.format("%%%ds*\n", (i*4)+3), "");
			System.out.printf("%3d|", i);
			for(int k = 0; k < n; k++)
				System.out.printf("%4d", a[k]);
			System.out.println("\n   |");
			if(a[i] == key)
				return i;
		}
		
		return -1;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int ky = stdIn.nextInt();
		
		int idx = seqSearch(x, num, ky);
		
		System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
		
	}
	
}
