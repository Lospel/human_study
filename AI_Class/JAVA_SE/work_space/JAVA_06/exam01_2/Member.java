package exam01_2;

public class Member {
	public String id;
	public Member (String id) {
		this.id = id;
	}
	// 아래의 equals는 Object 클래스의 메서드를 오버라이드 한 것임.
	// Object 클래스의 equals는 객체의 주소를 비교하는 것임.
	// 아래 Member클래스의 equals로 오버라이딩 한 것은 
	// 주소가 아닌 Member의 id를 비교하도록 재정의 함.
	public boolean equals(Object obj) {
		// Object obj = mem2 (new Member("Blue");)
		// 상속의 자동타입변환
		if(obj instanceof Member) { 	// true가 나옴
			Member member = (Member) obj;
			// 강제타입변환.. (member는 mem2를 의미함.)
			if(this.id.equals(member.id)) { 
				// this는 mem1이고.==> this.id는 mem1.id를 의미함.
				// member.id는 mem2.id를 의미함.
				return true;
			}
		}
		return false;
	}

}
