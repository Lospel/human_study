package com.study.springboot.jdbc;

import lombok.Data;

@Data
public class MenuDTO {
	private int id;
	private String name;
	private int price;
	private String mobile;
	private String menu;
	private int qty;
	private String created;
}
