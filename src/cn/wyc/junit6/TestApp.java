package cn.wyc.junit6;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:cn/wyc/junit6/applicationContext.xml")
public class TestApp {
	@Autowired  //与junit整合，不需要在spring.xml配置扫描
	private AccountService as;
	@Test
	public void demo1() {
//		String xmlPath = "cn/wyc/junit6/applicationContext.xml";
//		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext(xmlPath);
//		AccountService as = cp.getBean("AccountServiceId" ,AccountService.class);
		as.transfer("jack", "rose", 1000);
	}
}
