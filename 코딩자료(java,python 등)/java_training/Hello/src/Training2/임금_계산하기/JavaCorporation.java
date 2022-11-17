package Training2.임금_계산하기;

public class JavaCorporation {
    public static void printPay(double basePay, int hours) {
        // 메소드를 구현하세요..
        double salary = 0.0;
        if(basePay<8){
            System.out.println("ERROR: 최저시급 불이행");
        }else if(hours>60){
            System.out.println("ERROR: 제한 근무시간 초과");
        }else{
            if(hours>40){
                salary = basePay*hours*1.5;
                String a=String.format("%.2f",salary);
                System.out.println("$ "+a);
            }else{
                salary = basePay*hours;
                String a=String.format("%.2f",salary);
                System.out.println("$ "+a);
            }
        }     
    }
    public static void main(String[] args) {
        printPay(7.50, 35);
        printPay(8.20, 47);
        printPay(10.00, 73);
    }
}
