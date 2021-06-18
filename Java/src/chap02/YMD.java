package chap02;
import java.util.Scanner;

public class YMD {

	int y;		// 년
	int m;		// 월(1 ~ 12)
	int d;		// 일(1 ~ 31)
	
	static final int[][] mdays = {{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}};
	
	static int isLeap(int year) {
		return (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? 1 : 0;
	}
	
	YMD(int y, int m, int d){
		this.y = y;
		this.m = m;
		this.d = d;
	}
	
	YMD after(int n) {
		YMD temp = new YMD(this.y, this.m, this.d);
		if(n < 0)
			return (before(-n));
		temp.d += n;
		
		while(temp.d > mdays[isLeap(temp.y)][temp.m-1]) {
			temp.d -= mdays[isLeap(temp.y)][temp.m-1];
			if(++temp.m > 12) {
				temp.y++;
				temp.m = 1;
			}
		}
		
		return temp;
	}
	
	YMD before(int n) {
		YMD temp = new YMD(this.y, this.m, this.d);
		
		if(n < 0) {
			return after(n);
		}
		temp.d -= n;
		
		while(temp.d < 1) {
			if(--temp.m < 1) {
				temp.y--;
				temp.m = 12;
			}
			temp.d += mdays[isLeap(temp.y)][temp.m -1];
		}
		
		return temp;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("년 : "); int y = sc.nextInt();
		System.out.print("월 : "); int m = sc.nextInt();
		System.out.print("일 : "); int d = sc.nextInt();
		YMD date = new YMD(y, m, d);
		
		System.out.println("n일 뒤의 날짜를 구합니다.");
		System.out.print("n : "); int n = sc.nextInt();
		
		YMD d1 = date.after(n);
		System.out.printf("%d일 뒤의 날짜는 %d년 %d월 %d일 입니다.\n", n, d1.y, d1.m, d1.d);
		
		System.out.println("n일 전의 날짜를 구합니다.");
		System.out.print("n : "); n = sc.nextInt();
		
		YMD d2 = date.before(n);
		System.out.printf("%d일 전의 날짜는 %d년 %d월 %d일 입니다.\n", n, d2.y, d2.m, d2.d);
	}
	
}
