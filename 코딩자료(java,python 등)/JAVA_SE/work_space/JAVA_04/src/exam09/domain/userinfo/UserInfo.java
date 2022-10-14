package exam09.domain.userinfo;

public class UserInfo {
	private String userId;
	private String password;
	private String userName;
	
	public UserInfo() {	
	}
	// default 생성자는 생략 가능.

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
