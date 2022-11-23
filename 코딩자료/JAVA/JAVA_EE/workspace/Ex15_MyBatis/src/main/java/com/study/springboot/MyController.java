package com.study.springboot;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.study.springboot.jdbc.MyDAO;
import com.study.springboot.jdbc.bbsDTO;

@Controller
public class MyController {
	@Autowired
	private MyDAO myDao;
	
	@RequestMapping("/")
	public @ResponseBody String root() {
		return "Web is working well";
	}
	@RequestMapping("/list")
	public String showList(Model model) {
		model.addAttribute("list",myDao.list());
		return "list";
	}
	@RequestMapping("/insertForm")
	public String insertForm() {
		return "insert";
	}
	@RequestMapping("/insert")
	public String insert(HttpServletRequest req) {
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		String writer = req.getParameter("writer");
		myDao.insert(title,content,writer);
		return "redirect:/list";
	}
	@RequestMapping("/view/{id}")
	public String view(@PathVariable int id, Model model) {
//		int bbsid = Integer.parseInt(id);
//		bbsDTO bdto = myDao.view(bbsid);
//		model.addAttribute("post",bdto);
		model.addAttribute("post",myDao.view(id));
		return "view";
	}
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		myDao.delete(id);
		return "redirect:/list";
	}
	@RequestMapping("/updateForm/{id}")
	public String updateForm(@PathVariable int id, Model model) {
		model.addAttribute("post",myDao.view(id));
		return "update";
	}
	@RequestMapping("/update")
	public String update(HttpServletRequest req) {
		int id = Integer.parseInt(req.getParameter("id"));
		String title = req.getParameter("title");
		String content = req.getParameter("content");
		String writer = req.getParameter("writer");
		myDao.update(id, title, content, writer);
		return "redirect:/list";
	}
}
