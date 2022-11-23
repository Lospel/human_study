package Training2.버스카드_나이인식;

import java.util.Scanner;

public class BusCard {
    public static String getRole (int age){
        if(age>=18){
            return "성인";
        }
        else if(age>=13){
            return "청소년";
        }
        else if(age>6){
            return "어린이";
        }
        return "유아";
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        String role = getRole(age);
        System.out.println(role);
        input.close();
    }
}
