package com.study.springboot.jdbc;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface iOrder {
	ArrayList <SaleDTO> getSalesList(String start, String end);
	void addOrder(String mobile, String menu, int qty, int price);
	int getTotal(String start, String end);
}
