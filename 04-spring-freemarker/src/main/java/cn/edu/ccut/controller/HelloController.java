package cn.edu.ccut.controller;
 
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.edu.ccut.bo.Blog;
 
@Controller
public class HelloController {
 
	@RequestMapping("/show")
	public String show(Model model){
		List<Blog> blogs = new ArrayList<>();
		blogs.add(new Blog(101, "Java", "Java开发"));
		blogs.add(new Blog(102, "PHP", "PHP从入门到放弃"));
		model.addAttribute("blogs", blogs);
		return "/hello";
	}
}