
public class EX03_Method {
/*
 *클래스 내부에서 선언되는 명령문(실행문)들의 집합
 *	1. 중복되는 코드를 최소화하기 위한 이유
 *	2. 기능별로 코드를 묶어서 가독성을 높이기 위해
 *	3. 필요한 기능들이 묶여있기때문에 유지보수을 용이하게 하기 위해
 *	4. (접근제어자 / 반환값/ 메소드 이름 (파라미터) { 실행문...})public void exam(){}
 *
 *	5. 클래스도 정의서이기때문에 어디선가 new를 해야한다
 *	6. 메소드를 정의를 하면 어디선가 메소드를 호출해야만 쓸 수 있습니다.
 *
 *	7. 메소드 정의 / 호출
 *	7-1. 정의!
 *	7-1-1. 접근제어자 설정
 *	7-1-2. 파라미터(매개변수) 설정 : 메소드 호출했을때 메소드내에서 필요한 값을 입력해줘야할때
 *							   >>메소드내에서 사용할 초기값을 정해주는 방법 (메소드 입력값)
 *							   >>입력값, 파라미터, 매개변수, 인자, 아규먼트 ....
 *	7-1-3. 반환값(return값) 설정 : 메소드를 호출하여 여러가지 실행문들이 실행된 결과를 호출한 대상에게 돌려줄때 사용하는 방법
 *							   >> 반환값, 출력값, 돌려주는값, 리턴값 ....   
 *	
 *	7-2. 호출!
 *	7-2-1. 클래스메소드 ? / 인스턴스메소드 ?
 *			클래스 : 클래스명, 메소드명();
 *			인스턴스 : 인스턴스변수명, 메소드명();
 *	7-2-2. 인자(아규먼트) 설정 : 메소드를 호출할때 정의서에 파라미터(매개변수)가 설정되어있다면
 *							>> 인자를 넣어줘야합니다.
 *							>> 호출할 메소드 인자(순서, 갯수, 타입) = 정의된 메소드 파라미터(순서, 갯수, 타입)
 *			인자 : 호출할때 쓰는 용어
 *			파라미터 : 정의할때 쓰는 용어
 *	(*)7-2-3. 호출 > 입력값 > 메소드실행(로직) > 출력값 > 메소드를 호출한 실행라인으로 이동
 *	
 *	8. 4가지 종류
 *	- 입력과 출력이 모두 있는 메소드
 *	> 메소드 정의문
 *	> 메소드 호출문
 *
 *	- 입력과 출력이 모두 없는 메소드
 *
 *	- 입력은 있고, 출력은 없는 메소드
 *
 *	- 입력은 없고, 출력은 있는 메소드
 */
	
/*	
 	 *	- 입력과 출력이 모두 있는 메소드
	 *	> 메소드 정의문
	 *	> 메소드 호출문
*/
	int sum(int a, int b) {
		return a+b;
	}

/*	- 입력과 출력이 모두 없는 메소드 */	
	void say() {
	    System.out.println("Hi");
	}
/*	- 입력은 있고, 출력은 없는 메소드 */
	String hello() {
	    return "Hi";
	}
/* - 입력은 없고, 출력은 있는 메소드 */	
	void num(int c, int d) {
	    System.out.println(c+"과 "+d+"의 합은 "+(c+d)+"입니다.");
	}
	
	
}
