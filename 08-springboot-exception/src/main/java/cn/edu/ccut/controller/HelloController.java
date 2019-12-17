package cn.edu.ccut.controller;
 
import java.util.HashMap;
import java.util.Map;
 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class HelloController {
 
	@RequestMapping("/hello")
	@ResponseBody
	public Map<String, Object> hello(){
		Map<String, Object> result = new HashMap<>();
		int i = 1/0;
		result.put("msg", "Hello World");
		return result;
	}
	
	@RequestMapping("/show")
	public String show(){
		return "/index";
	}
	
	/**
	 * 使用@ExceptionHandler注解处理程序中出现的异常
	 * 这里展示处理ArithmeticException和NullPointerException
	 * @param e
	 * @return
	 */
	/*@ExceptionHandler(value={ArithmeticException.class,NullPointerException.class})
	public ModelAndView exceptionHandler(Exception e){
		ModelAndView mv = new ModelAndView();
		if(e instanceof ArithmeticException){
			mv.setViewName("error1");
		}else if(e instanceof NullPointerException){
			mv.setViewName("error2");
		}
		mv.addObject("error", e.toString());
		return mv;
	}*/
}