package cn.edu.ccut.exception;
 
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;
 
@ControllerAdvice
public class GlobalExceptionHandler {
	
	/**
	 * 使用@ExceptionHandler注解处理程序中出现的异常
	 * 这里展示处理ArithmeticException和NullPointerException
	 * @param e
	 * @return
	 */
	@ExceptionHandler(value={ArithmeticException.class,NullPointerException.class})
	public ModelAndView exceptionHandler(Exception e){
		ModelAndView mv = new ModelAndView();
		if(e instanceof ArithmeticException){
			mv.setViewName("error1");
		}else if(e instanceof NullPointerException){
			mv.setViewName("error2");
		}
		mv.addObject("error", e.toString());
		return mv;
	}
}