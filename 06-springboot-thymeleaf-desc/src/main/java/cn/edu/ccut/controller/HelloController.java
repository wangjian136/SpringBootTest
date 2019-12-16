package cn.edu.ccut.controller;
 
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.ccut.bo.Blog;
 
@Controller
public class HelloController {
 
	@RequestMapping("/show")
	public String getMsg(Model model){
		model.addAttribute("msg", "this is thymeleaf !");
		return "/hello";
	}
	
	@RequestMapping("/show2")
	public String getMsg(HttpServletRequest request, Model model){
		model.addAttribute("msg", "this is thymeleaf !");
		model.addAttribute("time", new Date());
		model.addAttribute("sex", "男");
		model.addAttribute("num", 2);
		request.setAttribute("req", "request");
		request.getSession().setAttribute("ses", "session");
		request.getSession().getServletContext().setAttribute("app", "application");
		return "/hello2";
	}
	
	@RequestMapping("/show3")
	public String getMsg2(HttpServletRequest request, Model model){
		Map<String, Object> map = new HashMap<>();
		List<Blog> list = new ArrayList<>();
		Blog blog1 = new Blog(101, "Java", "Java开发");
		Blog blog2 = new Blog(102, "PHP", "PHP开发");
		Blog blog3 = new Blog(103, "Python", "Python开发");
		list.add(blog1);
		list.add(blog2);
		list.add(blog3);
		map.put("u1", blog1);
		map.put("u2", blog2);
		map.put("u3", blog3);
		model.addAttribute("list", list);
		model.addAttribute("map", map);
		return "/hello3";
	}
}