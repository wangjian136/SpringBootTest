package cn.edu.ccut.controller;
 
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class HelloController {
 
	@RequestMapping("/show")
	public Map<String, Object> show(@Value("${msg2}") String msg){
		Map<String, Object> result = new HashMap<>();
		System.out.println("hello");
		result.put("msg", msg);
		return result;
	}
}