package chap02;
import java.util.Scanner;
//입력 받은 10진수를 2진수~36진수로 기수변환하여 출력(변환과정)

public class CardConvEx {
	
	static int cardConv(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.printf("%2d|      %3d\n", r, x);
		do {
			System.out.println("  +---------");
			
			if(x / r != 0) {
				System.out.printf("%2d|      %3d  ... %d\n", r, x / r, x % r);
			} else {
				System.out.printf("         %3d  ... %d\n", x / r, x % r);
			}
			d[digits++] = dchar.charAt(x % r);
			x /= r;
		} while(x != 0);
		return digits;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int no;
		int cd;
		int dno;
		char[] cno = new char[32];
		
		System.out.println("10진수를 기수 변환합니다.");
		
		do {
		System.out.print("변환하는 음이 아닌 정수 : ");
		no = sc.nextInt();
		} while(no < 0);
		
		do {
		System.out.print("어떤 진수로 변환할까요?(2-36) : ");
		cd = sc.nextInt();
		} while(cd < 2 || cd > 36);
		
		dno = cardConv(no, cd, cno);
		System.out.print(cd + "진수로 ");
		for(int i = dno - 1; i >= 0; i--) {
			System.out.print(cno[i]);
		}
		System.out.print("입니다.");
	}
	
}
