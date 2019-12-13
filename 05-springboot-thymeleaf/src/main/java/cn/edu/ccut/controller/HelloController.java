package cn.edu.ccut.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
 
@Controller
public class HelloController {
 
	@RequestMapping("/show")
	public String getMsg(Model model){
		model.addAttribute("msg", "this is thymeleaf !");
		return "/hello";
	}
}