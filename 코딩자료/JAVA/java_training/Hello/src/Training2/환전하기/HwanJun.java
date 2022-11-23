package Training2.환전하기;

import java.util.Scanner;

public class HwanJun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("환전할 유로 값을 입력해주세요.");
        int Euro = input.nextInt();
        System.out.println("환전할 달러 값을 입력해주세요.");
        int Dallar = input.nextInt();

        double eurRate = 1396.13;
        double dallarRate = 1420.82;

        int euro_won = (int) (Euro*eurRate);
        int dallor_won = (int)(Dallar*dallarRate);
        int total_won = euro_won + dallor_won;

        System.out.printf("%d유로 + %d달러 = %d원 입니다.", Euro, Dallar,total_won);
        input.close();
    }
}
