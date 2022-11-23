package com.study.springboot;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class ContentDto {
	@NotNull (message="아이디가 비었음")
	@NotEmpty (message="아이디가 비었음")
	String Loginid;
	@NotNull (message="비번이 비었음")
	@NotEmpty (message="비번이 비었음")
	String passcode;
	String passcodeCheck;
	@NotNull (message="이름이 비었음")
	@NotEmpty (message="이름이 비었음")
	String name;
	@NotNull (message="전화번호가 비었음")
	@NotEmpty (message="전화번호가 비었음")
	String mobile;
}
