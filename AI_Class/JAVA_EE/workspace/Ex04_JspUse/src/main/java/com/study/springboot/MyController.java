package com.study.springboot;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

	@RequestMapping("/multiple")
	public String multiple() {
		return "multiple";
	}
	@RequestMapping("/result/{dan}")
	public String result(@PathVariable String dan, Model model) {
		int n = Integer.parseInt(dan);
		if(n<2 || n>9) {
			return "redirect:/multiple";
		}
		String result="";
		for (int i=1;i<10;i++) {
			result+=(n+"X"+i+"="+n*i)+"<br>";		
		}
		model.addAttribute("Dan",n);
		model.addAttribute("result", result);
		return "result";
	}
//	@RequestMapping("/result")
//	public String result(HttpServletRequest req, Model model) {
//		String Dan = req.getParameter("Dan");
//		model.addAttribute("Dan",Dan);
//		return "result";
//	}
	@RequestMapping("/login")
	public String login() {
		System.out.println("login called");
		return "login";
	}
	@RequestMapping("/checkUser")
	public String checkUser(HttpServletRequest req, Model model) {
		String loginId = req.getParameter("Loginid");
		String pw=req.getParameter("passcode");
		System.out.println("loginId ["+loginId+"]");
		System.out.println("pw ["+pw+"]");
//	public String checkUser(Member member, Model model) {
//		String loginId = member.getLoginid();
//		String pw=member.getPasscode();
		if(!loginId.equals("rlaehdnl" ) || !pw.equals("123asd")) {
			return "redirect:/login";
		}
		model.addAttribute("Loginid",loginId);
		model.addAttribute("passcode",pw);
		return "logininfo";
	}	
	@RequestMapping("/")
	public @ResponseBody String root() throws Exception {
		return "JSP in Gradle"; // raw string 문자열 자체
	}
	
	@RequestMapping("/test1")  // URL 일부(경로)
	public String test1(Model model) {
		model.addAttribute("name","홍길동");
		model.addAttribute("gender","Male");
		model.addAttribute("age",27);
		return "test1"; // JSP 파일이름
	}
	
	@RequestMapping("/test2")  // URL 일부(경로)
	public ModelAndView test2() {
		ModelAndView mv = new ModelAndView();
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple");
		list.add("Grape");
		list.add("Peach");

		mv.addObject("lists", list);
		mv.addObject("names", "사과,포도,복숭아");
		mv.setViewName("test2");

		return mv;
	}
	
	@RequestMapping("/mt")  // URL 일부(경로)
	public String mt() {
		return "mt"; // JSP 파일이름
	}
	
	@RequestMapping("/test3/{fruit}/{flower}") 
	public String rest_test(@PathVariable String fruit,
			@PathVariable String flower,
			Model model) {
		model.addAttribute("fruit",fruit);
		model.addAttribute("flower",flower);
		return "test4";
	}
}
