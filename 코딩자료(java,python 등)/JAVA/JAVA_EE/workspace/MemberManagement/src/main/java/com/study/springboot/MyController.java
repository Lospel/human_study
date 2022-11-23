package com.study.springboot;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

	@RequestMapping("/")
	public String insert1() {
		return "createPage";
	}
	@RequestMapping("/loginForm")
	public String loginForm(HttpServletRequest req) {
		HttpSession session=req.getSession();
		if(session.getAttribute("userid")==null) {
			return "redirect:/signon";
		}
		return "loginForm";
	}
	@RequestMapping("/DoLogin")
	public String DoLogin(HttpServletRequest req) {
		String Loginid = req.getParameter("Loginid1"); 
		String passcode = req.getParameter("passcode1");
		
		HttpSession session = req.getSession();
		if(Loginid.equals(session.getAttribute("userid")) && passcode.equals((session.getAttribute("passcd")))) {
		System.out.println("로그인에 성공하였습니다.");
		return "loginOK";
		} else {
		System.out.println("옳바른 아이디와 비밀번호를 입력해주세요.");
		return "redirect:/";
		}
	}
	@RequestMapping("/register")
	public String register(HttpServletRequest req, Model model) {
		HttpSession session=req.getSession();
		
		String loginid=req.getParameter("Lodinid");
		String passcode=req.getParameter("passcode");
		String passcode1=req.getParameter("passcodeCheck");
		String name=req.getParameter("name");
		String mobile=req.getParameter("mobile");
		
		if(!passcode.equals(passcode1)) {
			return "redirect:/signon";
		}
		session.setAttribute("userid", loginid);
		session.setAttribute("passcd", passcode);
		
		model.addAttribute("Lodinid",loginid);
		model.addAttribute("passcode",passcode);
		model.addAttribute("name",name);
		model.addAttribute("mobile",mobile);	

		return "register";
	}
	@RequestMapping("/signon")
	public String signon() {
		return "signon";
	}

	@RequestMapping("/loginOK")
	public String loginOK() {
		return "loginOK";
	}
	
	@RequestMapping("/Dosignon")
	public String Dosignon(HttpServletRequest req) {
		String pw = req.getParameter("passcode"); 
		String pwC = req.getParameter("passcodeCheck");
		if(pw.equals(pwC) && pw != null) {
		System.out.println("회원가입이 완료되었습니다.");
		return "register";
		}else {
		System.out.println("비밀번호를 확인해주세요.");
		return "redirect:/signon";
	}
	}
}
