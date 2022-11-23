package Training2.각_자리수의_합;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("세자리 정수를 입력하시오.");
        int a = input.nextInt();
        if (a < 0 || a > 999) {
            System.out.println("옳바른 세자리 정수를 입력하시오.");
            a = input.nextInt();
        }
        while(a!=0 || a<0){
            sum += a%10;
            a = a/10;
        }
        System.out.println("각 자리수의 합은 "+sum+"입니다.");
        input.close();
    }
}
