package cn.edu.ccut.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import cn.edu.ccut.App;

@RunWith(SpringRunner.class)
@SpringBootTest(classes={App.class})
public class SpringBootTest01 {
	
	@Test
	public void testInit(){
		System.out.println("hello spring boot");
	}
}
