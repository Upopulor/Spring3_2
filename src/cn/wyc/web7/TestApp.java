package cn.wyc.web7;

import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class TestApp {
	@Test
	public void demo1() {
		String xmlPath = "cn/wyc/junit6/applicationContext.xml";
		ClassPathXmlApplicationContext cp = new ClassPathXmlApplicationContext(xmlPath);
		AccountService as = cp.getBean("AccountServiceId" ,AccountService.class);
		as.transfer("jack", "rose", 1000);
	}
}
