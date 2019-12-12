package cn.edu.ccut.controller;
 
import java.util.HashMap;
import java.util.Map;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
 
@Controller
public class HelloController {
 
	@RequestMapping("/hello")
	@ResponseBody
	public Map<String, Object> hello(){
		Map<String, Object> result = new HashMap<>();
		result.put("msg", "Hello World");
		return result;
	}
}