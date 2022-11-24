package exam09.domain.userinfo.dao;

import exam09.domain.userinfo.UserInfo;

public interface UserInfoDao {
	void insertUserInfo(UserInfo userInfo);
//	 userInfo.userId, password, userName 3가지가 담겨있음.
	void selectUserInfo(UserInfo userInfo);
	void deleteUserInfo(UserInfo userInfo);
	
}
