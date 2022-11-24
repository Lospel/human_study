package com.study.springboot;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.springboot.jdbc.MenuDTO;
import com.study.springboot.jdbc.SaleDTO;
import com.study.springboot.jdbc.iCafe;
import com.study.springboot.jdbc.iOrder;

@Controller
public class MyController {
	
	@Autowired 
	private iCafe cafe;
	@Autowired 
	private iOrder order;
	
	@RequestMapping("/")
	@ResponseBody 
	public String root() {
		return "CafeManagement";
	}
	@RequestMapping("/menu") public String doMenu() { return "menu";}
	@RequestMapping("/order") public String doOrder() { return "order";}
	@RequestMapping("/sales") public String doSales() { return "sales";}

	@RequestMapping("/loadMenu")
	@ResponseBody
	public String doLoadMenu() {
		ArrayList <MenuDTO> mdto = cafe.loadMenu();
		JSONArray ja = new JSONArray();
		for(int i=0; i<mdto.size(); i++) {
			JSONObject jo = new JSONObject();
			jo.put("id",mdto.get(i).getId());
			jo.put("name",mdto.get(i).getName());
			jo.put("price",mdto.get(i).getPrice());
			ja.add(jo);
		}
		return ja.toJSONString();
	}
	@RequestMapping("/addMenu")
	@ResponseBody
	public String doAddMenu(HttpServletRequest req) {
		String name = req.getParameter("name");
		int price = Integer.parseInt(req.getParameter("price"));
		cafe.addMenu(name, price);
		return "ok";
	}
	@RequestMapping("/deleteMenu")
	@ResponseBody
	public String doDeleteMenu(HttpServletRequest req) {
		int id = Integer.parseInt(req.getParameter("id"));
		cafe.deleteMenu(id);
		return "ok";
	}
	@RequestMapping("/updateMenu")
	@ResponseBody
	public String doUpdateMenu(HttpServletRequest req) {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		int price = Integer.parseInt(req.getParameter("price"));
		cafe.updateMenu(id, name, price);
		return "ok";
	}
	@RequestMapping("/addOrder")
	@ResponseBody
	public String doAddOrder(HttpServletRequest req) {
		String mobile = req.getParameter("mobile");
		String menu = req.getParameter("menu");
		int qty = Integer.parseInt(req.getParameter("qty"));
		int price = Integer.parseInt(req.getParameter("price"));
		order.addOrder(mobile, menu, qty, price);
		return "ok";
	}
	@RequestMapping("/getSalesList")
	@ResponseBody
	public String doGetSalesList(HttpServletRequest req) {
		ArrayList <SaleDTO> sdto = order.getSalesList(req.getParameter("start"), req.getParameter("end"));
		JSONArray ja = new JSONArray();
		for(int i=0; i<sdto.size(); i++) {
			JSONObject jo = new JSONObject();
			jo.put("mobile",sdto.get(i).getMobile());
			jo.put("menu",sdto.get(i).getMenu());
			jo.put("qty", sdto.get(i).getQty());
			jo.put("price",sdto.get(i).getPrice());
			jo.put("created",sdto.get(i).getCreated());
			ja.add(jo);
		}
		return ja.toJSONString();
	}
	@RequestMapping("/getTotal")
	@ResponseBody
	public String doGetTotal(HttpServletRequest req) {
		int total = order.getTotal(req.getParameter("start"), req.getParameter("end"));		
		return Integer.toString(total);
	}
}