// Baekjoon 2941 : 문자열

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        String[] croatia = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int i = 0; i < croatia.length; i++) {
            if(str.contains(croatia[i])) {
                str = str.replace(croatia[i], "0");
            }
        }

        System.out.println(str.length());
        
    }
    
}
