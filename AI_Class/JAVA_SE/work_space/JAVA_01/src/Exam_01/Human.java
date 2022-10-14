package Exam_01;

public class Human {

	public static void main(String[] args) {
        int calc;    // 선언
        calc = 3+4;  // 변수에 값을 대입
        calc = 9;    // 변수에 값을 갱신
        System.out.println ("결과 = "+ calc);
        
        /*
        System.out.print ("안녕하세요");
        System.out.println ("휴먼교육센터입니다.");
        */
        
        int HUMAN, human;  // 변수의 선언
        HUMAN = 10;        // HUMAN 에 값 대입
        human = 20;		   // human 에 값 대입
        
        System.out.println ("HUMAN : "+ HUMAN);
        System.out.println ("human : "+ human);
        
        int kor = 100;
        int eng = 100;
        int sum;
        int avg;
        sum = kor + eng;
        avg = sum / 2;
        System.out.println ("Sum : " + sum);
        System.out.println ("Avg : " + avg);
        
        char human1 = 'A'; //한문장일 때는 홑따움표
        char human2 = 65;
        
        System.out.println (human1); // A가 출력됨
        System.out.println (human2);
        // human2는 65가 저장되어 있지만 ASC코드인 A가 출력됨
        System.out.println ((int)human2); // 65 출력
        // 정수형으로 형변환시 65 출력됨.
        System.out.println ("-----------------------------------");

        long human3 = 20L;
        long human4 = 1000000000L;	// LONG의 형태로 변수 선언할 때는 끝에 L을 붙여준다.
        System.out.println ("human3 : " + human3);
        System.out.println ("human4 : " + human4);
        
        double human5 = 3.14159;	// double과 float은 실수를 다루는 변수 타입임.
        System.out.println ("human5 : " + human5);
        int human6 = (int)3.14159;	// int형으로 형변환(캐스팅)을 통해서 데이터 타입을 변환할 수 있음.
        System.out.println ("human6 : " + human6);
        float human7 = 3.14159f;	// float은 실수를 다루는 변수 타입이며, 끝에 f 또는 F를 붙임.
        System.out.println ("human7 : " + human7);
        
        boolean human8 = true;		// boolean type은 true / false 2가지가 있음.
        System.out.println ("human8 : " + human8);
        
        System.out.println ("-----------------------------------");
        // 타입변환 (자동타입변환 / 강제타입변환)
        // 1. 자동타입변환 : 큰 변수에 작은 변수를 대입하는 것을 의미함.
        byte human11 = 10;			// 1byte (8bit)
        int human12 = human11;		// 4byte (32bit)
        System.out.println ("human12 : " + human12);
        // 1. (예외) 대응하기 어려운 형태
        byte human13 = -10;		// 1byte (8bit)
        // char human14 = human13;		// 이유는 char 타입은 음수가 대입될 수 없음
        
        // 2. 강제타입변환 : 메모리가 작은 변수에 큰 변수를 대입하는 것을 의미함.
        // 형변환을 위한 처리가 필요함. (캐스팅) - 강제 형변환
        int human21 = 129;			
        byte human22 = (byte) human21;	// 127 이상일 때는 이상현상 발생.
        System.out.println ("human22 : " + human22);
        System.out.println ("-----------------------------------");
        // 산술연산자 (+-*/%) ==> 이중 %는 나머지.
        double human23 = 7/3.0;		// 7을 3으로 나눔. ==> 2.333... (정수/정수일 때는 결과가 정수가 됨.)
        int human24 = 7%3;			// 7을 3으로 나누면 몫은 2이고, 나머지는 1임.
        System.out.println ("human23 : " + human23); // 2.3333
        System.out.println ("human24 : " + human24); // 나머지는 1
        System.out.println ("7 나누기 3의 몫 : " + (int)human23);		// 강제형변환

        System.out.println ("-----------------------------------");
        // 대입연산자 (+= / -=)
        
        int human31 = 1;
        human31 += 1;			// human31 = human31 +1;
        human31 += 1;			// human31 = human31 +1;
        human31 = human31 + 1;
        System.out.println ("human31 : " + human31);
        
        int human32 = 1;
        human32 -= 1;			// human31 = human31 -1;
        human32 -= 1;			// human31 = human31 -1;
        human32 = human32 - 1;
        System.out.println ("human32 : " + human32);
        
        System.out.println ("-----------------------------------");
        // 증감연산자 (++ / --)
        
        int human41 = 1;
        human41 ++;				// human41 = human41 +1;	// 무조건 1씩 증가
        System.out.println ("human41 : " + human41);
       
        int human42 = 1;
        human42 --;				// human41 = human41 -1;	// 무조건 1씩 감소
        System.out.println ("human42 : " + human42);
        
        int human43 = 99;
        int result1 = ++human43 * 10;			// ++를 한 후 *10을 함.
        System.out.println ("human43 = " + human43);
        System.out.println ("result1 = " + result1);
        // human = 100
        // result = 1000
        
        int human44 = 99;
        int result2 = human44++ * 10;			// ++는 *10 이후에 적용함. (human44 * 10) ==> human44++
        System.out.println ("human44 = " + human44);
        System.out.println ("result2 = " + result2);
        
        System.out.println ("-----------------------------------");
        // 관계연산자 (되돌림이 true / false 임.)
        
        boolean human51 = 10 > 11;
        System.out.println ("human51 : " + human51);
        boolean human52 = (10 >= 10);
        System.out.println ("human52 : " + human52);
        boolean human53 = (10 != 10);		// 10과 10이 같지 않은가? false
        System.out.println ("human53 : " + human53);
        boolean human54 = (10 == 10);
        System.out.println ("human54 : " + human54);		// 10과 10이 같은가? true

        
        System.out.println ("-----------------------------------");
        // 논리연산자 : 관계연산과 관계연산의 논리를 반환 (true / false)
        boolean human61 = (10 < 11) && (9 < 11);	// true and true ==> true 그외는 모두 false
        System.out.println ("human61 : " + human61);
        boolean human62 = (10 < 11) || (9 < 11);	// false or false ==> false 그외는 모두 true
        System.out.println ("human62 : " + human62);
        boolean human63 = (10 < 11) ^ (9 < 11);	// true ^ true ==> false / 2개가 같으면 false, 다르면 true
        System.out.println ("human63 : " + human63);
        boolean human64 = !(10 < 11); // !true ==> false ==> 무조건 반대값.
        System.out.println ("human64 : " + human64);

        System.out.println ("-----------------------------------");
        // 문자열 연산자 : 문자열끼리 더함.
        
        String human71 = "휴먼";
        String human72 = "교육";
        String human73 = human71 + human72 + "센터";
        System.out.println("human73 : " + human73);

	}
	
}
