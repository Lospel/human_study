package exam09.userinfo.web;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import exam09.domain.userinfo.UserInfo;
import exam09.domain.userinfo.dao.UserInfoDao;
import exam09.domain.userinfo.dao.mysql.UserInfoMysqlDao;
import exam09.domain.userinfo.dao.oracle.UserInfoOracleDao;

public class UserInfoClient {

	public static void main(String[] args) throws IOException {
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("human");
		userInfo.setPassword("12345");
		userInfo.setUserName("강현준");

		UserInfoDao uid = null;

		FileInputStream fis = new FileInputStream(
				"D:\\AI_Class\\JAVA_SE\\work_space\\JAVA_04\\src\\exam09\\userinfo\\web\\conf");
		Properties prop = new Properties();
		prop.load(fis);

		String dbType = prop.getProperty("DBTYPE");
		System.out.println("dbType : " + dbType);

		if (dbType.equals("ORACLE")) {	// 문자열은 == 는 안됨. .equals를 써야한다.
			uid = new UserInfoOracleDao();
			
		} else if (dbType.equals("MYSQL")) {
			uid = new UserInfoMysqlDao();
		
		}
		uid.insertUserInfo(userInfo);
		uid.selectUserInfo(userInfo);
		uid.deleteUserInfo(userInfo);
		
	}

}
