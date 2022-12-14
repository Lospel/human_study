
public class Ex02_Class {
	/* 
	 * 클래스 : 객체(인스턴스)를 정의하는 틀, 설계도, 정의서
	 * 객체를 만들기 위한 기능 > new
	 * 클래스, 변수(필드), 메소드 들이 작성 > 객체(인스턴스)를 정의
	 * 만들려는 객체의 상태가 기능을 정의해놓은 설계도 
	 * 설계도를 이용하여 객체를 만드는 방법 new
	 * Player pa = new Player("사용자명"); 
	 * 정의된 설계도=클래스를 사용하는 방법
	 * p1:하나의 변수를 선언 > 객체라고 표현
	 * Player클래스로 만들어진 객체 
	 * 객체 = 인스턴스 같다?? > 
	 * 인스턴스: p1이라는 객체는 Player의 인스턴스, 
	 * 인스턴스는 특정객체가 어떤 클래스의 객체인지 설명할때 사용하는 단어
	 * 클래스를 인스턴스화 한다.=객체화한다.
	 * 클래스로 하나의 객체를 만드는 과정을 인스턴스화라고 한다.
	 * 클래스로 만든 하나의 객체
	 * 
	 * 객체를 정의할 때 필요한 요소
	 * 1. 변수 : 상태, 필드, 객체변수, 인스턴스변수, 클래스변수, 지역변수, 멤버변수, 속성
	 * 2. 메소드 : 기능, 함수, 변수를 활용하는 방법 
	 * +입력 : 파라미터(매개변수), 인자(아규먼트),
	 * +출력 : 리턴(반환값)
	 * 
	 */
}

class Player{
	/*
	 * static : 정적변수, 변수나 메소드(main) 둘다 사용가능
	 * static을 작성하면 인스턴스화와 상관없이 컴퓨터 메모리(자원)를 사용 
	 * > 클래스를 계속 new로 불러온다면 어디서 시작할지의 문제(static main)
	 * static 시작부터 메모리에 등록됨
	 * 
	 * 
	 * static int a=1; //클래스 변수
	 * int b = 2; //인스턴스 변수
	 * public static main{
	 * 	a; // 사용가능
	 * 	b; //사용할수 없음, 인스턴스화 new를 하면 사용가능, 에러 
	 * }
	 * 
	 * 
	 * 필드 : 클래스 내에서 사용하는 변수
	 * 클래스변수 : static 있는 변수, 객체를 사용하지 않아도 사용가능한 변수, 자주 변하지 않는 값이나 기능에 사용, 공통적인 값
	 * 인스턴스변수 : static 없는 변수, 객체를 생성해야만 사용가능한 변수, 인스턴스화 필수 
	 * 지역변수 : 메소드 내에서 사용하는 변수, 초기값이 존재해야함!!! 
	 * 전역변수 : 클래스변수, 인스턴스변수를 지칭
	 * 클래스는 정의서, new를 통해서 인스턴스와해서 객체로 만들어야 사용가능함 
	 */
	
	int hp =100;
	String name;

	/*
	 * 생성자 : 메소드, 특수한 역할이 부여된 메소드, 
	 * 등록 당시 값이 정해지지 앟은 상태로 생성
	 * 초기화되지 않음, 값이 정의 되지 않음 >> 내가 원하는 대로 사용하기 힘듦, 내가 값을 꼭 입력해야함
	 * 클래스를 선언할때, 꼭 초기화를 진행하여 값을 입력해야하는 변수들이 있을 경우
	 * 초기화하는 (입력하는) 부분을 사용자에게 맡긴다면? >> 문제 발생
	 * 해결 >> 객체가 만들어질때 (생성) >> new 동시에 실행되는 메소드
	 * 필수로 입력해야하는 변수에 대해서 어떠한 설정이 가능>> 제어가 가능
	 * 기본적으로 존재 하지만, 코드상에서는 생략되어있음
	 * 생성자를 만들때는 변수들의 초기화 또는 시작해야할 기능들을 제어
	 *  
	 */
	
	public Player(String name){ //매개변수가 하나인 생성자
		this.name = name;
	}
	
	/*
	 * 메소드 : 특정작업을 수행하기 위한 명령문(실행문)들의 집합
	 * 특정작업을 할때 코드의 반복적인 부분을 최소화하려고,
	 * 특정 작업을 하려고 만든 코드를 가독성과 유지관리를 편하게 하려고 모듈화, 부품화 하는 부분 
	 * >> 최적 : 하나의 기능만 담당하는 것이 가장 좋은 모듈화
	 * 변수 + 또다른 메소드 + 또다른 클래스 인스턴스화
	 * 
	 */
	
	public void attack() { //공격 기능을 나타나는 메소드
		// 공격합니다.
		// 공격에 대한 처리 로직을 메소드화
		// attack 방법이 여러개라면? >> 메소드화
		// 결과 출력
	}
	/*
	 * 클래스는 정의서 > 인스턴스화 > 객체로 만들면 메모리에 등록
	 * 정의서에는 상태와 기능에 대한 정의가 작성되어있어야합니다.
	 * 				변수와 메소드
	 * 변수: 클래스변수 / 인스턴스변수 / 지역변수(메소드안에 있는 변수)
	 * 
	 * 메소드: 생성자 / 클래스 메소드 / 인스턴스메소드
	 * 
	 * static 있으면 클래스 XX / 없으면 인스턴스 XX
	 * static : 메모리 바로 등록 > 바로 사용 가능
	 * 			모든 메소드에서 사용 가능한 값이며, 값을 공유 
	 * 			(new와 상관없이 사용가능하기때문에 한곳에서 바뀌면 전체에 영향을 미칩니다. >> 공통된 값에 적용)
	 * 
	 * 클래스변수 > 모든 메소드에서 사용 가능
	 * 인스턴스변수 > 인스턴스화가 필수이기 때문에 클래스메소드에서는 사용 불가능
	 * 
	 * 클래스 변수 > 클래스 메소드 > 문제없음
	 * 클래스 변수 > 인스턴스 메소드 > 문제없음
	 * 인스턴스 변수 > 클래스 메소드 > 문제발생(*)
	 * 인스턴스 변수 > 인스턴스 메소드 > 문제없음
	 * 
	 * 인스턴스 변수 : new! new할때마다 변수가 생성 > 객체명=변수명 > 독립적
	 * 클래스 변수 : new와 상관없이 사용 > 클래스이름=변수명 > 의존적(공통)
	 * 
	 * 생성자 규칙 : 클래스명과 동일한 메소드입니다.
	 * 			  클래스가 인스턴스화 될때 가장 먼저 실행
	 */
}



